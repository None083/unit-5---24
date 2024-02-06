/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer1;

/**
 *
 * @author FX506
 */
public class Ventana {
    
    private EstadoVentanaPuerta estado;
    private Persiana persiana;

    public Ventana(Persiana persiana) {
        this.estado = EstadoVentanaPuerta.CERRADA;
        this.persiana = persiana;
    }

    public EstadoVentanaPuerta getEstado() {
        return estado;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventana{");
        sb.append("estado=").append(estado);
        sb.append(", persiana=").append(persiana);
        sb.append('}');
        return sb.toString();
    }
    
    public void abrir(){
        this.estado = EstadoVentanaPuerta.ABIERTA;
    }
    
    public void cerrar(){
        this.estado = EstadoVentanaPuerta.CERRADA;
    }
    
}
