package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebService;

// Se indica que la interfaz soap que implementa la clase para trabajar
@WebService(endpointInterface = "com.ipartek.formacion.ws.helloworld.HelloWorldWS")
public class HelloWorldSWImp implements HelloWorldWS {

	
	public String obtenerHolaMundo() {
		
		return "Hola Mundo";
	}



}
