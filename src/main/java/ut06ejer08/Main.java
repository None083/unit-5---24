/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer08;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        Dado d1 = new Dado(7);//Seis caras + 1 porque se come un número elrandom
        System.out.println("Dado: " + d1.lanzar());
        
        Moneda m1 = new Moneda(3);//Dos caras + 1 porque se come un número elrandom
        System.out.println("Moneda: " + m1.lanzar());
        
        
    }
    
}
