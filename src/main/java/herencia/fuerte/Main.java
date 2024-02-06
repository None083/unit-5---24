/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia.fuerte;

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
        
//        Museo m1 = new Museo();
//        
//        System.out.println(m1);
//        m1.anyadirObra(new ObraArte("Mona Lisa", "Pintura"));
//        System.out.println(m1);

        List<ObraArte> listaObras = new ArrayList<>();
        
        listaObras.add(new ObraArte("Guernica", "Pintura"));
        listaObras.add(new ObraArte("Mona Lisa", "Pintura"));

        Museo reinaSofia = new Museo("Reina Sofia", "Castellana, 25", 
                new Director("Pepe", "Vi", "123", 1000), 
                listaObras);
        
        System.out.println(reinaSofia);
        
        
        
    }
    
}
