
package com.ipartek.formacion.ws.coche.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerCocheporCodigo", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCocheporCodigo", namespace = "http://com.ipartek.formacion/types")
public class GetById {

    @XmlElement(name = "codigocoche", namespace = "http://com.ipartek.formacion/types")
    private Integer codigocoche;

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getCodigocoche() {
        return this.codigocoche;
    }

    /**
     * 
     * @param codigocoche
     *     the value for the codigocoche property
     */
    public void setCodigocoche(Integer codigocoche) {
        this.codigocoche = codigocoche;
    }

}
