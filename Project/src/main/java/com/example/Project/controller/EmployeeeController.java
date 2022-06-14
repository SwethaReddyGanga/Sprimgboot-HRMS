package com.example.Project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Page;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.validation.Errors;

import com.example.Project.Exceptions.EmployeeNotFound;
import com.example.Project.Exceptions.NoSuchElementException;




import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

import com.example.Project.model.Employeee;
import com.example.Project.service.EmployeeeService;

@Controller
public class EmployeeeController 
{
	
	 @Autowired
	 private EmployeeeService service;

//Search operation from index is done
	 
@RequestMapping("/")
public String viewHomePage(@Param("keyword") String keyword,Model model)
{
	List<Employeee> listemployeees=service.listAll(keyword);
	model.addAttribute("listemployeees",listemployeees);
	model.addAttribute("keyword",keyword);
	return "index";
}

//Adding new employee to the table

@GetMapping("/addEmployeee")
public String addEmployee(Model model)
{
	Employeee emp= new Employeee();
	model.addAttribute("emp", emp);
	return "add";
}
	
 //edit or update the table

@PostMapping("/updateEmployeee")
public String updateEmployeee(@ModelAttribute("Employeee") Employeee emp) 
{
	service.updateEmployeee(emp);
	return "redirect:/";
}

/*@PostMapping("/saveEmployeee")
public String saveEmployeee(@ModelAttribute("Employeee") Employeee emp) 
{
	   service.saveEmployeee(emp);
	   return "redirect:/";
}  */

@PostMapping("/saveEmployeee")
    public String submitDetails(@Valid Employeee emp, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "index";
        } else {
            model.addAttribute("successMessage", "Details saved successfully!!");
	    service.saveEmployeee(emp);
            return "success";
        }
    }

//update using id
@RequestMapping("/edit/{id}")
public ModelAndView showEditEmployeeePage(@PathVariable(name = "id") String id) 
{
	    ModelAndView mav = new ModelAndView("modify");
	    Employeee emp = service.get(id);
	    mav.addObject("Employeee",emp);
	    return mav;
}





//Delete using id
@RequestMapping("/delete/{id}")
public String deleteEmployeee(@PathVariable(value = "id") String id)
{
	this.service.deleteEmployeeeById(id);
	return "redirect:/";
}





}






































