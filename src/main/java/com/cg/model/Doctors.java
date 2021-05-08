package com.cg.model;
/**
-File Name          : Doctors
-Author Name        : Capgemini
-Description        : Doctors Model class 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
import java.util.List;
import com.cg.entities.*;
public class Doctors {

	
	private List<Doctor> doctors;
	
	public Doctors()
	{
		
	}
	public Doctors(List<Doctor> doctors) {
		super();
		this.doctors = doctors;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
}
