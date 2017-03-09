package com.ipartek.formacion.pojo;

import java.io.Serializable;

public class Coche implements Serializable{

private int codigo;
private String nombre;

public Coche(){
	super();
	this.codigo = 0;
	this.nombre = "";
	
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

@Override
public String toString() {
	return "Coche [codigo=" + codigo + ", nombre=" + nombre + "]";
}



	



}
