package com.wipro.hr.ems.exception;

public class SMSException extends RuntimeException  {
	        //student management system
	private String info;
	
	public SMSException(String info)
	{
		this.info = info;
	}
	
	public String getInfo()
	{
		return this.info;
	}

}
