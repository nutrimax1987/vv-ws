
package com.amnetgov.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.5
 * Tue Apr 12 18:21:06 IDT 2016
 * Generated source version: 3.0.5
 */

@XmlRootElement(name = "SeleccionarProcesoDatosComplementariosResponse", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeleccionarProcesoDatosComplementariosResponse", namespace = "http://amnetgov.com/")

public class SeleccionarProcesoDatosComplementariosResponse {

    @XmlElement(name = "SeleccionarProcesoDatosComplementariosResult", namespace = "http://amnetgov.com/")
    private com.amnetgov.entities.PersonalOtherInfo SeleccionarProcesoDatosComplementariosResult;

    public com.amnetgov.entities.PersonalOtherInfo getSeleccionarProcesoDatosComplementariosResult() {
        return this.SeleccionarProcesoDatosComplementariosResult;
    }

    public void setSeleccionarProcesoDatosComplementariosResult(com.amnetgov.entities.PersonalOtherInfo newSeleccionarProcesoDatosComplementariosResult)  {
        this.SeleccionarProcesoDatosComplementariosResult = newSeleccionarProcesoDatosComplementariosResult;
    }

}

