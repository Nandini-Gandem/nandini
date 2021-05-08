package com.cg.exceptions;
/**
-File Name          : DuplicateAppointmentRecordException
-Author Name        : Capgemini
-Description        : Exception handling for DuplicateAppointmentRecordException 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
public class DuplicateAppointmentRecordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DuplicateAppointmentRecordException() {
		
	}
	public DuplicateAppointmentRecordException(String msg) {
		super(msg);
	}
	
}