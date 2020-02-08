package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.dao.SeaWorldDao;
import com.servlet.model.Registration;
import com.servlet.service.SeaWorldService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SeaWorldService seaWorldService=new SeaWorldDao();
		Registration registration=new Registration();
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String userName=request.getParameter("userName");
		String email=request.getParameter("email");
		long phoneNumber=Long.parseLong(request.getParameter("phoneNumber"));
		String password=request.getParameter("password");
		
		registration.setFirstName(firstName);
		registration.setLastName(lastName);
		registration.setUserName(userName);
		registration.setEmail(email);
		registration.setPhoneNumber(phoneNumber);
		registration.setPassword(password);
		
		boolean insertFlag=seaWorldService.addRegistrationData(registration);
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		if(insertFlag==true)
		{
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("username", firstName+" "+lastName);
			rd.forward(request, response);
		}
	}

}
