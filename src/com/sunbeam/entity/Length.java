package com.sunbeam.entity;

import com.sunbeam.exceptions.ExceptionLineTooLong;

public class Length {
      String message;
      
  
	public void setMessage(String message) {
		if(message.length()>80)
		{
		throw new ExceptionLineTooLong("The strings is too long");
		}
		this.message = message;
		 
	}


	@Override
	public String toString() {
		return " [message=" + message + "]";
	}
      
      
}
