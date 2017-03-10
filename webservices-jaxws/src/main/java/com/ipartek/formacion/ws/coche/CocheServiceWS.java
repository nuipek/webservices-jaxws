package com.ipartek.formacion.ws.coche;

/**
 *  Si el estilo del soap es document el WSDL se tiene que generar y hacen falta todas las 
 *  librerias, si RPC el WSDL se genera en dinamicamente al lanzar la aplicacion
 */
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.ipartek.formacion.pojo.Coche;

@WebService(targetNamespace="http://com.ipartek.formacion/types" ,name = "cochews")
//@XmlSeeAlso(Coche.class) // generara el XML con la estructura de coche - codigo - nombre
@SOAPBinding(use=Use.LITERAL,style=Style.DOCUMENT)			
public interface CocheServiceWS {
	//@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",className="com.ipartek.formacion.ws.CocheColeccion")
	@WebMethod(operationName="obtenerTodos")
	public CocheColeccion getAll();
	
	//@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",className="com.ipartek.formacion.pojo.Coche")
	//@RequestWrapper()
	@WebMethod(operationName="obtenerCocheporCodigo")
	public Coche getById(@WebParam(targetNamespace="http://com.ipartek.formacion/types",mode=Mode.IN,name="codigocoche") Integer codigo);
	
}