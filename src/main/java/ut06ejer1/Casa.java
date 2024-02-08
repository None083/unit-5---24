/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer1;

import java.util.List;

/**
 *
 * @author FX506
 */
public class Casa {
    
    private List<Ventana> ventanas;
    private Puerta puerta;
    private Calefactor calefactor;

    public Casa(List<Ventana> ventanas, Puerta puerta, Calefactor calefactor) {
        this.ventanas = ventanas;
        this.puerta = puerta;
        this.calefactor = calefactor;
    }

    public List<Ventana> getVentanas() {
        return ventanas;
    }

    

    public Puerta getPuerta() {
        return puerta;
    }

    public Calefactor getCalefactor() {
        return calefactor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa:").append("\n");
        sb.append(ventanas).append("\n");
        sb.append(puerta).append("\n");
        sb.append(calefactor).append("\n");
        return sb.toString();
    }
    
    
    
}
