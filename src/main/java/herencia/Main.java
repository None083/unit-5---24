/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author noelia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("123", "Y", "Citroen", 23.56);
        Turismo t1 = new Turismo(5, true, "256", "owo9", "loquesea", 45);
        
        System.out.println(t1);
        
        //Cuando uso la variable de la subclase tengo acceso a
        //métodos públicos de la superclase
        
        t1.descontarTarifa(3); //Este método es de vehiculo
        t1.anyadirRuedaRepuesto(); //Este método es de turismo
        
        v1.descontarTarifa(2); 
        // v1 no tiene acceso a los metodos de turismo
    }
    
    
    
}
