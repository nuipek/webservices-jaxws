package com.ipartek.formacion.pojo;

import java.io.Serializable;

public class Alumno implements Serializable{

	private int codigo;
	private String nombre;
	private String apellidos;
	
	
	public Alumno()
	{
		super();
		this.codigo = 0;
		this.nombre = "";
		this.apellidos = "";
	
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
		Alumno other = (Alumno) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	

}
