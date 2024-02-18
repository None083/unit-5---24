/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizserpiente;

/**
 *
 * @author FX506
 */
public class Coordenada1 {

    private int fila;
    private int columna;

    public Coordenada1(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Coordenada1() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordenada{");
        sb.append("fila=").append(fila);
        sb.append(", columna=").append(columna);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
