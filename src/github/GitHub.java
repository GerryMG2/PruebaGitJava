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
public class GitHub {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Date date;
        date = new Date(97,3,2);
        
        Persona per = new Persona(20,"Gerardo","Castro",date);
        System.out.println("El siguiente programa muestra mis datos usando Java");
        
        String datosC = per.getNombreCompleto() + "\n" + "Edad: " + per.getEdad();
        System.out.println("Fecha de nacimiento: " + per.fecha() );
        
        System.out.println(datosC);
        
    }
    
}
