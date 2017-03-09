package com.ipartek.formacion.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.service.CocheService;
import com.ipartek.formacion.service.CocheServiceImp;

@WebService(serviceName="cocheservice", wsdlLocation="CocheService.wsdl",endpointInterface = "com.ipartek.formacion.ws.CocheServiceWS")
public class CocheServiceWSImp implements CocheServiceWS {

	CocheService cS = new CocheServiceImp();
	CocheColeccion coleccion = new CocheColeccion();
	
	
	@Override
	public CocheColeccion getAll() {
		
	    Map<Integer,Coche> coches = cS.getAll();
	    List<Coche> cocheLista = new ArrayList<Coche>(coches.values());
	    coleccion.setCoches(cocheLista);
	    // coleccion.setCoches(coches.values()); Creamos un metodo en el pojo para insertar una coleccion en el cocheColeccion
		return coleccion;
		
		
		
	}

	@Override
	public Coche getById(Integer codigo) {
		Coche coche = null;
		if (codigo != null){
			coche = cS.getById(codigo);
		}
		return coche;
	}

	

}
