package com.lti.nsp.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.dto.DocumentsDto;
import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.repository.ScholarshipApplicationRepository;
import com.lti.nsp.repository.StudentRepository;
import com.lti.nsp.service.ScholarshipDocumentsService;

@RestController
@CrossOrigin
public class ScholarshipController {

	private final String FILE_BASE_PATH = "C:/Users/Admin/Documents/NSP Docs";
	@Autowired
	private ScholarshipApplicationRepository scholarApp;
	
	@Autowired
	private ScholarshipDocumentsService schAppDocsService;
	
	@Autowired
	public StudentRepository srep;

	
	@PostMapping("/applystudent")
	public ScholarshipApplication studentApply(@RequestBody ScholarshipApplication app)
	{
		ScholarshipApplication s = scholarApp.save(app);
		
		return s;
	}
	
	@PutMapping("/updatescholarapp")
	public ScholarshipApplication updateSch(@RequestBody ScholarshipApplication app)
	{
		return scholarApp.save(app);
	}
	
	@PostMapping("/upload/schdocs")
	public String uploadScholarshipDocuments(DocumentsDto docDto) {
		return schAppDocsService.uploadDocuments(docDto);
	}
	
	@GetMapping("/download/{aadhar}/{fileName}")
	public ResponseEntity<?> downloadFileFromLocal(@PathVariable String aadhar,@PathVariable String fileName) throws IOException{
		Path path = Paths.get(FILE_BASE_PATH + aadhar + "/" +fileName);
		Resource resource = null;
		try {
			resource = new UrlResource(path.toUri());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_TYPE, Files.probeContentType(path))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
		/*Resource file = fileService.download(filename);
        Path path = file.getFile()
                        .toPath();

        return ResponseEntity.ok()
                             .header(HttpHeaders.CONTENT_TYPE, Files.probeContentType(path))
                             .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
                             .body(file);*/
	}
	
	
	@GetMapping("/scholarApplications")
	public List<ScholarshipApplication> getAllApplications()
	{
		return scholarApp.findAll();
	}
	
	@GetMapping("/get/schDoc")
	public List<Object> getAll(){
		return schAppDocsService.getApplicationsAndDocs();
	}
	
	@GetMapping("/status/{aadhar}")
	public String findByStudentAadhar(@PathVariable String aadhar)
	{
		System.out.println("Reaching");
		Optional<ScholarshipApplication> sca = scholarApp.findByAadhar(aadhar);
		ScholarshipApplication application = sca.get(); 
		return application.getFinalStatus();

	}
	
	@GetMapping("/get/applicationById/{insId}")
	public List<ScholarshipApplication> getByInsId(@PathVariable String insId){
		return srep.findApplicationByInsID(insId);
	}
	
	@GetMapping("/status/getscholarApp/{aadhar}")
	public Optional<ScholarshipApplication> getscholarApp(@PathVariable String aadhar){
		return  scholarApp.findByAadhar(aadhar);
	}
	
}
