<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
    <script src= "https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" ></script>
<head>
    <meta charset="utf-8" />
    <title>Update Employee Details</title>
</head>

<body>

	<div align="center">
    		<h4> Update Employee Details </h4>
<br/>
     	<div class="col-sm-4">
     	<form action="#" th:action="@{/edit}" th:object="${emp}" method="POST">
	<table>
	<div alight="left">
            <tr>
                <label class="form-label" >Employee Id</label>
                <td>
		<input type="text" th:field="*{id}"/> 
		<input type="text" th:field="*{firstName}" class="form-control" placeholder="Employee FirstName" />
		<input type="text" th:field="*{lastName}" class="form-control" placeholder="Employee LastName" />
		<input type="email" th:field="*{email}" class="form-control" placeholder="Employee Email" /> 
   		

		<input type="number" th:field="*{mobileNumber}" class="form-control" placeholder="Employee MobileNumber" min="6000000000" max="9999999999" /> 
		<label for = "designation">Choose Employee Designation </label>
			<select name="designation" id="Employee Designation">
			<option disabled selected value>---Select Designation---</option>
     			<option value="Trainee IAM Engineer">Trainee IAM Engineer</option>
      			<option value="IAM Engineer">IAM Engineer</option>
      			<option value="Senior IAM Engineer">Senior IAM Engineer</option>
      			<option value="Consultant">Consultant</option>
      			<option value="Senior Consultant">Senior Consultant</option>
     		 	<option value="IAM Architect">IAM Architect</option>
			<option value="PM">PM</option>
      			<option value="DM">DM</option>
 			</select>
		
		<label for = "location">Choose a Location </label>
			<select name="location" id="Employee Location">
			<option disabled selected value>---Select Location---</option>
      			<option value="Hyderabad">Hyderabad</option>
     			<option value="Bangalore">Bangalore</option>
 			</select><br>	<br>
	        <label for = "department">Choose a Department </label>
			<select name="department" id="Employee Department">
			<option disabled selected value>---Select Department ---</option>
      			<option value="IAM">IAM</option>
     			<option value="PAM">PAM</option>
      			<option value="AM">AM</option>
      			<option value="HR">HR</option>
      			<option value="Finance">Finance</option>
      			<option value="IT">IT</option>
     		 	<option value="PMO">PMO</option>
 			</select>	
		<input type="date" th:field="*{dateOfJoining}" class="form-control" placeholder="Employee DateOfJoining" /> 
		<input type="date" th:field="*{dateOfTermination}" class="form-control" placeholder="Employee DateOfTermination" /> 
		<input type="text" th:field="*{status}" class="form-control" placeholder="Employee Status" /> 
		</td>
	   </tr>
	</div>
	<br>
</table>
	<button type="submit" class="btn btn-info">Update</button>
	<a type="back" th:href="@{/}" class="btn-btn-primary btn-sm-mb-3">Back to Home </a>
    	</form>
</div>
</div>
</body>
</html>
