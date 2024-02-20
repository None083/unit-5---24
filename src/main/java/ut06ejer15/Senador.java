/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer15;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import practiquillaviajes.Viaje;

/**
 *
 * @author noelia
 */
public class Senador extends Legislador implements Camara{
    
    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public Senador() {
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Senador{");
        sb.append(super.toString());
        sb.append("complemento=").append(complemento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void getCamara() {
        System.out.println("Camara de Senadores");
    }
    
    public void ordenarComplementos(List<Camara> lista){

        //Collections.sort(lista, (c1, c2) -> c1.);
    }
    
}
