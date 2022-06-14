package com.example.Project.model;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Future;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.CascadeType;
//import org.hibernate.validator.constraints.Future;
import java.util.Date; 
import java.util.Calendar;
//import javax.persistence.FetchType;

@Entity
@Table(name="Employeee")
public class Employeee {
   
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name="id")
    private String id;

    @NotNull(message="please enter first name")
@Column(name="firstName")
     @Size(min=2, max=30)
    private String firstName;

   @NotNull(message="please enter last name")
@Column(name="lastName")
    @Size(min=2, max=30)
   
    private String lastName;

    @NotNull(message="please enter email id")
@Column(name="email")
@Email
    private String email;

     @NotNull(message="please enter mobile number")
     @Column(name="mobileNumber")
     @Pattern(regexp = "[7-9][0-9]{9}", message = "Mobile number is invalid!!")
    private String mobileNumber;

   @NotNull(message="please choose one from the dropdown for designation")
@Column(name="designation")
    private String designation;

     @NotNull(message="please choose one from the dropdown for location ")
@Column(name="location")
    private String location;

     @NotNull(message="please choose one from the dropdown for department ")
@Column(name="department")
    private String department;
    
    @NotNull(message="please enter date of joining")
   @Column(name="dateOfJoining")
   @DateTimeFormat(pattern="DD/MM/YYYY")
   private String dateOfJoining;
  //Calender calender=Calender.getInstance();
   //Date date=Calender.getTime();

     @NotNull(message="please enter date of termination")
     @Column(name="dateOfTermination")
    @DateTimeFormat(pattern="DD/MM/YYYY")
   
    //@Future(message= "Date should be future")   
    private String dateOfTermination;
    
@NotNull(message = "Status can not be empty")
@Column(name="status")
    private String status;
    
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber ) {
		this.mobileNumber=mobileNumber;
	}
	public String getDesignation(){
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDateOfJoining(){
		return dateOfJoining ;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining=dateOfJoining;
	}
	public String getDateOfTermination(){
		return dateOfTermination;
	}
	public void setDateOfTermination(String dateOfTermination) {
		this.dateOfTermination=dateOfTermination;
	}
	public String getStatus(){
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}

}
