/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public abstract class Usuario {
    
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes = new ArrayList<>();
    
    public Usuario () {
        
    }
    
    protected boolean logIn() {
        
        return false;
        
    }
    
    protected boolean logOut(){
        
        return false;
        
    }
    
}
