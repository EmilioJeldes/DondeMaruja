/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author emilio
 */
@WebServlet(name = "Register", urlPatterns = {"/register"})
public class Register extends HttpServlet {

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		utilidades.Utilidades.getInstancia().irAPagina(response, request, getServletContext(), "/registro.jsp");
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = (String) request.getParameter("nombre");
		String apellido = (String) request.getParameter("apellido");
		String rut = (String) request.getParameter("rut");
		String edad = (String) request.getParameter("edad");

		String estadoCivil = request.getParameter("estadocivil");
		String email = (String) request.getParameter("email");
		String telefono = (String) request.getParameter("telefono");
		String pass1 = (String) request.getParameter("pass1");
		String pass2 = (String) request.getParameter("pass2");

		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(rut);
		System.out.println(edad);
		System.out.println(estadoCivil);
		System.out.println(email);
		System.out.println(telefono);
		System.out.println(pass1);
		System.out.println(pass2);

		String fecha = request.getParameter("fecha");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null;
		try {
			startDate = sdf.parse(fecha);
		} catch (ParseException ex) {
			Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
		}

		Usuario u = new Usuario();
		u.setFechaNacimiento(startDate);

		System.out.println(sdf.format(startDate));

		utilidades.Utilidades.getInstancia().irAPagina(response, request, getServletContext(), "/login");
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
