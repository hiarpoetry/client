package com.domex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CorporateClientService;
import service.ICorporateClient;


/**
 * Servlet implementation class DeleteCorporateClientServlet
 */
@WebServlet("/DeleteCorporateClientServlet")
public class DeleteCorporateClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DeleteCorporateClientServlet() {
       
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
		
		PrintWriter out = response.getWriter();
		
		ICorporateClient iCorporateClient = new CorporateClientService();
		
		int client_id = request.getParameter("client_id");
		
		boolean r = iCorporateClient.deleteCorporateClient(client_id);
		
		if(r == true){
			System.out.println("Deleted successfully");
			
			out.println("<script>");
			out.println("alert('Corporate Client record deleted successfully');");
			out.println("</script>");
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/ListCorporateClient.jsp");
			rd.include(request, response);
		}
		else {
			System.out.println("Error occurred");
			
			out.println("<script>");
			out.println("alert('Delete operation failed'); ");
			out.println("</script>");
		}
	}

}
