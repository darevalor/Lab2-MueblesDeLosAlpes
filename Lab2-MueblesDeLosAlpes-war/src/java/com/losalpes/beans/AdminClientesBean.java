/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CatalogoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import com.losalpes.servicios.IServicioClientes;
import com.losalpes.servicios.ServicioClientesMock;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.event.SelectEvent;


/**
 * Managed bean encargado de los Clientes en el sistema
 * 
 */
@ManagedBean
@SessionScoped
public class AdminClientesBean implements Serializable
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo mueble a ingresar
     */
    private Cliente Cliente;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioClientes adminClientes;
    
    private Cliente ClienteSeleccionado;    

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public AdminClientesBean()
    {
        Cliente=new Cliente();
        adminClientes=new ServicioClientesMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    /**
     * Devuelve el objeto mueble
     * @return  Objeto mueble
     */
    public Cliente getCliente()
    {
        return Cliente;
    }

    /**
     * Modifica el objeto cliente
     * @param cliente  Nuevo cliente
     */
    public void setMueble(Cliente cliente)
    {
        this.Cliente = cliente;
    }
    
    /**
     * Devuelve una lista con todos los Clientes del sistema
     * @return cliente Clientes del sistema
     */
    public List<Cliente> getClientes()
    {
        return adminClientes.darClientes();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo mueble al sistema
     */
    public void agregarCliente()
    {
        adminClientes.agregarCliente(Cliente);
        Cliente=new Cliente();
    }

    /**
     * Elimina la información del Cliente
     */
    public void eliminarCliente()
    {
        if(ClienteSeleccionado != null){
        adminClientes.eliminarCliente(ClienteSeleccionado);
        }
    }
    
    /**
     * Editar un Cliente 
     */
    public void editarCliente(){
        adminClientes.editarCliente(Cliente);
        agregarCliente();
    }

    /**
     * Devuelve los tipos de Documentos
     * @return SelectItem Tipos de Documentos en el sistema
     */
    public SelectItem[] getTiposDocumentos()
    {
        TipoDocumento[] tipos=  TipoDocumento.values();
        SelectItem[] sitems = new SelectItem[tipos.length];
        
        for (int i = 0; i < sitems.length; i++)
        {
             sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }
    
    public Cliente getClienteSeleccionado() {
        return ClienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente ClienteSeleccionado) {
        this.ClienteSeleccionado = ClienteSeleccionado;
    }

    public void onRowSelect(SelectEvent event) {
        this.ClienteSeleccionado = ((Cliente)event.getObject());
        Cliente = ClienteSeleccionado;
    }    
}
