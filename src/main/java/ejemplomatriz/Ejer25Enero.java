/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomatriz;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author FX506
 */
public class Ejer25Enero {

    /**
     * 25 enero. En una clase con el main, usando métodos de clase 
     * a) Método que
     * recibe un número "n" entre 1 y 10 y devuelve una matriz de nXn elementos
     * aleatorios de tipo char. 
     * b) Método que recibe la matriz y un char y
     * devuelve una lista de objetos Celda indicando las casillas donde se
     * encuentra ese char dentro de la matriz.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 10");
        int num = teclado.nextInt();

        char matrizChar[][] = matrizChar(num);
        mostrarMatriz(matrizChar);
        
        teclado.nextLine();
        System.out.println("Introduce una letra a buscar");
        char letra = teclado.nextLine().charAt(0);
        
        System.out.println("-------------------------------------------------------");
        System.out.println(celdasChar(matrizChar, letra));

    }

    private static char[][] matrizChar(int num) {
        char matriz[][] = new char[num][num];

        if (num < 1 || num > 10) {
            return new char[0][0];
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = RandomStringUtils.randomAlphabetic(1).charAt(0);
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(char matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static ArrayList<Celda25Enero> celdasChar(char matriz[][], char c){
        
        ArrayList<Celda25Enero> listaCeldas = new ArrayList<>();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == c){
                    listaCeldas.add(new Celda25Enero(i, j));
                }
            }
        }
        return listaCeldas;
    }

}
