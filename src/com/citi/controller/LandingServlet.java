package com.citi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.citi.db.Login_SQLite;
import com.citi.model.Contact;


public class LandingServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LandingServlet() {
		// TODO Auto-generated constructor stub
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Contact> contactDetails = Login_SQLite.selectAll();
		for(Contact contact: contactDetails) {
			System.out.println(contact);
		}
		request.setAttribute("contacts", contactDetails);
		request.getRequestDispatcher("/DemoServlet/WebContent/WEB-INF/contacts.jsp").forward(request, response);
	}
	

}
