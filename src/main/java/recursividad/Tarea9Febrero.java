/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class Tarea9Febrero {

    /**
     * 7, 9, 10, 5, 3, 7, 7, 9, 10, 1, 5, 4
     * 
     * A. Estructura de datos que indique, para cada nº cuantas veces se repite
     * B. Lista sin duplicados
     * C. Recursivo posición búsqueda de un elemento (lista sin duplicados)
     */
    public static void main(String[] args) {
        
        int[] arrayNum = {7, 9, 10, 5, 3, 7, 7, 9, 10, 1, 5, 4};
        
        Map<Integer, Integer> vecesNumeroRepetido = vecesNumeroRepetido(arrayNum);
        
        for (Map.Entry<Integer, Integer> entry : vecesNumeroRepetido.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("--------------");
        Set<Integer> listaSinDuplicados = listaSinDuplicados(arrayNum);
        for (Integer i : listaSinDuplicados) {
            System.out.println(i);
        }
        
    }
    
    private static Map<Integer, Integer> vecesNumeroRepetido(int[] array){
        Map<Integer, Integer> listaRepetidos = new HashMap<>();
        int cantidad = 1;
        for (int i : array) {
            if(listaRepetidos.containsKey(i)){
                
                listaRepetidos.replace(i, listaRepetidos.get(i).intValue() + 1);
            }else{
                listaRepetidos.put(i, cantidad);
            }
        }
        return listaRepetidos;
    }
    
    private static Set<Integer> listaSinDuplicados(int[] array){
        Set<Integer> lista = new HashSet<>();
        
        for (int i : array) {
            lista.add(i);
        }
        
        return lista;
    }
    
    private static int posionElemento(List<> lista, int posicion, int elemento){
        
    }
    
}
