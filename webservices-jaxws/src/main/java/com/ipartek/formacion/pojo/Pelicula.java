package com.ipartek.formacion.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pelicula implements Serializable, Comparable<Pelicula>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3587894197894538036L;
	
	private int codigo;
	private String titulo;
	private Date festreno;
	private Genero genero;
	
	public Pelicula()
	{
		super();
		this.codigo = 0;
		this.titulo="";
		this.festreno = null;
		this.genero = null;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFestreno() {
		return festreno;
	}

	public void setFestreno(Date festreno) {
		this.festreno = festreno;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", festreno=" + festreno + ", genero=" + genero
				+ "]";
	}

	@Override
	public int compareTo(Pelicula o) {
		// comparable -> ordenar 
		return this.titulo.compareToIgnoreCase(o.titulo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	
	
	
	
	
}
