package com.example.Project.Exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.ui.Model;

import java.util.Date;

import com.example.Project.Exceptions.ApiErrors;

@ControllerAdvice

public class NoSuchElementException extends RuntimeException
{
	private String message;
	
	
	public NoSuchElementException()
	{
		super();
	}
	
	public NoSuchElementException(String message)
	{
		super(message);
	}
} 


