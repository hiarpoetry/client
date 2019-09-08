<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "com.domex.model.CorporateClient" %> 
<%@page import = "service.CorporateClientService" %>
<%@page import = "service.ICorporateClient" %>
<%@page import = "java.util.*" %>
<%@page import = "com.domex.servlet.DeleteCorporateClientServlet" %>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Corporate Client List</title>
</head>
<body>

	<center>
	<h3>  Corporate Client Details </h3>

	<table class="corpClientTable table-striped table-hover">
  <thead class = "thead-light">
    <tr>
      <th scope="col">Client ID</th>
      <th scope="col">Business Name</th>
      <th scope="col">Address</th>
      <th scope="col">Lane</th>
      <th scope="col">Street</th>
      <th scope="col">Town</th>
      <th scope="col">City</th>
      <th scope="col">Province</th>
      <th scope="col">Email</th>
      <th scope="col">Contact No</th>
       <th scope="col">Remove Corporate Client</th>
    </tr>
  </thead>
  <tbody>
  
  	<% 
  		ICorporateClient iCorpClientService = new CorporateClientService();
  		ArrayList<CorporateClient> corpList = iCorpClientService.listCorporateClients();
  		
  		//display each
  		for(CorporateClient corporateClient : corpList) {
  	
  	%>
  
    <tr>
      <th scope="row"> <%=corporateClient.getClientId() %> </th>
      <td><%=corporateClient.getBusinessName() %></td>
     <td><%=corporateClient.getAddressNo() %></td>
      <td><%=corporateClient.getLane() %></td>
      <td><%=corporateClient.getStreet() %></td>
      <td><%=corporateClient.getTown() %></td>
      <td><%=corporateClient.getCity() %></td>
      <td><%=corporateClient.getProvince() %></td>
      <td><%=corporateClient.getEmail() %></td>
      <td><%=corporateClient.getContactNo() %></td>
      
      <!-- delete buttons -->
      <td> 
      		<form action = "deleteCorporateClient" method = "post">
      		<input type = "submit" name = "deleteCorporateClient" value = "Remove" class="btn btn-danger btn-rounded btn-sm my-0 waves-effect waves-light"> 
      		<input type= "hidden" name = "removeCorporateClient" value = <%=corporateClient.getClientId()%>>
      	   </form> 
      
      </td>
      <!-- update buttons -->
      <td> 
      	<form action = "updateCorporateClient" method = "post">
      		<input type = "submit" name = "updateCorporateClient" value = "Edit" class="class="btn btn-default"> <i class="fas fa-magic mr-1"> </i>Edit</input>
      		<input type= "hidden" name = "editCorporateClient" value = <%=corporateClient.getClientId()%>>
      	 </form> 
      </td>
      
    </tr>
    
    <% } %>
    
  </tbody>
</table>
	</center>

</body>
</html>