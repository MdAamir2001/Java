<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Policy Application Form</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    background-image: url('https://prod-sitefinity-library.kappro.com/images/default-source/career-corner/starting-career/whatdoeslifeinsagentdo_09.jpg?sfvrsn=46908fd9_6');
    display: flex;
    justify-content: center;
    align-items: center;
    height: 150vh;
    margin: 0;
}
 
.container {
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    width: 400px;
    max-width: 100%;
    animation: fadeIn 1s;
}
 
h1 {
    font-size: 1.5em;
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}
 
form {
    text-align: left;
}
 
input, select {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
    font-size: 16px;
}
 
select {
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    background-size: 12px;
    background-position: 100% 50%;
    background-repeat: no-repeat;
}
 
input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    font-size: 16px;
    border: none;
    cursor: pointer;
    padding: 10px 20px;
    border-radius: 5px;
    transition: background-color 0.3s;
}
 
input[type="submit"]:hover {
    background-color: #0056b3;
}
 
@keyframes fadeIn {
    from {
        opacity: 0;
        transform: translateY(-20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}
</style>
<body>
<%int id = (int)request.getAttribute("id"); %>
<div class="container">
    <h1>Policy Application Form</h1>
    <form action="/add-policy" method="post">
    	Policy Name:
    	<select name="policyName" id="policyname" onchange="myPolicyFunction()">
            <option value="Life">Life Insurance</option>
            <option value="Health">Health Insurance</option>
            <option value="Vehicle">Vehicle Insurance</option>
     	</select><br/>
        
        
        Coverage Amount:
        <select name="coverageAmt" >
            <option value="2000000">20 Lakhs</option>
            <option value="1500000">15 Lakhs</option>
            <option value="1000000">10 Lakhs</option>
     
        </select><br>
        
        Policy Term:<select name="policyTerm" id="policytermlist">
          <option value="">Please select</option>  
     
        </select><br>
        
        Effective Date:<input name="effectiveDate" type="date" /><br>
        Expiry Date:<input name="expiryDate" type="date"/><br>
        
         Payment Frequency:
        <select name="paymentFrequency" >
            <option value="Monthly">Monthly</option>
            <option value="Annually">Annually</option>
            <option value="Half-Yearly">Half-Yearly</option>
            
        </select><br>
        
        Policy Owner Name: <input name="customer" value="<%=id %>" type="number"/><br>
        Beneficiary Name: <input name="beneficiaryName" type="text"/><br>
        
        Add-Ons:  <input name="policyAddOns" type="text"/><br>
  
        <input value="Pending" type="hidden" name="policyStatus"/>
       
        <input type="submit" value="Submit">
    </form>
    </div>
 
    <script type="text/javascript">
function myPolicyFunction() {
	<%int age=(int)request.getAttribute("custAge");%>
  var name = document.getElementById('policyname').value;
  console.log(name);
 
  if(name=="Health"){
	  if(age<=65&&age>=51){
		  selectElement = document.querySelector('#policytermlist');
		  let newOption1 = new Option('10 years',10);
		  let newOption2 = new Option('12 years',12);
		  let newOption3 = new Option('8 years',8);
		  selectElement.add(newOption1,undefined);
		  selectElement.add(newOption2,undefined);
		  selectElement.add(newOption3,undefined);
	  }
	  else if(age<=50&&age>=31){
		  selectElement = document.querySelector('#policytermlist');
		  let newOption1 = new Option('10 years',10);
		  let newOption2 = new Option('12 years',12);
		  let newOption3 = new Option('8 years',8);
		  selectElement.add(newOption1,undefined);
		  selectElement.add(newOption2,undefined);
		  selectElement.add(newOption3,undefined);
	  }
  }else if(name=="Life"){
	  selectElement = document.querySelector('#policytermlist');
	  let newOption1 = new Option('10 years',10);
	  let newOption2 = new Option('12 years',12);
	  let newOption3 = new Option('8 years',8);
	  selectElement.add(newOption1,undefined);
	  selectElement.add(newOption2,undefined);
	  selectElement.add(newOption3,undefined);
  }
 
}
</script>
</body>
</html>