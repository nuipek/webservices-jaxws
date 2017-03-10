package com.ipartek.formacion;

import java.net.MalformedURLException;
import java.net.URL;



public class Main {

	public static void main(String[] args) throws MalformedURLException {
		String wsdlurl="http://localhost:8080/webservices-jaxws/peliculasservice?wsdl";

		
		URL url = new URL(wsdlurl);
		
	}

}
