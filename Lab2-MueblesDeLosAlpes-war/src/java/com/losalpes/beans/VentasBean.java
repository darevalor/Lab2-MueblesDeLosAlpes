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

import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.Venta;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.IServicioVentas;
import com.losalpes.servicios.ServicioCatalogoMock;
import com.losalpes.servicios.ServicioVentasMock;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;


/**
 * Managed bean encargado del catálogo de muebles en el sistema
 * 
 */
@ManagedBean
public class VentasBean
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    private Date fechaDesde;
    private Date fechaHasta;
    private List<Venta> ventas;

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioVentas servicioVentas;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public VentasBean()
    {
        
        servicioVentas=new ServicioVentasMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------
    public Date getFechaDesde()
    {

        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public List<Venta> getVentas() {
        return ventas;
    }
    
    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

   public String obtenerVentas(){
       ventas = servicioVentas.obtenerVentas(fechaDesde, fechaHasta);
       
       return "ventas";
   }

}
