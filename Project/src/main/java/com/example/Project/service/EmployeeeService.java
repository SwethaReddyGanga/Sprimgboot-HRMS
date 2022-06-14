package com.example.Project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Project.model.Employeee;
import com.example.Project.repository.EmployeeeRepository;
import com.example.Project.Exceptions.EmployeeNotFound;
import com.example.Project.Exceptions.NoSuchElementException;

 

@Service
public class EmployeeeService 
{
	
@Autowired
private EmployeeeRepository repo;

// list out the details based on search operation
public List<Employeee> listAll(String keyword)
{
	if(keyword!=null)
	{
		return repo.search(keyword);
	}
	List<Employeee> list= repo.findAll();
	return list;
}

//save employee

public void saveEmployeee(Employeee emp) 
{
        repo.save(emp);
}

//Update employee in table

public void updateEmployeee(Employeee emp) 
{
        repo.save(emp);
}
 

// providing service to get details from table     
public Employeee get(String id) 
{
        return repo.findById(id).orElseThrow(()->new NoSuchElementException("Employee Id is not valid"));
}

//Delete a row in the table   
   
public void deleteEmployeeeById(String id)
{
        repo.deleteById(id);
 }

}
