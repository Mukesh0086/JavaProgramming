package com.servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.SeaWorldDao;
import com.servlet.service.SeaWorldService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String submitValue=request.getParameter("submit");
		System.out.println(submitValue);
		
			
			
		if(submitValue.equalsIgnoreCase("Login")) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		else if(submitValue.equalsIgnoreCase("Register")) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("register.jsp");
			dispatcher.forward(request, response);
			
			
			
		}
		
		
		String loginUserName=request.getParameter("userName");
		String loginPassword=request.getParameter("password");
		System.out.println(loginPassword);
		SeaWorldService seaWorldService=new SeaWorldDao();
		boolean loginValidate=seaWorldService.validateLogin(loginUserName, loginPassword);
		System.out.println(loginValidate);
		if(loginValidate==true)
		{
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("loginUnsuccessful.jsp");
			
		}
		
		//response.getWriter().println("welcome to sea world  	"+name);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}