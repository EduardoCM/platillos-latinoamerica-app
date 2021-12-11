package com.platillos.latinoamerica.app.cocina;

import com.platillos.latinoamerica.app.model.Cocinero;
import com.platillos.latinoamerica.app.model.Mesero;

public interface ServicioCocina {
	
	void solicitarCocinero(Cocinero cocinero);
	
	Mesero solicitarMesero();

}
