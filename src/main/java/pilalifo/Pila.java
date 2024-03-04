/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilalifo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class Pila {
    
    private final int tamanyoMax;
    private final List<String> lista;

    public Pila(int tamanyoMax) {
        this.tamanyoMax = tamanyoMax;
        this.lista = new ArrayList<>(this.tamanyoMax);
    }

    public List<String> getLista() {
        return lista;
    }
    
    public void anyadirElemento(String elemento){
        if (this.lista.size() < this.tamanyoMax) {
            this.lista.add(elemento);
        }
    }
    
    public String sacarElemento(){
        String elemento = this.lista.get(0);
        this.lista.remove(0);
        return elemento;
    }
    
    public boolean estaVacia(){
        return this.lista.isEmpty();
    }
    
    public boolean estaLlena(){
        return !this.lista.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
    
    public int numElementos(){
        return this.lista.size()+1;
    }

    public int getTamanyoMax() {
        return tamanyoMax;
    }
    
    
    
}
