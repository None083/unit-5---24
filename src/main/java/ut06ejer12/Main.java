/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut06ejer12;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        CuentaAhorro ca1 = new CuentaAhorro(0.8, 25, 
                new Persona("María", "Martín Fernandez", "123"));
        
        Cuenta cc1 = new CuentaCorriente(100, 
                new Persona("Miguel", "Martín Fernandez", "456"));
        
        Set<Cuenta> cuentas = new HashSet();
        cuentas.add(ca1);
        cuentas.add(cc1);
        
        for (Cuenta c : cuentas) {
            System.out.println("Antes: " + c);
            c.actualizarSaldo();
            c.retirar(20);
            System.out.println("Después: " + c);
            System.out.println("----------------------------------------------");
            
            if(c instanceof CuentaAhorro){
                ((CuentaAhorro) c).quitarComision();
            }
            
        }
        
        
        
        
    }
    
}
