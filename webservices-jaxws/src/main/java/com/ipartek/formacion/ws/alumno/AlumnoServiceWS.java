package com.ipartek.formacion.ws.alumno;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace="http://com.ipartek.formacion/types" ,name = "alumnows")
@SOAPBinding(use=Use.LITERAL,style=Style.RPC)
public interface AlumnoServiceWS {
	
	@WebMethod
	@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",className="com.ipartek.formacion.ws.AlumnoColeccion")
	public AlumnoColeccion getAll();

}
