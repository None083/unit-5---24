/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author noelia
 * 
 * Incluye una clase de prueba con el método main(), donde se crea 
 * una lista de cuatro Trabajadores. Añade en la lista dos objetos Camarero 
 * y dos objetos del tipo inventado por ti.  Finalmente recorre la lista 
 * y llama al método cotizar() de cada uno de los trabajadores, 
 * comprobando el comportamiento polimórfico de dicho método.

 * 
 */
public class Pruebas {

    public static void main(String[] args) {
        
        Camarero ca1 = new Camarero("Barman", "Mateo", "Sanchez", "123");
        Camarero ca2 = new Camarero("Sumiller", "Alicia", "Romero", "456");
        Cocinero co1 = new Cocinero("Pastelería", "Raúl", "Hernandez", "789");
        Cocinero co2 = new Cocinero("Cocina francesa", "Minerva", "Aragón", "147");
        
        List<Trabajador> trabajadores = new ArrayList<>();
        
        trabajadores.add(ca1);
        trabajadores.add(ca2);
        trabajadores.add(co1);
        trabajadores.add(co2);
        
        for (Trabajador t : trabajadores) {
            System.out.println(t);
            t.cotizar();
        }
        
        Set<CursosReciclado> hacenCursos = new HashSet();
        hacenCursos.add(ca2);//Sólo me deja añadir a los camareros, cocineros no
        
        for (CursosReciclado c : hacenCursos) {
            c.hacerCurso(300);
            
            if(c instanceof Cocinero){
                ((Cocinero) c).getEspecialidad();
            }
        }
        
    }
    
}
