package com.platillos.latinoamerica.app.serviciosonline;

import com.platillos.latinoamerica.app.model.MetodoPago;
import com.platillos.latinoamerica.app.model.SolicitudPlatilloOnline;

public interface ServiciosOnline {
	
	public void solicitarPlatillo(SolicitudPlatilloOnline solicitudPlatilloOnline);
	
	public void solicitarCancelacionPlatillo(int idSolicitud);
	
	public void solicitarRastreoPedido(int idSolicitud);
	
	public void pagarSolicitudPlatillo(int idSolicitud, MetodoPago metodoPago);

}
