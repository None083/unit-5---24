/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package autobus;

/**
 *
 * @author FX506
 */
public enum Estado {

    LIBRE("Libre"),
    RESERVADO("Reservado");
    
    private final String ESTADO;

    private Estado(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getESTADO() {
        return ESTADO;
    }
    
    
    
}
