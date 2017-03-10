package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;

public class PeliculaColeccionMensaje implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3588877968922529620L;
	
	private PeliculaColeccion peliculas = null;
	private String mensaje;
	
	public PeliculaColeccionMensaje() {
		super();
		peliculas = null;
		mensaje="";
	}

	public PeliculaColeccion getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(PeliculaColeccion peliculas) {
		this.peliculas = peliculas;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
    
	
	
}
