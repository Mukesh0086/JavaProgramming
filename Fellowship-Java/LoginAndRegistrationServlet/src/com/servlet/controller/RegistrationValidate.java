package com.servlet.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class RegistrationValidate
 */
@WebFilter("/register")
public class RegistrationValidate implements Filter {

	/**
	 * Default constructor.
	 */
	public RegistrationValidate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		boolean validate = false;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String uname = req.getParameter("userName");
		String phone = req.getParameter("phoneNumber");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		if (password.length() > 5 && fname.length() > 2 && lname.length() > 1 && uname.length() > 3
				&& email.contains("@") && email.contains(".com") && phone.matches("[0-9]+") && phone.length() == 10) {
			validate = true;
			chain.doFilter(request, response);

		} else {
			validate = false;
			res.sendRedirect("invalidDetails.jsp");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
