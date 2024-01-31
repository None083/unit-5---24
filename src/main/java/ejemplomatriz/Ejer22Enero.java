/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatriz;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ejer22Enero {

    /**
     * Realiza un programa que pida al usuario el número de filas y columnas de
     * un array bidimensional de números enteros. El programa crea la matriz con
     * esos tamaños y debe rellenarla solicitando al usuario los valores a
     * introducir. Una vez esté rellena, se debe mostrar la matriz completa y la
     * suma de sus elementos.
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de filas");
        int numFilas = teclado.nextInt();
        System.out.println("Introduce un número de columnas");
        int numColumnas = teclado.nextInt();

        int matrizNum[][] = new int[numFilas][numColumnas];

        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.println("Introduce un número para la fila " + i + " columna " + j);
                matrizNum[i][j] = teclado.nextInt();
            }
        }
        
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.print(matrizNum[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
