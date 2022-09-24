package com.servicios;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class SinEstadoBean
 */
@Stateless
public class SinEstadoBean implements SinEstadoBeanRemote {

    /**
     * Default constructor. 
     */
    public SinEstadoBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String saludar(String nombre) {
		// TODO Auto-generated method stub
		return "Hola, " + nombre;
	}

}
