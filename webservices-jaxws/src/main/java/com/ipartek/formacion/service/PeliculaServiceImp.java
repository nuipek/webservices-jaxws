package com.ipartek.formacion.service;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.ipartek.formacion.pojo.Genero;
import com.ipartek.formacion.pojo.Pelicula;



public class PeliculaServiceImp implements PeliculaService {

	Set<Pelicula> peliculas;
	
	public PeliculaServiceImp() {
	super();
	peliculas = new TreeSet<Pelicula>();
	init();
	}
	
	private void init() {
		Pelicula peli = new Pelicula();
		Genero genero = new Genero();
		peli.setCodigo(1);
		peli.setTitulo("El señor de los anillos");
		peli.setFestreno(new Date());
		genero.setNombre("Fantastica");
		peli.setGenero(genero);
		peliculas.add(peli);
		
		peli = new Pelicula();
		genero = new Genero();
		peli.setCodigo(2);
		peli.setTitulo("Kill Bill");
		peli.setFestreno(new Date());
		genero.setNombre("Accion");
		peli.setGenero(genero);
		peliculas.add(peli);
		
		
		peli = new Pelicula();
		genero = new Genero();
		peli.setCodigo(3);
		peli.setTitulo("Star Wars Episode IV: Una nueva Esperanza");
		peli.setFestreno(new Date());
		genero.setNombre("Ciencia Ficcion");
		peli.setGenero(genero);
		peliculas.add(peli);
		
	}

	@Override
	public Pelicula getById(int codigo) {
		boolean encontrado = false;
	    Pelicula pelicula = encontrarPorCodigo(codigo);
	 	return pelicula;
	}

	private Pelicula encontrarPorCodigo(int codigo) {
		boolean encontrado = false;
		Pelicula pelicula = null;
		
		Iterator<Pelicula> it = peliculas.iterator();
	    
	    while(it.hasNext() && encontrado == false)
	    {
	      Pelicula aux =  it.next();
	      if (aux.getCodigo() == codigo){
	    	encontrado = true;
	    	pelicula = aux;  
	      }
	    	
	    }// fin del while
		
	    return pelicula;
	}

	@Override
	public Set<Pelicula> getAll() {
		
		return peliculas;
	}

}
