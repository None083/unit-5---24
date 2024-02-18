/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopaletras;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class SopaLetras {

    private char matriz[][];

    public SopaLetras(int tamanyo) {
        this.matriz = new char[tamanyo][tamanyo];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                this.matriz[i][j] = RandomStringUtils.randomAlphabetic(1).toUpperCase().charAt(0);
            }
        }
    }

    public char[][] getMatriz() {
        return matriz;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SopaLetras{");
        sb.append("matriz=").append(matriz);
        sb.append('}');
        return sb.toString();
    }

    public void mostrarMatriz() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //colocarPalabraHorizontal, que recibe una coordenada de la matriz 
    //y un String con la palabra y pone la palabra horizontalmente 
    //en la matriz a partir de la coordenada indicada, si se puede.
    public void colocarPalabraHorizontal(int fila, int columna, String palabra) {

        boolean espacioSuficiente = false;

        if (columna + palabra.length() <= this.matriz.length) {
            espacioSuficiente = true;
        }
        int index = 0;
        if (espacioSuficiente) {
            for (int i = 0; i < palabra.length(); i++) {
                this.matriz[fila][columna] = palabra.charAt(index);
                columna++;
                index++;
            }
        } else {
            System.out.println("No hay espacio suficiente");
        }
    }

    //colocarPalabraHorizontalInvertida,
    //que recibe una coordenada de la matriz y un String con la palabra 
    //y pone la palabra horizontalmente, de forma invertida, en la matriz 
    //a partir de la coordenada indicada, si se puede.
    public void colocarPalabraHorizontalInvertida(int fila, int columna, String palabra) {
        boolean espacioSuficiente = false;

        if (columna - palabra.length() + 1 >= 0) {
            espacioSuficiente = true;
        }
        int index = 0;
        if (espacioSuficiente) {
            for (int i = 0; i < palabra.length(); i++) {
                this.matriz[fila][columna] = palabra.charAt(index);
                columna--;
                index++;
            }
        } else {
            System.out.println("No hay espacio suficiente");
        }
    }

    //colocarPalabraVertical,
    //que recibe una coordenada de la matriz y un String con la palabra 
    //y pone la palabra verticalmente en la matriz a partir 
    //de la coordenada indicada, si se puede.
    public void colocarPalabraVertical(int fila, int columna, String palabra) {
        boolean espacioSuficiente = false;

        if (fila + palabra.length() <= this.matriz.length) {
            espacioSuficiente = true;
        }

        int index = 0;
        if (espacioSuficiente) {
            for (int i = 0; i < palabra.length(); i++) {
                this.matriz[fila][columna] = palabra.charAt(index);
                fila++;
                index++;
            }
        } else {
            System.out.println("No hay espacio suficiente");
        }
    }

    //colocarPalabraVerticalInvertida,
    //que recibe una coordenada de la matriz y un String con la palabra 
    //y pone la palabra verticalmente, de forma invertida, 
    //en la matriz a partir de la coordenada indicada, si se puede.
    public void colocarPalabraVerticalInvertida(int fila, int columna, String palabra) {
        boolean espacioSuficiente = false;

        if (fila - palabra.length() + 1 >= 0) {
            espacioSuficiente = true;
        }

        int index = 0;
        if (espacioSuficiente) {
            for (int i = 0; i < palabra.length(); i++) {
                this.matriz[fila][columna] = palabra.charAt(index);
                fila--;
                index++;
            }
        } else {
            System.out.println("No hay espacio suficiente");
        }
    }
    
}
