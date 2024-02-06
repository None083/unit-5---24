/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer1;

/**
 *
 * @author FX506
 */
public class Casa {
    
    private Ventana ventana;
    private Puerta puerta;
    private Calefactor calefactor;

    public Casa(Ventana ventana, Puerta puerta, Calefactor calefactor) {
        this.ventana = ventana;
        this.puerta = puerta;
        this.calefactor = calefactor;
    }

    public Ventana getVentana() {
        return ventana;
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
        sb.append(ventana).append("\n");
        sb.append(puerta).append("\n");
        sb.append(calefactor).append("\n");
        return sb.toString();
    }
    
    
    
}
