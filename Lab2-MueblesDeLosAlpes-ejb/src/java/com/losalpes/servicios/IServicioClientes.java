/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioCatalogo.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import java.util.List;


/**
 * Contrato funcional de los servicios que se le prestan al catálogo
 */
public interface IServicioClientes
{

    /**
     * Agrega un mueble al sistema
     * @param mueble Nuevo mueble
     */
    public void agregarCliente(Cliente cliente);
    
    /**
     * Elima un cleinte del sistema dado su numero de identificacion
     * @param identificacion 
     */
    public void eliminarCliente(Cliente cliente);
    
    /**
     * Edita un cliente dado el objeto del cliente
     * @param cliente 
     */
    public void editarCliente(Cliente cliente);

    /**
     * Devuelve todos los Clientes del sistema
     * @return Cliente Lista de Clientes
     */
    public List<Cliente> darClientes();
    
}
