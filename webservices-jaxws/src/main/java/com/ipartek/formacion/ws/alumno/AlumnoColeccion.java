package com.ipartek.formacion.ws.alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoColeccion {

	
	List<Alumno> alumnos;
	
	public AlumnoColeccion(){
		super();
		this.alumnos = new ArrayList<Alumno>();
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void setAlumnos(Collection<Alumno> alumnos) {
		this.alumnos.addAll(alumnos);
	}
	
	
	
	
}
