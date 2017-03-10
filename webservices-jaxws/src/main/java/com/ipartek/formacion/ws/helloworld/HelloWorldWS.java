package com.ipartek.formacion.ws.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
// Se indica que es una interfaz soap 
@WebService(targetNamespace="http://formacion.ipartek.com")
@SOAPBinding(style=Style.RPC,use=Use.LITERAL)
public interface HelloWorldWS {

	// Se indica que es un metodo para llamar desde el cliente
	@WebMethod
	public String obtenerHolaMundo();
	

}
