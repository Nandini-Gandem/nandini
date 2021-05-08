package com.cg.model;
/**
-File Name          : MedicalHistories
-Author Name        : Capgemini
-Description        : MedicalHistory Model class 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
import java.util.List;
import com.cg.entities.*;
public class MedicalHistories {
	
	private List<MedicalHistory> medicalHistories;
	
	public MedicalHistories(){
		
	}

	public List<MedicalHistory> getMedicalHistories() {
		return medicalHistories;
	}

	public void setMedicalHistories(List<MedicalHistory> medicalHistories) {
		this.medicalHistories = medicalHistories;
	}

	public MedicalHistories(List<MedicalHistory> medicalHistories) {
		super();
		this.medicalHistories = medicalHistories;
	}

}
