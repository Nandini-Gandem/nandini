package com.cg.model;
/**
-File Name          : Appointments
-Author Name        : Capgemini
-Description        : Appointment Model class 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
import java.util.List;
import com.cg.entities.*;

public class Appointments {

	private List<Appointment> appointments;
	
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointments(List<Appointment> appointments) {
		super();
		this.appointments = appointments;
	}

	public Appointments()
	{
		
	}

}
