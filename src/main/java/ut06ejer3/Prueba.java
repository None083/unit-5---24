/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer3;

/**
 *
 * @author FX506
 */
public class Prueba {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Alicia", "000000000", 23);
        
        Empleado e1 = new Empleado(1000, "Pedro", "1111111111", 24);
        
        Programador pr1 = new Programador(Categoria.JUNIOR, 1300, 
                "Antonio", "2222222222", 25);
        
        e1.aumentarSalario(80);
        pr1.aumentarSalario(100);
        
        System.out.println(e1);
        System.out.println(pr1);
        
    }
    
}
