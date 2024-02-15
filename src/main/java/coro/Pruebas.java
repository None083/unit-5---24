/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coro;

import java.util.List;

/**
 *
 * @author FX506
 */
public class Pruebas {

    public static void main(String[] args) {
        
        List<Voz> lista = Coro.generarVoces(20);
        
        for (Voz v : lista) {
            System.out.println(v);
        }
        System.out.println("----------------------------------------------");

        System.out.println("Número de coros mixtos posibles: " + Coro.getNumeroCorosMixtos(lista));
        
    }
    
}
