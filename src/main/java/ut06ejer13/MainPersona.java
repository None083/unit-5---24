/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class MainPersona {

    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();
        
        Persona p1 = new Estudiante("123", "María", "Martín", "123456", 
                new Direccion("C/Dolores fuertes", "Estepona", "29680", "España"));
        Persona p2 = new Estudiante("456", "Alicia", "González", "456789", 
                new Direccion("C/Manzanilla", "Estepona", "29680", "España"));
        Persona p3 = new Estudiante("789", "Juan", "Fernandez", "789123", 
                new Direccion("C/Salvador Dalí", "Estepona", "29680", "España"));
        
        Persona p4 = new Profesor("Diseño Web", "Antonio", "Flores", "321654", 
                new Direccion("C/María Julieta VIII", "Estepona", "29680", "España"));
        Persona p5 = new Profesor("Inglés", "Tania", "Martinez", "654987", 
                new Direccion("C/Molinos", "Estepona", "29680", "España"));
        Persona p6 = new Profesor("Lengua Castellana", "Arturo", "Hernandez", "987321", 
                new Direccion("C/Margarita", "Estepona", "29680", "España"));
        
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);
        listaPersonas.add(p6);
        
        for (Persona p : listaPersonas) {
            System.out.println(p);
            p.identificate();
            if(p instanceof Estudiante){
                System.out.println("ID: " + ((Estudiante) p).getId());
            }else{
                System.out.println("Especialidad: " + ((Profesor) p).getEspecialidad());
            }
        }
        
        
        
    }
    
}
