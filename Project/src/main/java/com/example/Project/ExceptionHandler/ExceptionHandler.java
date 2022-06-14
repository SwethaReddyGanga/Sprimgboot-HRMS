package com.example.Project;

// import org.springframework.boot.ControllerAdvice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandler
{
	public String rollbackException(Model model)
	{
		model.addAttribute("message","Rollback Exception taken place");
		return "add";
	}
}
