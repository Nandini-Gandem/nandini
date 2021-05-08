package com.cg.services;
/**
-File Name          : MedicalHistoryServiceImpl
-Author Name        : Capgemini
-Description        : Implements MedicalHistory Services 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.MedicalHistoryDAO;
import com.cg.entities.MedicalHistory;
import com.cg.model.MedicalHistories;

@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService{

	@Autowired
	MedicalHistoryDAO mdao;
	
	/*******************************************************************************
	 - Method Name      : addMedicalHistory
	 - Input Parameters : MedicalHistory m
	 - Return type      : MedicalHistory
	 - Author           : Capgemini
	 - Creation Date    : 12/04/2021
	 - Description      : Inserting a Medical History into the database.
	  ******************************************************************************/
	@Override
	public MedicalHistory addMedicalHistory(MedicalHistory m) {
		mdao.saveAndFlush(m);
		return m;
	}
	/*******************************************************************************
	 - Method Name      : viewAllMedicalHistory
	 - Input Parameters : 
	 - Return type      : MedicalHistories
	 - Author           : Capgemini
	 - Creation Date    : 12/04/2021
	 - Description      : Retrieving all medical histories from the database.
	  ******************************************************************************/
	@Override
	public MedicalHistories viewAllMedicalHistory() {
		return new MedicalHistories(mdao.findAll());
	}
	
	/*******************************************************************************
	 - Method Name      : deleteByPatientId
	 - Input Parameters : Integer id
	 - Return type      : Void
	 - Author           : Capgemini
	 - Creation Date    : 12/04/2021
	 - Description      : Deleting a medical history by Patient-id from the database.
	  ******************************************************************************/
	@Override
	public void deleteByPatientId(int id) {
		mdao.deleteByPatientId(id);
		
	}
	
	/*******************************************************************************
	 - Method Name      : deleteByDoctorId
	 - Input Parameters : Integer id
	 - Return type      : Void
	 - Author           : Capgemini
	 - Creation Date    : 12/04/2021
	 - Description      : Deleting a medical history by Doctor-id from the database.
	  ******************************************************************************/
	@Override
	public void deleteByDoctorId(int id) {
		mdao.deleteByDoctorId(id);
	}


}
