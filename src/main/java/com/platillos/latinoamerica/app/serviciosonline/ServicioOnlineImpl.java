package com.platillos.latinoamerica.app.serviciosonline;

import com.platillos.latinoamerica.app.cocina.ServicioCocina;
import com.platillos.latinoamerica.app.cocina.ServicioCocinaImpl;
import com.platillos.latinoamerica.app.cocineros.CocineroColombiano;
import com.platillos.latinoamerica.app.cocineros.CocineroEcuatoriano;
import com.platillos.latinoamerica.app.cocineros.CocineroMexicano;
import com.platillos.latinoamerica.app.cocineros.CocineroPeruano;
import com.platillos.latinoamerica.app.model.Cocinero;
import com.platillos.latinoamerica.app.model.MetodoPago;
import com.platillos.latinoamerica.app.model.SolicitudPlatilloOnline;

public class ServicioOnlineImpl implements ServiciosOnline {

	ServicioCocina servicioCocina = new ServicioCocinaImpl();
	
	/**
	 * Solicita platillo a la cocina
	 */
	@Override
	public void solicitarPlatillo(SolicitudPlatilloOnline solicitudPlatilloOnline) {
		
		Cocinero cocinero = null;
		
		switch (solicitudPlatilloOnline.pais) {
		case "Colombia":
			cocinero = new CocineroColombiano();
			break;
		case "Ecuador":
			cocinero = new CocineroEcuatoriano();
			break;
		case "Peru":
			cocinero = new CocineroPeruano();
		    break;
		case "Mexico":
			cocinero = new CocineroMexicano();
			break;

		default:
			break;
		}
		
		servicioCocina.solicitarCocinero(cocinero);
		
		
	}

	@Override
	public void solicitarCancelacionPlatillo(int idSolicitud) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarRastreoPedido(int idSolicitud) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarSolicitudPlatillo(int idSolicitud, MetodoPago metodoPago) {
		// TODO Auto-generated method stub
		
	}
	
	

}
