/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiquillaviajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {

        Map<String, Integer> listaNumeroViajes = numeroViajesOrigen(getListaViajes());

        for (Map.Entry<String, Integer> entry : listaNumeroViajes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------");

        Set<String> listaOrigenes = destinosDiferentes(getListaViajes());

        Iterator<String> iterador = listaOrigenes.iterator();

        while (iterador.hasNext()) {
            String s = iterador.next();
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------");
        
        Map<String, Integer> numeroViajeros = numeroViajeros(getListaViajes());
        
        Iterator<Map.Entry<String, Integer>> iterador2 = numeroViajeros.entrySet().iterator();

        while (iterador2.hasNext()) {
            Map.Entry<String, Integer> entry = iterador2.next();
            
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("------------------------------------------------------------");
        List<Viaje> listaViajes = getListaViajes();
        ordenarDestinoViajero(listaViajes);
        listaViajes.forEach(System.out::println);

    }
    //----------------------------------------
    // ABRE EL ARCHIVO POM.XML, MODIFICA EL CONTENIDO QUE HAY ENTRE LAS ETIQUETAS
    // <artifactId>PruebaFeb24</artifactId> PARA QUE SEA <artifactId>PruebaFeb24+TUNOMBRE</artifactId>

    // CREA UN REPOSITORIO LOCAL GIT, AÑADE EN UN PRIMER COMMIT LOS ARCHIVOS NECESARIOS
    // DEL PROYECTO. EL REPOSITORIO, AL FINALIZAR LA PRUEBA, DEBE CONTENER CUATRO COMMITS, UNO POR CADA
    // APARTADO. AL CREAR EL ZIP, INCLUYE LA CARPETA .GIT. SI NO HAY CONTROL DE VERSIONES CORRECTO
    // NO SE CORRIGE EL RESTO
    //---------------------------------------
    // A.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // / con el número de viajes que salen de cada ciudad de origen. Usa el método en el main
    // e imprime el resultado usando un foreach
    // B.- Crea un método que reciba la lista y devuelva una estructura de datos/colección 
    // con todos los destinos diferentes. Usa el método en el main
    // e imprime el resultado usando un iterador
    // C.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // para saber por cada ciudad destino el número total de viajeros que llegan ese día
    // Usa el método en el main, obten las claves de la estructura devuelta e iterando por ellas imprime 
    // el número de viajeros por ciudad
    // D.- Crea un método que reciba la lista y la ordene por destino y si hay
    // destinos iguales se ordenan por número de viajeros. Usa el método en el main
    // e imprime el resultado usando foreach con expresión lambda, para obtener
    // una salida como esta por cada elemento: "Destino: Estepona Viajeros: 35" 
    //---------------------------------------
    private static ArrayList<Viaje> getListaViajes() {
        ArrayList<Viaje> listaViajes = new ArrayList();
        // Origen - destino - número de pasajeros
        listaViajes.add(new Viaje("Estepona", "Málaga", 120));
        listaViajes.add(new Viaje("Estepona", "Granada", 45));
        listaViajes.add(new Viaje("Estepona", "Algeciras", 100));
        listaViajes.add(new Viaje("Algeciras", "Málaga", 20));
        listaViajes.add(new Viaje("Algeciras", "Granada", 50));
        listaViajes.add(new Viaje("Granada", "Estepona", 35));
        listaViajes.add(new Viaje("Casares", "Málaga", 12));
        listaViajes.add(new Viaje("Marbella", "Málaga", 120));

        return listaViajes;
    }

    private static Map<String, Integer> numeroViajesOrigen(List<Viaje> listaViajes) {
        Map<String, Integer> listaNumeroViajes = new HashMap<>();
        int cantidad = 1;

        for (Viaje v : listaViajes) {
            if (listaNumeroViajes.containsKey(v.origen())) {
                listaNumeroViajes.replace(v.origen(), cantidad + 1);
            } else {
                listaNumeroViajes.put(v.origen(), cantidad);
            }
        }
        return listaNumeroViajes;
    }

    //También se podría hacer devolviendo una lista, 
    //comprobando antes si ya está el viaje dentro con un if(!lista.contains(v.destino()))
    private static Set<String> destinosDiferentes(List<Viaje> listaViajes) {
        Set<String> destinosDiferentes = new HashSet<>();

        for (Viaje v : listaViajes) {
            destinosDiferentes.add(v.destino());
        }

        return destinosDiferentes;
    }

    private static Map<String, Integer> numeroViajeros(List<Viaje> listaViajes) {
        Map<String, Integer> listaNumViajeros = new HashMap<>();

        for (Viaje v : listaViajes) {

            if (listaNumViajeros.containsKey(v.destino())) {
                
                int pasajeros = v.numeroPasajeros();
                int totalPasajeros = listaNumViajeros.get(v.destino()) + pasajeros;
                listaNumViajeros.replace(v.destino(), totalPasajeros);
            } else {
                listaNumViajeros.put(v.destino(), v.numeroPasajeros());
            }

        }
        return listaNumViajeros;
    }

    private static void ordenarDestinoViajero(List<Viaje> listaViajes) {

        Comparator<Viaje> criterioDestino = (v1, v2) -> v1.destino().compareToIgnoreCase(v2.destino());
        Comparator<Viaje> criterioPasajeros = (v1, v2) -> Integer.compare(v1.numeroPasajeros(), v2.numeroPasajeros());
        Comparator<Viaje> criterioDestinoPasajeros = criterioDestino.thenComparing(criterioPasajeros);

        Collections.sort(listaViajes, criterioDestinoPasajeros);
    }

}
