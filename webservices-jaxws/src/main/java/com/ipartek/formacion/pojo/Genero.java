package com.ipartek.formacion.pojo;

import java.io.Serializable;

public class Genero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9040764334608723193L;
	
	private String nombre;
	
	public Genero()
	{
	  super();	
	  nombre = "comedia";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Genero [nombre=" + nombre + "]";
	}
	
	
	
	

}
