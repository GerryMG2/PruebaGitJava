/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Date;

/**
 *
 * @author gerar
 */
public class Persona {
    int Edad;
    String nombre;
    String Apellido;
    Date dat;

    public Persona(int Edad, String nombre, String Apellido,Date date) {
        this.Edad = Edad;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dat = date;
    }
    public String fecha(){
        return dat.toLocaleString().toString().substring(0,11);
    }
    

    public int getEdad() {
        return Edad;
    }
    
    public String getNombreCompleto(){
        String NombreC = nombre + " " + Apellido;
        return NombreC;
    }
    
    
}
