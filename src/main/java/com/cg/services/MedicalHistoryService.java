package com.cg.services;

/**
-File Name          : MedicalHistoryService
-Author Name        : Capgemini
-Description        : MedicalHistory Service Interface 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
import org.springframework.stereotype.Service;

import com.cg.entities.MedicalHistory;
import com.cg.model.MedicalHistories;

@Service
public interface MedicalHistoryService {

	public MedicalHistory addMedicalHistory(MedicalHistory m);
	public MedicalHistories viewAllMedicalHistory();
	public void deleteByPatientId(int id);
	public void deleteByDoctorId(int id);
	
}
