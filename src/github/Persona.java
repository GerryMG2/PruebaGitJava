/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author gerar
 */
public class Persona {
    int Edad;
    String nombre;
    String Apellido;

    public Persona(int Edad, String nombre, String Apellido) {
        this.Edad = Edad;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }
    
    public String getNombreCompleto(){
        String NombreC = nombre + " " + Apellido;
        return NombreC;
    }
    
    
}
