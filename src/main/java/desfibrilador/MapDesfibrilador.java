/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desfibrilador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author FX506
 */
public class MapDesfibrilador {

    private final Map<String, Desfibrilador> desfibriladores;

    public MapDesfibrilador(Desfibrilador[] array, boolean ordenado) {
        if (ordenado) {
            this.desfibriladores = new TreeMap<>();

            for (Desfibrilador d : array) {
                this.desfibriladores.put(d.getId(), d);
            }
        } else {
            this.desfibriladores = new HashMap<>();

            for (Desfibrilador d : array) {
                this.desfibriladores.put(d.getId(), d);
            }
        }
    }

    public Map<String, Desfibrilador> getDesfibriladores() {
        return desfibriladores;
    }

    @Override
    public String toString() {
        String txt = "";
        
        for (String key : desfibriladores.keySet()) {
            txt += key + " -> " + desfibriladores.get(key).getNombre() 
                    + " -> " + desfibriladores.get(key).getEmail();
        }
        return txt;
    }
    
    public boolean estaRepetido(Desfibrilador d){
        return this.desfibriladores.containsKey(d.getId());
    }
    
    public List<Desfibrilador> listaValores(){
        return new ArrayList<>(this.desfibriladores.values());
    }
    
    public Map<String, Integer> contarDesfibriladoresPorEmail() {
        Map<String, Integer> conteoPorEmail = new HashMap<>();

        // Iterar sobre los desfibriladores y contar cuántos hay para cada email
        for (Desfibrilador d : this.desfibriladores.values()) {
            String email = d.getEmail();
            // Verificar si el correo electrónico ya está en el mapa
            if (conteoPorEmail.containsKey(email)) {
                // Si ya existe, incrementa el contador
                conteoPorEmail.put(email, conteoPorEmail.get(email) + 1);
            } else {
                // Si no existe, inicializa el contador en 1
                conteoPorEmail.put(email, 1);
            }
        }

        return conteoPorEmail;
    }

}
