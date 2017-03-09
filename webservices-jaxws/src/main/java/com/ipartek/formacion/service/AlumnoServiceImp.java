package com.ipartek.formacion.service;


import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.ws.AlumnoColeccion;

public class AlumnoServiceImp implements AlumnoService {

	List<Alumno> alumnos = new ArrayList<Alumno>();
	
	public AlumnoServiceImp(){
		super();
		init();
	}
	
	
	private void init() {
	
		Alumno alumno = new Alumno();
		alumno.setCodigo(1);
		alumno.setNombre("Paco");
		alumno.setApellidos("Pil");
		alumnos.add(alumno);
		
		alumno = new Alumno();
		alumno.setCodigo(2);
		alumno.setNombre("Mikel");
		alumno.setApellidos("Egarra");
		alumnos.add(alumno);
		
		alumno = new Alumno();
		alumno.setCodigo(3);
		alumno.setNombre("Cristina");
		alumno.setApellidos("Fernandez");
		alumnos.add(alumno);
		
		alumno = new Alumno();
		alumno.setCodigo(4);
		alumno.setNombre("Yoni");
		alumno.setApellidos("Macarroni");
		alumnos.add(alumno);
		
		
	}


	@Override
	public AlumnoColeccion getAll() {
		AlumnoColeccion coleccion = new AlumnoColeccion();
		coleccion.setAlumnos(alumnos);
		return coleccion;
	}

}
