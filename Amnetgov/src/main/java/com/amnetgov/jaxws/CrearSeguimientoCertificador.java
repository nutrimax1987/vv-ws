
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

@XmlRootElement(name = "CrearSeguimientoCertificador", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrearSeguimientoCertificador", namespace = "http://amnetgov.com/", propOrder = {"UsuarioServicio", "ContrasenaServicio", "Idproceso", "IdCertificador", "Observaciones", "ResultadoExamen", "CategoriaFinal"})

public class CrearSeguimientoCertificador {

    @XmlElement(name = "UsuarioServicio", namespace = "http://amnetgov.com/")
    private java.lang.String UsuarioServicio;
    @XmlElement(name = "ContrasenaServicio", namespace = "http://amnetgov.com/")
    private java.lang.String ContrasenaServicio;
    @XmlElement(name = "Idproceso", namespace = "http://amnetgov.com/")
    private long Idproceso;
    @XmlElement(name = "IdCertificador", namespace = "http://amnetgov.com/")
    private java.lang.String IdCertificador;
    @XmlElement(name = "Observaciones", namespace = "http://amnetgov.com/")
    private java.lang.String Observaciones;
    @XmlElement(name = "ResultadoExamen", namespace = "http://amnetgov.com/")
    private int ResultadoExamen;
    @XmlElement(name = "CategoriaFinal", namespace = "http://amnetgov.com/")
    private java.lang.String CategoriaFinal;

    public java.lang.String getUsuarioServicio() {
        return this.UsuarioServicio;
    }

    public void setUsuarioServicio(java.lang.String newUsuarioServicio)  {
        this.UsuarioServicio = newUsuarioServicio;
    }

    public java.lang.String getContrasenaServicio() {
        return this.ContrasenaServicio;
    }

    public void setContrasenaServicio(java.lang.String newContrasenaServicio)  {
        this.ContrasenaServicio = newContrasenaServicio;
    }

    public long getIdproceso() {
        return this.Idproceso;
    }

    public void setIdproceso(long newIdproceso)  {
        this.Idproceso = newIdproceso;
    }

    public java.lang.String getIdCertificador() {
        return this.IdCertificador;
    }

    public void setIdCertificador(java.lang.String newIdCertificador)  {
        this.IdCertificador = newIdCertificador;
    }

    public java.lang.String getObservaciones() {
        return this.Observaciones;
    }

    public void setObservaciones(java.lang.String newObservaciones)  {
        this.Observaciones = newObservaciones;
    }

    public int getResultadoExamen() {
        return this.ResultadoExamen;
    }

    public void setResultadoExamen(int newResultadoExamen)  {
        this.ResultadoExamen = newResultadoExamen;
    }

    public java.lang.String getCategoriaFinal() {
        return this.CategoriaFinal;
    }

    public void setCategoriaFinal(java.lang.String newCategoriaFinal)  {
        this.CategoriaFinal = newCategoriaFinal;
    }

}

