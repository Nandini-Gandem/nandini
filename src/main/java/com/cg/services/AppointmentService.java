package com.cg.services;
/**
-File Name          : AppointmentService
-Author Name        : Capgemini
-Description        : Appointment Service Interface 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/

import org.springframework.stereotype.Service;

import com.cg.entities.Appointment;
import com.cg.model.Appointments;

@Service
public interface AppointmentService {

	public Appointment addAppointment(Appointment a);
	public Appointments viewAllAppointments();
	public void deleteByPatientId(int id);
	public void deleteByDoctorId(int id);
}
