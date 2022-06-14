package com.example.Project.Exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.ui.Model;
import java.time.LocalDate;

import com.example.Project.Exceptions.ApiErrors;

@ControllerAdvice

public class EmployeeNotFound extends RuntimeException
{
	private String message;
	private int status;
	
	public EmployeeNotFound()
	{
		super();
	}
	
	public EmployeeNotFound(String message)
	{
		super(message);
	}
} 


