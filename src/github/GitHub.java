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
public class GitHub {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Persona per = new Persona(20,"Gerardo","Castro");
        System.out.println("El siguiente programa muestra mis datos usando Java");
        
        String datosC = per.getNombreCompleto() + "\n" + "Edad: " + per.getEdad();
        
        System.out.println(datosC);
        
    }
    
}
