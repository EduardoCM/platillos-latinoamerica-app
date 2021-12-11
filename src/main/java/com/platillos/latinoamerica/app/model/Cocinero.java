package com.platillos.latinoamerica.app.model;

public abstract class Cocinero extends Persona {
	
	public String platillo;
	
	protected int cantidadPlatillosEnviados;
	
	protected int nivelRapidez;
	
	protected int nivelOrden;
	
	protected int nivelLimpieza;
	
	protected int nivelIniciativa;
	
	protected int platillosOriginales;
	
	
	public abstract String cocinar(String nombrePlatillo);
	
	public void servirPlatillo() {
		System.out.println("Servir platillo");
	}
	
	public void lavarPlatos() {
	  System.out.println("Lavando platos como todo cocinero");	
	}
	
	public void verInformacionCocinero() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: "+ apelldios);
		System.out.println("Nacionalidad: " + nacionalidad);
	}

}
