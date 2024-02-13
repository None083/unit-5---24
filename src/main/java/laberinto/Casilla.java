/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

/**
 *
 * @author FX506
 */
public class Casilla {
    
    private int fila;
    private int columna;
    private TipoCasilla tipoCasilla;

    public Casilla(int fila, int columna, TipoCasilla tipoCasilla) {
        this.fila = fila;
        this.columna = columna;
        this.tipoCasilla = tipoCasilla;
    }

    public Casilla() {
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return tipoCasilla == TipoCasilla.BOSQUE 
                ? TipoCasilla.BOSQUE.getValor() : TipoCasilla.CAMINO.getValor();
    }
    
    
    
}
