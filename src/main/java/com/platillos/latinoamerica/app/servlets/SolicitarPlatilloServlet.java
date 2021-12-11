package com.platillos.latinoamerica.app.servlets;

import java.io.IOException;

import com.platillos.latinoamerica.app.model.SolicitudPlatilloOnline;
import com.platillos.latinoamerica.app.serviciosonline.ServicioOnlineImpl;
import com.platillos.latinoamerica.app.serviciosonline.ServiciosOnline;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/solicitarComida")
public class SolicitarPlatilloServlet extends HttpServlet {

	private static final long serialVersionUID = 1745781258475430270L;
	
	
	private ServiciosOnline serviciosOnline = new ServicioOnlineImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nombreCliente = req.getParameter("nombreCliente");
		String nombrePlatillo = req.getParameter("nombrePlatillo");
		String pais = req.getParameter("pais");
		
		System.out.println("Nombre Cliente: " + nombreCliente);
		System.out.println("Nombre Platillo: " + nombrePlatillo);
		System.out.println("Pais: " + pais);
		
		SolicitudPlatilloOnline solicitudPlatilloOnline = new SolicitudPlatilloOnline();
		
		solicitudPlatilloOnline.nombreCliente = nombreCliente;
		solicitudPlatilloOnline.nombrePlatillo = nombrePlatillo;
		solicitudPlatilloOnline.pais = pais;
		
		serviciosOnline.solicitarPlatillo(solicitudPlatilloOnline);
		
		System.out.println("Solicitud de platillo exitosa");
	}

}
