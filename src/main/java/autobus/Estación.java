/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autobus;

import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Estación {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Autobus b1 = new Autobus();
        
        System.out.println(b1);
        
        System.out.println("Introduce un número de asiento");
        b1.reservarAsiento(teclado.nextLine(), false);
        System.out.println(b1);
        System.out.println("Introduce un número de asiento");
        b1.reservarAsiento(teclado.nextLine(), false);
        
    }
    
}
