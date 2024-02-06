/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author noelia
 */
public class Tareas6Febrero {

    /**
     * 1. Recorrer una array de forma recursiva e imprimir valores.
     *
     * 2. Sumar de forma recursiva los elementos de un array.
     */
    public static void main(String[] args) {

        char arrayChar[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.println(imprimirArrayRecursivo(arrayChar, 0));

    }

    private static char imprimirArrayRecursivo(char[] array, int posicion) {

        if (posicion < array.length) {
            return array[posicion];
        }
        imprimirArrayRecursivo(array, posicion);
        return array[array.length];
    }

}
