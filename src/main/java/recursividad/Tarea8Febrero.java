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

    }

    private static boolean esPalindroma(String palabra) {
        boolean result = false;
        boolean iguales = false;

        for (int i = 0; i < palabra.length(); i++) {
            do {
                if (palabra.length() % 2 == 0) {
                    if (palabra.charAt(i) == palabra.charAt(palabra.length() - i)) {
                        iguales = true;
                    } else {
                        iguales = false;
                    }
                }else{
                    
                }

            } while (iguales && i < palabra.length());
        }

        return result;
    }

}
