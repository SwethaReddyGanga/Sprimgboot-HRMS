package com.example.Project.Exceptions;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.example.Project.Exceptions.EmployeeNotFound;
import com.example.Project.Exceptions.NoSuchElementException;
import com.example.Project.Exceptions.ApiErrors;
import java.time.LocalDateTime;

@ControllerAdvice
public class Exception
{
	LocalDateTime datetime=LocalDateTime.now();

@ResponseStatus(value=HttpStatus.NOT_FOUND)
@ExceptionHandler(value=NoSuchElementException.class)
public String handleNoSuchElementException(NoSuchElementException noSuchElementException, Model model)
{
model.addAttribute("error",noSuchElementException.getMessage());
model.addAttribute("timestamp",datetime);
model.addAttribute("status",HttpStatus.NOT_FOUND);
return "errors";
}

@ResponseStatus(value=HttpStatus.NOT_FOUND)
@ExceptionHandler(value=EmployeeNotFound.class)
public String handleEmployeeNotFound(EmployeeNotFound employeeNotFound, Model model)
{
model.addAttribute("error",employeeNotFound.getMessage());
model.addAttribute("timestamp",datetime);
model.addAttribute("status",HttpStatus.NOT_FOUND);
return "errors";
}
}
