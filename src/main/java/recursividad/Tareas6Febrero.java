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
        imprimirArrayRecursivo(arrayChar, 0);
        System.out.println("-------");
        
        int arrayInt[] = {1, 2, 3, 4, 5};
        System.out.println(sumarElementosRecursivo(arrayInt, 0));
    }

    private static void imprimirArrayRecursivo(char[] array, int posicion) {
        if (posicion < array.length) {
            System.out.println(array[posicion]);
            imprimirArrayRecursivo(array, ++posicion);
        }
    }

    private static int sumarElementosRecursivo(int[] array, int posicion) {
        if (posicion == array.length - 1) {
            return array[posicion];
        } else {
            return array[posicion] + sumarElementosRecursivo(array, ++posicion);
        }
    }

}
