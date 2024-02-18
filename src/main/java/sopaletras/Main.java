/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package sopaletras;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean salir = false;

        System.out.println("Introduce el tamaño de la matriz");
        int tamanyoMatriz = teclado.nextInt();
        SopaLetras sopaLetras = new SopaLetras(tamanyoMatriz);
        sopaLetras.mostrarMatriz();
        System.out.println("--------------------------------------");

        do {
            int fila = 0;
            int columna = 0;

            System.out.println("""
                               
                                 ESCOGE LA ORIENTAIÓN DE LA PALABRA
                               --------------------------------------
                                    1 - Horizontal
                                    2 - Horizontal invertida
                                    3 - Vertical
                                    4 - Vertical invertida
                                    5 - Salir
                               --------------------------------------
                               """);
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce una palabra");
                    teclado.nextLine();
                    String palabra = teclado.nextLine();
                    System.out.println("Escoge la fila");
                    fila = teclado.nextInt();
                    System.out.println("Escoge la columna");
                    columna = teclado.nextInt();
                    sopaLetras.colocarPalabraHorizontal(fila, columna, palabra);
                    sopaLetras.mostrarMatriz();
                    System.out.println("--------------------------------------");
                }
                case 2 -> {
                    System.out.println("Introduce una palabra");
                    teclado.nextLine();
                    String palabra = teclado.nextLine();
                    System.out.println("Escoge la fila");
                    fila = teclado.nextInt();
                    System.out.println("Escoge la columna");
                    columna = teclado.nextInt();
                    sopaLetras.colocarPalabraHorizontalInvertida(fila, columna, palabra);
                    sopaLetras.mostrarMatriz();
                    System.out.println("--------------------------------------");
                }
                case 3 -> {
                    System.out.println("Introduce una palabra");
                    teclado.nextLine();
                    String palabra = teclado.nextLine();
                    System.out.println("Escoge la fila");
                    fila = teclado.nextInt();
                    System.out.println("Escoge la columna");
                    columna = teclado.nextInt();
                    sopaLetras.colocarPalabraVertical(fila, columna, palabra);
                    sopaLetras.mostrarMatriz();
                    System.out.println("--------------------------------------");
                }
                case 4 -> {
                    System.out.println("Introduce una palabra");
                    teclado.nextLine();
                    String palabra = teclado.nextLine();
                    System.out.println("Escoge la fila");
                    fila = teclado.nextInt();
                    System.out.println("Escoge la columna");
                    columna = teclado.nextInt();
                    sopaLetras.colocarPalabraVerticalInvertida(fila, columna, palabra);
                    sopaLetras.mostrarMatriz();
                    System.out.println("--------------------------------------");
                }
                case 5 -> {
                    salir = true;
                }
            }

        } while (!salir);

    }

}
