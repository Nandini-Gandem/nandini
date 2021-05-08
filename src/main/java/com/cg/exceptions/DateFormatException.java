package com.cg.exceptions;
/**
-File Name          : DateFormatException
-Author Name        : Capgemini
-Description        : Exception handling for DateFormatException 
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
public class DateFormatException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DateFormatException(){
	}
	
	public DateFormatException(String message) {
		super(message);
	}
}
