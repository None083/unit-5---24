/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobus;

/**
 *
 * @author FX506
 */
public class Asiento {
    
    private String numeroAsiento;
    private Estado estado;

    public Asiento(String numero, Estado estado) {
        this.numeroAsiento = numero;
        this.estado = estado;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asiento{");
        sb.append("numeroAsiento=").append(numeroAsiento);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
