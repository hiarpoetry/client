
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<% String message = (String)request.getAttribute("success");%>

<script type="text/javascript">
    alert("Successfully Registered!");
</script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="Registration_Form.css">


<meta charset="ISO-8859-1">

<title>Client Registration</title>

</head>

<body>


	<br>
	<br>
	<br>


<div class= "container">


<form action="addRegularClient" method="post">
	<table>		
	
			<tr>
				<td><h1 for="title">    Client Registration   </h1></td>
			</tr> 
	
			<div class="form-group">
			<tr>
				<td><br><label for="firstName">First Name</label></td>
				<td><input type="text" name="F_Name" class="form-control"  /></td>
			</tr>
			</div>
			
			<div class="form-group">
			<tr>
				<td><label for="lastName">Last Name</label></td>
				<td><input type="text" name="L_Name" class="form-control" required /></td>
			</tr>
			</div>			

			<div class="form-group">
			<tr>
				<td><label for="nic">NIC No:</label></td>
				<td><input type="text" name="nic" class="form-control" required /></td>
			</tr>
			</div>
		
			
			<tr><td><br></td></tr>
			
			
			<tr>
				<td><label for="houseNo">House No</label></td>
				<td><input type="text" name="H_Number" class="form-control"  required/></td>
			</tr>
			
			<tr>
				<td><label for="lane">Lane</label></td>
				<td><input type="text" name="Lane" class="form-control" ></td>
			</tr>
			
			<tr>
				<td><label for="street">Street</label></td>
				<td><input type="text" name="Street" class="form-control" ></td>
			</tr>
			
			<tr>
				<td><label for="town">Town</label></td>
				<td><input type="text" name="Town" class="form-control" ></td>
			</tr>
			
			<tr>
				<td><label for="city">City</label></td>
				<td><input type="text" name="City" class="form-control" required></td>
			</tr>
						
			<tr>
			<td><label for="district">District</label></td>
			
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
				<td><label for="province">Province</label></td>
				<td>
					
					<select style="width:200px;">
						<option value="Central Province">Central Province </option>
						<option value= "Eastern Province"> Eastern Province</option>
						<option value= "Western Province" selected> Western Province</option>
						<option value= "Northern Province"> Northern Province</option>
						<option value="Southern Province"> Southern Province</option>
						<option value="North Western Province"> North Western Province</option>
						<option value="North Central Province"> North Central Province</option>
						<option value="Uva Province"> Uva Province</option>
						<option value="Sabaragamuwa Province"> Sabaragamuwa Province</option>
					</select>
					
				</td>
			</tr>
			
			<tr>
				<td><label for="postCode">Postal Code</label></td>
				<td><input type="number" name="Postalcode" class="form-control" required></td>
			</tr>
			
			<tr>
				<td><label for="email">Email</label></td>
				<td><input type="text" name="email" class="form-control" required></td>
			</tr>
			
			<tr>
				<td><label for="contactNo">Contact No</label></td>
				<td><input type="text" name="conact_no" class="form-control" maxlength = "10" required></td>
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