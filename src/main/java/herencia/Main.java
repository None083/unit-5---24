/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Vehiculo v1 = new Vehiculo("123", "Y", "Citroen", 23.56); Ya no puedo crear vehículos porque es abstracto
        Turismo t1 = new Turismo(5, true, "256", "owo9", "loquesea", 45);
        Furgoneta f1 = new Furgoneta(100, "333", "333E", "Peugeot", 12.9);
        
        System.out.println(t1);
        
        //Cuando uso la variable de la subclase tengo acceso a
        //métodos públicos de la superclase
        
        t1.descontarTarifa(3); //Este método es de vehiculo
        t1.anyadirRuedaRepuesto(); //Este método es de turismo
        f1.aumentarCarga(10); //Método propio de furgoneta
        
        //v1.descontarTarifa(2); 
        // v1 no tiene acceso a los metodos de turismo, ni de furgoneta
        
        List<Vehiculo> lista = new ArrayList<>();
        // Conversiones imlícitas, Casting implícito
        //aunque la variable sea turismo o furgoneta la estoy aountando por vehículo
        //lo que implica que solo tengo a los métodos de vehículo
        //lista.add(v1);
        lista.add(t1);
        lista.add(f1);
        
        for (Vehiculo v : lista) {
            //Método polimorfico toString
            //en función del tipo al que apunte v se ejecuta un código u otro
            System.out.println(v.toString());
            
            if(v instanceof Turismo){
                ((Turismo) v).anyadirRuedaRepuesto();
            }
            v.pasarITV();
        }
        
        
        
    }
    
    
    
}
