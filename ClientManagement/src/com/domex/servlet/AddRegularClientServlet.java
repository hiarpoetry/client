package com.domex.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domex.model.RegularClient;

import service.IRegularClientService;
import service.RegularClientService;

/**
 * Servlet implementation class AddRegularClientServlet
 */
@WebServlet("/AddRegularClientServlet")

public class AddRegularClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRegularClientServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		RegularClient regularClient = new RegularClient();
		
		String firstName = request.getParameter("F_Name");
		String lastName = request.getParameter("L_Name");
		String nic = request.getParameter("nic");
		String addressNo = request.getParameter("H_Number");
		String lane = request.getParameter("Lane");
		String street = request.getParameter("Street");
		String town = request.getParameter("Town");
		String city = request.getParameter("City");
		String postalCode = request.getParameter("PostalCode");
		String email = request.getParameter("Email");
		String province = request.getParameter("Province");
		String contact_no = request.getParameter("contact_no");
		
		//validation
		
		
		if(regularClient.getLastName().isEmpty() || regularClient.getContactNo().isEmpty() || regularClient.getEmail().isEmpty() || regularClient.getNic().isEmpty() || regularClient.getCity().isEmpty() || regularClient.getPostalCode() == 0 ){
						
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please fill out all the required fields');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
			
		} //not successful
		else if(!firstName.matches("``^[a-zA-Z]+$`" ) || !lastName.matches("``^[a-zA-Z]+$`" )){
			
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Name should be letters only');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
			
			
		}
		else if(!nic.matches("[0-9]{9}[x|X|v|V]$" )){
			
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('NIC should be digits only');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
			
			
		}
		else if(postalCode.length() > 6 || !postalCode.matches("^\\d{5}$")){
			
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please enter a valid postal code');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
			
			
		}
		else if(!lane.matches("[A-Za-z0-9,]+" ) || !street.matches("[A-Za-z0-9,]+" ) || !town.matches("[A-Za-z0-9,]+" ) || !city.matches("[A-Za-z0-9,]+" )){
			
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please enter a valid address');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
			
			
		}
		else if(!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
			
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please enter a valid email address');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
		}
		
		else if(!contact_no.matches("0((11)|(2(1|[3-7]))|(3[1-8])|(4(1|5|7))|(5(1|2|4|5|7))|(6(3|[5-7]))|([8-9]1))([2-4]|5|7|9)[0-9]{6}") || !contact_no.matches("07[1,2,5,6,7,8][0-9]+")){
			
			PrintWriter out = response.getWriter();
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please enter a valid contact number');");
			out.println("location='client_registration.jsp';");
			out.println("</script>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/client_registration.jsp");
			rd.include(request, response);
			
		}
		
		else {
			
			regularClient.setFirstName(request.getParameter("F_Name"));
			regularClient.setLastName(request.getParameter("L_Name"));
			regularClient.setNic(request.getParameter("nic"));
			regularClient.setAddressNo(request.getParameter("H_Number"));
			regularClient.setLane(request.getParameter("Lane"));
			regularClient.setStreet(request.getParameter("Street"));
			regularClient.setTown(request.getParameter("Town"));
			regularClient.setCity(request.getParameter("City"));
			regularClient.setPostalCode(request.getParameter("PostalCode"));
			regularClient.setEmail(request.getParameter("Email"));
			regularClient.setProvince(request.getParameter("province"));
			
			IRegularClientService iRegularClientService = new RegularClientService();
			
			int addNew = iRegularClientService.addRegularClient(regularClient);
			
			if(addNew > 0 ) {
				
				System.out.println("Successful regualar client registration");
				
				PrintWriter out = response.getWriter();
				
				out.println("<script>");
				out.println("alert('Regular Client Registered Successfully')");
				out.println("</script>");
				
				request.setAttribute("success", "Registration Successful!");
				
				RequestDispatcher dispatch = getServletContext().getRequestDispatcher("HomePage.jsp");
				dispatch.include(request, response);
				
			}
			else {
				System.out.println("Error occured");
			}
							
		}//successful
			
		//doGet(request, response);
	}

}
