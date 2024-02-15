/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer11;

import java.util.ArrayList;

/**
 *
 * @author FX506
 */
public class Jerarquia {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(13, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5 
        for (Figura f : figuras) {
            System.out.println("Área: " + f.calcularArea());
        }
    }

}
