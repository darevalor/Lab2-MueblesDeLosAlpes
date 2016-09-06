/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Usuario;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author WTMOCHOA
 */
@ManagedBean
@SessionScoped
public class ComprasBean implements Serializable {

    private static List<Mueble> listaMueblesSeleccionadas;
    private Double total;

    /**
     * Creates a new instance of ComprasBean
     */
    public ComprasBean() {
        
        if(listaMueblesSeleccionadas == null)
            reiniciarAtributos();
    }

    /**
     * Procesa la compra de los muebles seleccionados
     * @return 
     */
    public String comprar() {
        return "";
    }

    /**
     * Calcula el valor total de la compra
     * @return 
     */
    public String agregar() {
        total = 0D;
        
        listaMueblesSeleccionadas.stream().forEach((muebleSel) -> {
            total += muebleSel.getPrecio();
        });
        return "comprar";
    }
    
    /**
     * Retorna a la pagina de seleccion de muebles
     * @return 
     */
    public String regresar(){
        System.out.println("Reiniciando Atributos");
        return "seleccion";
    }
    
    public String irALogin(){
        return "login";
    }
    
    /**
     * Crea una nueva instancia a los atributos
     */
    private void reiniciarAtributos(){
        listaMueblesSeleccionadas = new ArrayList<>();
        total = 0D;
    }

    /**
     * Retorna la lista de muebles seleccionados
     * @return 
     */
    public List<Mueble> getListaMueblesSeleccionadas() {
        return listaMueblesSeleccionadas;
    }

    /**
     * Establece la lista de muebles seleccionados
     * @param listaMueblesSeleccionadas 
     */
    public void setListaMueblesSeleccionadas(List<Mueble> listaMueblesSeleccionadas) {
        ComprasBean.listaMueblesSeleccionadas = listaMueblesSeleccionadas;
    }

    /**
     * Retorna el valor total de los muebles seleccionados
     * @return 
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Establece el valor total de los muebles seleccionados
     * @param total 
     */
    public void setTotal(Double total) {
        this.total = total;
    }

}
