/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer01;

/**
 *
 * @author FX506
 */
public class Puerta {
    
    private EstadoVentanaPuerta estado;

    public Puerta() {
        this.estado = EstadoVentanaPuerta.CERRADA;
    }

    public EstadoVentanaPuerta getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Puerta{");
        sb.append("estado=").append(estado);
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
