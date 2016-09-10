/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioVentas.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.losalpes.servicios;

import com.losalpes.bos.Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IServicioVentas {
    /**
     * Devuelve todos las ventas realizadas en un rango de fechas
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha final
     * @return muebles Lista de muebles
     */
    List<Venta> obtenerVentas(Date fechaInicio, Date fechaFin);
}
