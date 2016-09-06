/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioCatalogoMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementacion de los servicios del catalogo de muebles que se le prestan al sistema. [Mock Object]
 * 
 */

public class ServicioClientesMock implements IServicioClientes
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los muebles del sistema
     */
    private ArrayList<Cliente> clientes;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioClientesMock()
    {

        //Inicializa el arreglo de los muebles
        clientes=new ArrayList<Cliente>();

        //Agrega los muebles del sistema
        clientes.add(new Cliente(TipoDocumento.CedulaCiudadania,1111111,"Mario Ochoa 1",3132532,3125624,"km 13 av norte","Bogota","Bogota","Colombia","Ing electronico", "Mochoa@gmail"));
        clientes.add(new Cliente(TipoDocumento.CedulaExtrangeria,2222222,"Mario Ochoa 2",3132532,3125624,"km 13 av norte","Bogota","Bogota","Colombia","Ing electronico", "Mochoa@gmail"));
        clientes.add(new Cliente(TipoDocumento.Pasaporte,3333333,"Mario Ochoa 3",3132532,3125624,"km 13 av norte","Bogota","Bogota","Colombia","Ing electronico", "Mochoa@gmail"));
        clientes.add(new Cliente(TipoDocumento.CedulaCiudadania,4444444,"Mario Ochoa 4",3132532,3125624,"km 13 av norte","Bogota","Bogota","Colombia","Ing electronico", "Mochoa@gmail"));
    }


    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agregar un CLiente al sistema
     * @param cliente 
     */
    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Elimina un Cliente del sistema dado su numero de identficacion
     * @param identificacion 
     */
    @Override
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);      
    }

    /**
     * Edita un cliente en el sistema
     * @param cliente 
     */
    @Override
    public void editarCliente(Cliente cliente) {
        eliminarCliente(cliente);
        agregarCliente(cliente);
    }

    /**
     * Devuelve la lista de Cliente en el sistema
     * @return 
     */
    @Override
    public List<Cliente> darClientes() {
        return clientes;
    }
}
