package com.cg.exceptions;
/**
-File Name          : ErrorInfo
-Author Name        : Capgemini
-Description        : ErrorInfo
-Creation Date		: 12/04/2021
-Last Modified Date : 12/04/2021
*/
public class ErrorInfo {
	
	private String url;
	private String message;
	
	 public ErrorInfo(){
		
	 }

	 
	@Override
	public String toString() {
		return "ErrorInfo [url=" + url + ", message=" + message + "]";
	}


	public ErrorInfo(String url, String message) {
		super();
		this.url = url;
		this.message = message;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	 
	 

}
