/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberinto;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {

        try {
            char[][] matrizLetras = UtilidadesLaberinto.generadorLaberinto(11);

            for (int i = 0; i < matrizLetras.length; i++) {
                for (int j = 0; j < matrizLetras[i].length; j++) {
                    System.out.print(matrizLetras[i][j] + " ");
                }
                System.out.println("");
            }

            Casilla[][] matrizCasillas = UtilidadesLaberinto.generadorLaberintoCasillas(matrizLetras);

            for (int i = 0; i < matrizCasillas.length; i++) {
                for (int j = 0; j < matrizCasillas[i].length; j++) {
                    System.out.print(matrizCasillas[i][j] + " ");
                }
                System.out.println("");
            }

        } catch (IllegalArgumentException iae) {
            System.out.println("Debes introducir un número entre 3 y 10");
        }

    }

}
