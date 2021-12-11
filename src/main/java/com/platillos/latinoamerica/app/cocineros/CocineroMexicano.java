package com.platillos.latinoamerica.app.cocineros;

import com.platillos.latinoamerica.app.model.Cocinero;

public class CocineroMexicano extends Cocinero {

	public CocineroMexicano() {
		System.out.println("Constructor para construir cocinero Mexicano");
		this.cantidadPlatillosEnviados = -1;
		this.nivelRapidez = -1;
		this.nivelOrden = -1;
		this.nivelLimpieza = -1;
		this.nivelIniciativa = -1;
		this.platillosOriginales = -1;
	}

	@Override
	public String cocinar(String nombrePlatillo) {

		System.out.println("Cocinero de platillos Mexicanos");
		System.out.println("Platillo a cocinar: " + nombrePlatillo);

		return "Platillo: " + nombrePlatillo;
	}

}
