package com.ipartek.formacion.service;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Coche;

public class CocheServiceImp implements CocheService {

	private Map<Integer,Coche> coches = null;
	
	
	public CocheServiceImp() {
		super();
		init();
	}

	private void init() {
		coches = new HashMap<Integer,Coche>();
		
		Coche coche = new Coche();
		coche.setCodigo(1);
		coche.setNombre("Nissan Urban");
		coches.put(coche.getCodigo(), coche);
		
		coche = new Coche();
		coche.setCodigo(2);
		coche.setNombre("Ford Focus");
		coches.put(coche.getCodigo(), coche);
		
		coche = new Coche();
		coche.setCodigo(3);
		coche.setNombre("Reanult Zoe");
		coches.put(coche.getCodigo(), coche);
		
	}

	@Override
	public Map<Integer, Coche> getAll() {
		
		return coches;
	}

	@Override
	public Coche getById(int codigo) {
		
		return coches.get(codigo);
	}

}
