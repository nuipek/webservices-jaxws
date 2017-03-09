package com.ipartek.formacion.ws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheColeccion implements Serializable{
	
	private List<Coche> coches;
	
	public CocheColeccion(){
		super();
		this.coches = new ArrayList<Coche>();
		
	}

	public List<Coche> getCoches() {
		return coches;
	}

	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	
	public void setCoches(Collection<Coche> coches) {
		this.coches.addAll(coches);
	}
	
	

}
