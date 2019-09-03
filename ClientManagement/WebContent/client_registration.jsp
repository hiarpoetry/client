
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<style>

body{
	
	background-image:url("C:\Users\Rishi\Downloads"); //get image
	 text-align: center;
}

form{
	display: inline-block;
	border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}

button {

	margin-left : 180px 
	
}

button:hover{
	box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}

.container {
	resize: both;
  	overflow: auto;
}


</style>


<meta charset="ISO-8859-1">
<title>Order</title>
</head>
<body>


	<br>
	<br>
	<br>


<div class= "container">


<form action="addOrderServlet" method="post">
	<table>		
	
			<tr>
				<td><h1 for="exampleFormControlInput1">Customer Details</h1></td>
			</tr>
	
			<div class="form-group">
			<tr>
				<td><label for="exampleFormControlInput1">First Name</label></td>
				<td><input type="text" name="F_Name" class="form-control"  /></td>
			</tr>
			</div>
			
			<div class="form-group">
			<tr>
				<td><label for="exampleFormControlInput1">Last Name</label></td>
				<td><input type="text" name="L_Name" class="form-control"  /></td>
			</tr>
			</div>			

			<div class="form-group">
			<tr>
				<td><label for="exampleFormControlInput1">NIC No:</label></td>
				<td><input type="text" name="L_Name" class="form-control"  /></td>
			</tr>
			</div>
		
			
			<tr><td><br></td></tr>
			
			
			<tr>
				<td><label for="exampleFormControlSelect1">House No</label></td>
				<td><input type="text" name="H_Number" class="form-control"  /></td>
			</tr>
			
			<tr>
				<td><label for="exampleFormControlSelect1">Lane</label></td>
				<td><input type="text" name="Lane" class="form-control" ></td>
			</tr>
			
			<tr>
				<td><label for="exampleFormControlSelect1">Street</label></td>
				<td><input type="text" name="Street" class="form-control" ></td>
			</tr>
						
			<tr>
			<td><label for="exampleFormControlSelect1">District</label></td>
			
<%-- 			<select name="vehicle" class="form-control" id="exampleFormControlSelect1">
   <%  
		
 		ArrayList <District> list = (ArrayList<District>) request.getAttribute("listDistrict");
	%>
	
	
	<%
		// print the information about every category of the list
		for(District district : list) { %>
			
			<option name = "district" value = <%= district.getName() %> > <%= district.getName() %></option>
	<% 	
	}
	%> --%>
			</tr>
			
			<tr>
				<td><label for="exampleFormControlSelect1">Town</label></td>
				<td><input type="text" name="Town" class="form-control" ></td>
			</tr>
			
			
			<tr>
				<td><label for="exampleFormControlSelect1">PostCode</label></td>
				<td><input type="number" name="Postcode" class="form-control" ></td>
			</tr>
			
			<tr><td><br></td></tr>
			<tr>
				<td><button id = button type="submit" class="btn btn-primary">Submit</button></td>
			</tr>
			
	</table>
</form>

</div>

</body>
</html>