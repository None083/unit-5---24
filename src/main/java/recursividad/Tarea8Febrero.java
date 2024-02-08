/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Tarea8Febrero {

    /**
     *
     * Pedir palabra y decir si es un palindromo version iterativa y recursiva
     * de los extremos hacia dentro
     *
     * KAYAK
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = teclado.nextLine();
        System.out.println("Es la palabra " + palabra + " palindroma? "
                + esPalindroma(palabra));
        System.out.println("Es la palabra " + palabra + " palindroma? "
                + esPalindromaRecursivo(palabra));

    }

    private static boolean esPalindroma(String palabra) {

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPalindromaRecursivo(String palabra) {

        if (palabra.length() <= 1) {
            return true; // Una palabra de longitud 0 o 1 es un palíndromo
        } else if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false; // Si los caracteres en los extremos no son iguales, no es un palíndromo
        } else {
            // Recursión: se pasa la palabra sin los caracteres en los extremos
            return esPalindromaRecursivo(palabra.substring(1, palabra.length() - 1));
        }
    }

}
