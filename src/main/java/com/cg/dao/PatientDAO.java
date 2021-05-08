package com.cg.dao;
/**
-File Name          : PatientDao
-Author Name        : Capgemini
-Description        : Repository for Patient Entity
-Creation Date		: 13/04/2021
-Last Modified Date : 13/04/2021
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Patient;

@Repository("patient")
public interface PatientDAO extends JpaRepository<Patient, Integer> {
	/*******************************************************************************
	 - Method Name      : viewPatientByName
	 - Input Parameters : String name
	 - Return type      : List<Patient>
	 - Author           : Capgemini
	 - Creation Date    : 12/04/2021
	 - Description      : Retrieving a list of Patient by name from the database.
	  ******************************************************************************/ 

	public List<Patient> viewPatientByName(String name);
	
}
