package com.platillos.latinoamerica.app.cocineros;

import com.platillos.latinoamerica.app.model.Cocinero;

public class CocineroPeruano extends Cocinero {
	
	public CocineroPeruano() {
		System.out.println("Constructor para construir cocinero peruano");
		this.cantidadPlatillosEnviados = -1;
		this.nivelRapidez = -1;
		this.nivelOrden = -1;
		this.nivelLimpieza = -1;
		this.nivelIniciativa = -1;
		this.platillosOriginales = -1;
	}

	@Override
	public String cocinar(String nombrePlatillo) {
		System.out.println("Cocinero de platillos Peruanos");
		System.out.println("Platillo a cocinar: " + nombrePlatillo);

		return "Platillo: " + nombrePlatillo;
	}
	
	

}
