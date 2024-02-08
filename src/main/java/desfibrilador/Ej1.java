/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desfibrilador;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author FX506
 */
public class Ej1 {

    public static void main(String[] args) {

        Set<Desfibrilador> desfibriladoresSet = deArrayASet(UtilesDesfibrilador.getDesfibriladores());
        
        Map<String, Desfibrilador> desfibriladoresMap = deSetAMap(desfibriladoresSet);
        
        for (Map.Entry<String, Desfibrilador> entry : desfibriladoresMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static Set<Desfibrilador> deArrayASet(Desfibrilador[] array) {
        Set<Desfibrilador> desfibriladores = new TreeSet<>();
        for (Desfibrilador d : array) {
            desfibriladores.add(d);
        }
        return desfibriladores;
    }

    private static Map<String, Desfibrilador> deSetAMap(Set<Desfibrilador> set) {
        Map<String, Desfibrilador> map = new HashMap<>();

        Iterator<Desfibrilador> iterator = set.iterator();

        while (iterator.hasNext()) {
            map.put(iterator.next().getId(), iterator.next());
        }
        return map;
    }

}
