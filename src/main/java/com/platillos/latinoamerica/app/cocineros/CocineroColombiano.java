package com.platillos.latinoamerica.app.cocineros;

import com.platillos.latinoamerica.app.model.Cocinero;

public class CocineroColombiano extends Cocinero {
	
	public CocineroColombiano() {
		System.out.println("Constructor para construir cocinero colombiano");
	  	this.cantidadPlatillosEnviados = -1;
		this.nivelRapidez = -1;
		this.nivelOrden = -1;
		this.nivelLimpieza = -1;
		this.nivelIniciativa = -1;
		this.platillosOriginales = -1;
	}

	@Override
	public String cocinar(String nombrePlatillo) {
		
		System.out.println("Cocinero de platillos colombianos");
		System.out.println("Platillo a cocinar: " + nombrePlatillo);
		
		return "Platillo: " + nombrePlatillo;
	}
	
	
	
	

}
