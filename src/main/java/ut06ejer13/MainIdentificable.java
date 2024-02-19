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
public class MainIdentificable {

    public static void main(String[] args) {
        
        List<Identificable> listaIdentificables = new ArrayList<>();
        
        Identificable p1 = new Estudiante("123", "María", "Martín", "123456", 
                new Direccion("C/Dolores fuertes", "Estepona", "29680", "España"));
        Identificable p2 = new Estudiante("456", "Alicia", "González", "456789", 
                new Direccion("C/Manzanilla", "Estepona", "29680", "España"));
        Persona p3 = new Estudiante("789", "Juan", "Fernandez", "789123", 
                new Direccion("C/Salvador Dalí", "Estepona", "29680", "España"));
        
        Identificable p4 = new Profesor("Diseño Web", "Antonio", "Flores", "321654", 
                new Direccion("C/María Julieta VIII", "Estepona", "29680", "España"));
        Identificable p5 = new Profesor("Inglés", "Tania", "Martinez", "654987", 
                new Direccion("C/Molinos", "Estepona", "29680", "España"));
        Persona p6 = new Profesor("Lengua Castellana", "Arturo", "Hernandez", "987321", 
                new Direccion("C/Margarita", "Estepona", "29680", "España"));
        
        listaIdentificables.add(p1);
        listaIdentificables.add(p2);
        listaIdentificables.add(p3);
        listaIdentificables.add(p4);
        listaIdentificables.add(p5);
        listaIdentificables.add(p6);
        
        for (Identificable i : listaIdentificables) {
            System.out.println(i);
            i.identificate();
            if(i instanceof Estudiante){
                System.out.println("ID: " + ((Estudiante) i).getId());
            }else{
                System.out.println("Especialidad: " + ((Profesor) i).getEspecialidad());
            }
        }
        
        
        
    }
    
}
