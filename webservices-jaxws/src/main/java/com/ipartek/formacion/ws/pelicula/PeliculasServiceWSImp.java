package com.ipartek.formacion.ws.pelicula;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.PeliculaService;
import com.ipartek.formacion.service.PeliculaServiceImp;

@WebService(serviceName="peliculasservice",portName="",targetNamespace="http://com.ipartek.formacion/types")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class PeliculasServiceWSImp {
	
	@Resource
	WebServiceContext webServiceContext;
	
	@WebMethod(operationName="obtenertodos")
	public PeliculaColeccionMensaje getAll(){
	    PeliculaColeccionMensaje pcm = new PeliculaColeccionMensaje();
	    
	    if (validarSolicitud())
	    {
	    	
	    	// Procesamos la solicitud
	    	PeliculaService pS = new PeliculaServiceImp();
	    	PeliculaColeccion pC = new PeliculaColeccion();
	    	pC.setPeliculas(pS.getAll());
	    	pcm.setPeliculas(pC);
	    	
	    }
	    else{
	    	pcm.setMensaje("No se cumple los requisitos de la solicitud");
	    }
	    
		return pcm;
	}
	
	
	
	private boolean validarSolicitud() {
		boolean valida = false;
		// WS-Security
		MessageContext contextoMensajes = webServiceContext.getMessageContext();
		Map<?,?> encabezados = (Map<?, ?>) contextoMensajes.get(MessageContext.HTTP_REQUEST_HEADERS);
		// El nombre del atributo de "encabezados" se llama asi porque asi se decide 
		// es una lista pq asi lo decidimos y en el cliente tambien se envia una lista 
		List<?> listparameteruser = (List)encabezados.get("user");
		List<?> listparameterpass = (List)encabezados.get("pass");
		//cogemos un identificador
		final String user = "root";
		final String password = "saparicio";
		
		if (listparameteruser != null && listparameterpass != null){
			// Aqui hariamos cualquier validacion compleja
			if (user.equals(listparameteruser.get(0).toString())
				&&	
				password.equals(listparameterpass.get(0).toString())){
				valida = true;
			}
			
		}
		
		return valida;
		
	}



	@WebMethod(operationName="obtenerporid")
	public PeliculaMensaje getById(int codigo){
		
		PeliculaMensaje pm = new PeliculaMensaje();
		
		if (validarPeticion()){
			PeliculaService pS = new PeliculaServiceImp();
			Pelicula pelicula = pS.getById(codigo);
		
			if (pelicula == null){
				pm.setMensaje("El codigo enviado no corresponde a ninguna pelicula " + codigo);
			
			}else
			{
			
				pm.setPelicula(pelicula);
			}
		}else{
			pm.setMensaje("La contraseña enviada no es correcta");
		}
		return pm;
	}
	
	
	private boolean validarPeticion(){
		boolean valida = false;
		// WS-Security
		MessageContext contextoMensajes = webServiceContext.getMessageContext();
		Map<?,?> encabezados = (Map<?, ?>) contextoMensajes.get(MessageContext.HTTP_REQUEST_HEADERS);
		// El nombre del atributo de "encabezados" se llama asi porque asi se decide 
		// es una lista pq asi lo decidimos y en el cliente tambien se envia una lista 
		List<?> listaparametros = (List)encabezados.get("sessionId");
		//cogemos un identificador
		final String sessionId = "ipsession";
		
		if (listaparametros != null){
			// Aqui hariamos cualquier validacion compleja
			if (sessionId.equals(listaparametros.get(0).toString())){
				valida = true;
			}
			
		}
		
		return valida;
	}
}
