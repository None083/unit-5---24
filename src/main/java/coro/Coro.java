/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FX506
 */
public class Coro {

    public static List<Voz> generarVoces(int num) {
        List<Voz> lista = new ArrayList<>();

        if (num >= 6) {
            Random random = new Random();
            Voz[] voces = Voz.values();

            for (int i = 0; i < num; i++) {
                lista.add(voces[random.nextInt(voces.length)]);
            }
        } else {
            System.out.println("El mínimo son 6 voces, no se ha generado la lista");
        }
        return lista;
    }

    public static int getNumeroCorosMixtos(List<Voz> lista) {
        int numCoros = 0;
        int numFemenino = 0;
        int numMasculino = 0;

        for (Voz v : lista) {
            if (v.getGenero().equals("Femenino")) {
                numFemenino++;
            } else{
                numMasculino++;
            }
        }
        
        
        
        return numCoros;
    }

}
