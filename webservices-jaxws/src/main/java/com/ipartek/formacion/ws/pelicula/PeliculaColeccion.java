package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaColeccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7391234389244622520L;
	
	private List<Pelicula> peliculas;
	
	public PeliculaColeccion(){
		super();
		peliculas = new ArrayList<Pelicula>();
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public void setPeliculas(Collection<Pelicula> peliculas) {
		this.peliculas.addAll(peliculas);
	}
	
	


}
