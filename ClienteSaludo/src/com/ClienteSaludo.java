package com;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.servicios.SinEstadoBeanRemote;

public class ClienteSaludo {

	public static void main(String[] args) throws NamingException {
		SinEstadoBeanRemote saludoBean = (SinEstadoBeanRemote) InitialContext.doLookup("ModuleEJB/SinEstadoBean!com.servicios.SinEstadoBeanRemote");
		System.out.println(saludoBean.saludar("Guillermo"));
		System.out.println("Excelente");

	}

}

