/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author WTMOCHOA
 */
@ManagedBean
@SessionScoped
public class AdminMenuBean {

    /**
     * Creates a new instance of AdminMenu
     */
    public AdminMenuBean() {
    }
    
    public String IrAdminClientes(){
        return "adminclientes";
    }
    
    public String IrAdminMuebles(){
        return"catalogo";
    }
    
    public String IrReportes(){
        return "reports";
    }   
}
