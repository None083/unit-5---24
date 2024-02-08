/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Pruebas {

    public static void main(String[] args) {
        
        Persiana persiana = new Persiana();
        Persiana persiana2 = new Persiana();
        Ventana ventana = new Ventana(persiana);
        Ventana ventana2 = new Ventana(persiana2);
        List<Ventana> ventanas = new ArrayList<>();
        
        Puerta puerta = new Puerta();
        
        Calefactor calefactor = new Calefactor(21);
        
        Casa casa = new Casa(ventanas, puerta, calefactor);
        
        System.out.println(casa);
        System.out.println("---------------------------------------------------");
        
        //Intento bajar la temperatura sin encender el calefactor
        casa.getCalefactor().fijarTemperatura(18);
        
        //Enciendo el calefactor
        casa.getCalefactor().encender();
        
        //Intento de nuevo bajar la temperatura
        casa.getCalefactor().fijarTemperatura(18);
        
        //Abro la puerta
        casa.getPuerta().abrir();
        
        //Bajo la persiana y abro la ventana
        casa.getVentanas().get(0).getPersiana().bajar();
        casa.getVentanas().get(1).abrir();
        
        
        System.out.println(casa);
        
    }
    
}
