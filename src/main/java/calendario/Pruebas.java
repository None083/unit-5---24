/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario;

/**
 *
 * @author FX506
 */
public class Pruebas {

    public static void main(String[] args) {
        
        Calendario c1 = new Calendario(2, 2024);
        
        System.out.println(c1.toString());
        System.out.println(Calendario.diaSemana(c1, 40));
        
//        Calendario[] cAnual = Calendario.calendarioAnual(2024);
//        
//        for (Calendario cMensual : cAnual) {
//            System.out.println(cMensual);
//        }
        
    }
    
}
