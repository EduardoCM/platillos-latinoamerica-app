package com.platillos.latinoamerica.app.cocina;

import com.platillos.latinoamerica.app.cocineros.CocineroColombiano;
import com.platillos.latinoamerica.app.cocineros.CocineroEcuatoriano;
import com.platillos.latinoamerica.app.cocineros.CocineroMexicano;
import com.platillos.latinoamerica.app.cocineros.CocineroPeruano;
import com.platillos.latinoamerica.app.model.Cocinero;
import com.platillos.latinoamerica.app.model.Mesero;

public class ServicioCocinaImpl implements ServicioCocina {

	@Override
	public void solicitarCocinero(Cocinero cocinero) {
		
		if(cocinero instanceof CocineroColombiano) {
			System.out.println("Buscando en base de datos cocinero comida colombiana");
		
		} else if(cocinero instanceof CocineroPeruano) {
			System.out.println("Buscando en la base de datos cocinero comida Peruana");
			
		} else if (cocinero instanceof CocineroEcuatoriano) {
			System.out.println("Buscando en la base de datos cocinero comida Ecuatoriana");
			
		} else if (cocinero instanceof CocineroMexicano) {
			System.out.println("Buscando en la base de datos cocinero comida Mexicana");
		}
	}

	@Override
	public Mesero solicitarMesero() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
