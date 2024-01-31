/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplomatriz;

/**
 *
 * @author FX506
 * 
 * 
 *   23 Enero 1. Método que recibe una matriz y la muestra en forma tabulada
     * (tabla)  2. Recibe la matriz y un número de fila y devuelve la suma de
     * esa fila 3. Recibe la matriz y un número de columnas y devuelve la suma
     * de esa columna
     *
     * Para cualquier tipo de matriz, no 2x2
 * 
 * 
 */
public class Ejer23Enero {
    
    public static void main(String[] args) {
        
    }
    
    public static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static int sumaLinea(int matriz[][], int numFila){
        
        int contador = 0;
        
        for (int i = 0; i < matriz[numFila].length; i++) {
            contador += matriz[numFila][i];
        }
        return contador;
    }
    
    public static int sumaColumna(int matriz[][], int numColumna){
        
        int contador = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            contador += matriz[i][numColumna];
        }
        return contador;
    }
    
}
