/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ Venta.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.bos;

import java.util.Date;

/**
 * Clase que representa la informacion de una venta
 * @author Daniel
 */
public class Venta {
    private Date fecha;
    private Mueble mueble;

    public Venta(Date fecha, Mueble mueble) {
        this.fecha = fecha;
        this.mueble = mueble;
    }

    /**
     * Retorna la fecha
     * @return 
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Retorna el mueble
     * @return 
     */
    public Mueble getMueble() {
        return mueble;
    }

    /**
     * Establece el mueble
     * @param mueble 
     */
    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }   
    
}
