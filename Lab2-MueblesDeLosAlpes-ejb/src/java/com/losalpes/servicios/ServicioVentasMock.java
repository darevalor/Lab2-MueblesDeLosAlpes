/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.TipoMueble;
import com.losalpes.bos.Venta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Implementacion de los servicios de ventas que se le prestan al sistema. [Mock Object]
 * @author Daniel
 */
public class ServicioVentasMock implements IServicioVentas{

    private List<Venta> listaVentas; 
    
    public ServicioVentasMock(){
        
        listaVentas = new ArrayList<>();
        
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF1","Silla clásica","Una confortable silla con estilo del siglo XIX.",TipoMueble.Interior,1500D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF2","Silla moderna","Lo último en la moda de interiores. Esta silla le brindará la comodidad e innovación que busca",TipoMueble.Interior,900D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF3","Mesa de jardín","Una bella mesa para comidas y reuniones al aire libre.",TipoMueble.Exterior,2340D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF4","Sillón new wave","Innovador y cómodo. No existen mejores palabras para describir este hermoso sillón.",TipoMueble.Interior,1100D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF5","Mesa para comedor","Sus cenas no tendrán mejor acompañante. Una mesa para seis personas con un hermoso diseño clásico.",TipoMueble.Interior,890D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF6","Cama king","Una hermosa cama hecha en cedro para dos personas. Sus sueños no volveran a ser iguales.",TipoMueble.Interior,650D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF7","Silla de jardín","Una bella silla para comidas y reuniones al aire libre.",TipoMueble.Exterior,900D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF8","Camarote junior","Con diseño moderno. Sus hijos ahora podrán tener unos felices sueños.",TipoMueble.Interior,300D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF1","Silla clásica","Una confortable silla con estilo del siglo XIX.",TipoMueble.Interior,1500D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(1),new Mueble("RF2","Silla moderna","Lo último en la moda de interiores. Esta silla le brindará la comodidad e innovación que busca",TipoMueble.Interior,900D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(2),new Mueble("RF3","Mesa de jardín","Una bella mesa para comidas y reuniones al aire libre.",TipoMueble.Exterior,2340D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(3),new Mueble("RF4","Sillón new wave","Innovador y cómodo. No existen mejores palabras para describir este hermoso sillón.",TipoMueble.Interior,1100D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(4),new Mueble("RF5","Mesa para comedor","Sus cenas no tendrán mejor acompañante. Una mesa para seis personas con un hermoso diseño clásico.",TipoMueble.Interior,890D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(5),new Mueble("RF6","Cama king","Una hermosa cama hecha en cedro para dos personas. Sus sueños no volveran a ser iguales.",TipoMueble.Interior,650D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(6),new Mueble("RF7","Silla de jardín","Una bella silla para comidas y reuniones al aire libre.",TipoMueble.Exterior,900D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(7),new Mueble("RF8","Camarote junior","Con diseño moderno. Sus hijos ahora podrán tener unos felices sueños.",TipoMueble.Interior,300D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(3),new Mueble("RF1","Silla clásica","Una confortable silla con estilo del siglo XIX.",TipoMueble.Interior,1500D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(6),new Mueble("RF2","Silla moderna","Lo último en la moda de interiores. Esta silla le brindará la comodidad e innovación que busca",TipoMueble.Interior,900D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(7),new Mueble("RF3","Mesa de jardín","Una bella mesa para comidas y reuniones al aire libre.",TipoMueble.Exterior,2340D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(2),new Mueble("RF4","Sillón new wave","Innovador y cómodo. No existen mejores palabras para describir este hermoso sillón.",TipoMueble.Interior,1100D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(5),new Mueble("RF5","Mesa para comedor","Sus cenas no tendrán mejor acompañante. Una mesa para seis personas con un hermoso diseño clásico.",TipoMueble.Interior,890D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(6),new Mueble("RF6","Cama king","Una hermosa cama hecha en cedro para dos personas. Sus sueños no volveran a ser iguales.",TipoMueble.Interior,650D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(2),new Mueble("RF7","Silla de jardín","Una bella silla para comidas y reuniones al aire libre.",TipoMueble.Exterior,900D)));
        listaVentas.add(new Venta(restarDiasAFechaActual(7),new Mueble("RF8","Camarote junior","Con diseño moderno. Sus hijos ahora podrán tener unos felices sueños.",TipoMueble.Interior,300D)));
    }
    /**
     * Devuelve todos las ventas realizadas en un rango de fechas
     * @param fechaInicio fecha de inicio
     * @param fechaFin fecha final
     * @return muebles Lista de muebles
     */
    @Override
    public List<Venta> obtenerVentas(Date fechaInicio, Date fechaFin) {
        List<Venta> ventas = new ArrayList<Venta>();
        
        for(Venta v : listaVentas){
            if(v.getFecha().after(fechaInicio) && v.getFecha().before(fechaFin))
                ventas.add(v);
        }
        
        return ventas;
    }
    
    private Date restarDiasAFechaActual(int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        
        calendar.add(Calendar.DAY_OF_YEAR, (-1)*dias);
        
        return calendar.getTime();
    }
    
    
    
}
