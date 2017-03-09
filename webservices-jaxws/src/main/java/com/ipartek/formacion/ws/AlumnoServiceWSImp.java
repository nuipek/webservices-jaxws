package com.ipartek.formacion.ws;

import javax.jws.WebService;

import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.service.AlumnoServiceImp;

@WebService(endpointInterface = "com.ipartek.formacion.ws.AlumnoServiceWS")
public class AlumnoServiceWSImp implements AlumnoServiceWS {

	private AlumnoService aS = new AlumnoServiceImp();
	
	
	@Override
	public AlumnoColeccion getAll() {
		
		return aS.getAll();
	}

}
