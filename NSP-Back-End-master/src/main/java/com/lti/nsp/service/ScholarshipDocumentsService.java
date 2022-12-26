package com.lti.nsp.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import com.lti.nsp.dto.DocumentsDto;
import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.entity.ScholarshipDocuments;
import com.lti.nsp.repository.ScholarshipApplicationRepository;
import com.lti.nsp.repository.ScholarshipDocumentsRepo;

@Service
public class ScholarshipDocumentsService {
	
	@Autowired
	private ScholarshipDocumentsRepo schDocsRepo;
	
	@Autowired
	private ScholarshipApplicationRepository schAppRepo;
	
	
	public String uploadDocuments(DocumentsDto docDto) {
		ScholarshipDocuments scholarDocs = new ScholarshipDocuments();
		ScholarshipApplication sApp = schAppRepo.findByAadhar(docDto.getAadhar()).get();
	
		scholarDocs.setStudentDocuments(docDto.getStudentDocuments().getOriginalFilename()); 
		scholarDocs.setScholarship(sApp);
		
		String imageUploadLocation = "C:/Users/Admin/Documents/NSP Docs"+docDto.getAadhar()+"/";
		File f = new File(imageUploadLocation);
		if (!f.exists()) {
			f.mkdir();
		}
		String scholarshipDocuments = imageUploadLocation + docDto.getStudentDocuments().getOriginalFilename();


		try {
            FileCopyUtils.copy(docDto.getStudentDocuments().getInputStream(), new FileOutputStream(scholarshipDocuments));
            
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
		try {
			addOrUpdateScholarshipDocuments(scholarDocs);
			return "Success";
		} catch (Exception e) {
			return "Unexpected Error Occured";
		}
	}
	
	public ScholarshipDocuments addOrUpdateScholarshipDocuments(ScholarshipDocuments studentDocuments) {
		return schDocsRepo.save(studentDocuments);
	}

	public ScholarshipDocuments searchScholarshipDocumentsById(int schDocumentsId) {
		return schDocsRepo.findById(schDocumentsId).get();
	}

	public ScholarshipDocuments searchScholarshipDocumentsByScholarshipId(int scholarshipId) {
		return schDocsRepo.findScholarshipDocumentsByScholarshipId(scholarshipId);
	}
	
	public ScholarshipDocuments searchScholarshipDocumentsByStudentId(int studentId) {
		return schDocsRepo.findScholarshipDocumentsByStudentId(studentId);
	}
	
	public List<Object> getApplicationsAndDocs(){
		return schDocsRepo.findScholarshipsAndDocuments();
	}
}
