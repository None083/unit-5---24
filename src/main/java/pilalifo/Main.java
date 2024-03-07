/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilalifo;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        // Crear una nueva pila con un tamaño máximo de 5
        Pila pila = new Pila(5);

        // Añadir elementos a la pila
        pila.anyadirElemento("Elemento 1");
        pila.anyadirElemento("Elemento 2");
        pila.anyadirElemento("Elemento 3");

        // Imprimir la pila
        System.out.println("Pila después de añadir elementos:");
        System.out.println(pila);

        // Sacar elementos de la pila
        System.out.println("Elemento sacado de la pila: " + pila.sacarElemento());

        // Imprimir la pila después de sacar un elemento
        System.out.println("Pila después de sacar un elemento:");
        System.out.println(pila);

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.estaVacia());

        // Verificar si la pila está llena
        System.out.println("¿La pila está llena? " + pila.estaLlena());

        // Obtener el número de elementos en la pila
        System.out.println("Número de elementos en la pila: " + pila.numElementos());
        
    }
    
}
