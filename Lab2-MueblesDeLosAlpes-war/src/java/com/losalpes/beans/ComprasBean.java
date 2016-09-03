/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author WTMOCHOA
 */
@ManagedBean(eager = true)
@Named(value = "comprasBean")
@SessionScoped
public class ComprasBean implements Serializable {

    List<Mueble> listaMueblesCompra;
    List<Mueble> listaMueblesSeleccionadas;
    Double total;

    /**
     * Creates a new instance of ComprasBean
     */
    public ComprasBean() {
        listaMueblesCompra = new ArrayList<>();
        listaMueblesSeleccionadas = new ArrayList<>();
        total = 0D;
    }

    public String comprar() {
        return "";
    }

    public String agregar() {
        boolean agregado;

        for (Mueble muebleSel : listaMueblesSeleccionadas) {
            agregado = false;
            for (Mueble muebleCom : listaMueblesCompra) {
                if (muebleSel.getReferencia().equals(muebleCom.getReferencia())) {
                    agregado = true;
                    break;
                }
            }
            if (!agregado) {
                listaMueblesCompra.add(muebleSel);
                total += muebleSel.getPrecio();
            }
        }
        return "comprar";
    }
    
    public String regresar(){
        return "seleccion";
    }

    public List<Mueble> getListaMueblesCompra() {
        return listaMueblesCompra;
    }

    public void setListaMueblesCompra(List<Mueble> listaMueblesCompra) {
        this.listaMueblesCompra = listaMueblesCompra;
    }

    public List<Mueble> getListaMueblesSeleccionadas() {
        return listaMueblesSeleccionadas;
    }

    public void setListaMueblesSeleccionadas(List<Mueble> listaMueblesSeleccionadas) {
        this.listaMueblesSeleccionadas = listaMueblesSeleccionadas;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
