/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package laberinto;

/**
 *
 * @author FX506
 */
public enum TipoCasilla {
    
    BOSQUE("Bosque"),
    CAMINO("Camino");
    
    private final String valor;

    private TipoCasilla(String valor) {
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
    
}
