fuction validateForm()
{
	let firstName= document.forms["myForm"]["fname"].value;
	if(firstName =="")
	{
		alert("Plaese fill out the First Name");
		return false;
	}
	let lastName= document.forms["myForm"]["lname"].value;
	if(lastName =="")
	{
		alert("Plaese fill out the Last Name");
		return false;
	}
	let email= document.forms["myForm"]["email"].value;
	if(email =="" || email.indexOf("@")<1)
	{
		alert("Plaese enter Valid Email");
		return false;
	}
	let mobileNumber= document.forms["myForm"]["mobileNumber"].value;
	if(mobileNumber =="" || mobileNumber.length !=10)
	{
		alert("Plaese enter a valid MObile NUmber");
		return false;
	}
}
