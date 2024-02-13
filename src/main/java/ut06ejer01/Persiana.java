/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer01;

/**
 *
 * @author FX506
 */
public class Persiana {
    
    private EstadoPersiana estado;

    public Persiana() {
        this.estado = EstadoPersiana.SUBIDA;
    }

    public EstadoPersiana getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persiana{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    public void subir(){
        this.estado = EstadoPersiana.SUBIDA;
    }
    
    public void bajar(){
        this.estado = EstadoPersiana.BAJADA;
    }
    
}
