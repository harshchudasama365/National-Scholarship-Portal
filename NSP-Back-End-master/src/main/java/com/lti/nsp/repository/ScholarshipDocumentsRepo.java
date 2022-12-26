package com.lti.nsp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.nsp.entity.ScholarshipApplication;
import com.lti.nsp.entity.ScholarshipDocuments;

public interface ScholarshipDocumentsRepo extends JpaRepository<ScholarshipDocuments,Integer> {
	
	@Query("Select sd from ScholarshipDocuments sd where sd.scholarship.aadhar=?1")
	ScholarshipDocuments findScholarshipDocumentsByScholarshipId(int scholarId);
	
	@Query("Select sd from ScholarshipDocuments sd where sd.scholarship.aadhar=?1")
	ScholarshipDocuments findScholarshipDocumentsByStudentId(int studentId);
	
	@Query("select sd "
			+ "from ScholarshipDocuments sd INNER JOIN sd.scholarship sa WHERE sa.aadhar = sd.scholarship.aadhar ")
	List<Object> findScholarshipsAndDocuments();
}

