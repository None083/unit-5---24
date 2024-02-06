/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.fuerte;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class Museo { //Contenedora
    
    //Clases contenidas
    private String nombre;
    private String direccionPostal;
    private Director director;
    private List<ObraArte> listaObras;

    public Museo(String nombre, String direccionPostal, Director director, List<ObraArte> listaObras) {
        this.nombre = nombre;
        this.direccionPostal = direccionPostal;
        this.director = director;
        this.listaObras = listaObras;
    }
 
    public Museo(){
//        this.nombre = nombre;
//        this.direccionPostal = direccion;
        this.nombre = "Reina Sofía";
        this.direccionPostal = "Castellana, 23";
        this.director = new Director("Periquito", "De los palotes", "123", 2000);
        this.listaObras = new ArrayList<>();
        rellenarListaObras();
    }
    
    public Museo(String nombre, String direccion){
        this.nombre = nombre;
        this.direccionPostal = direccion;
//        this.nombre = "Reina Sofía";
//        this.direccionPostal = "Castellana, 23";
        this.director = new Director("Periquito", "De los palotes", "123", 2000);
        this.listaObras = new ArrayList<>();
        rellenarListaObras();
    }
    
    private void rellenarListaObras(){
        this.listaObras.add(new ObraArte("Guernica", "Pintura"));
    }
    
    public void anyadirObra(ObraArte obra){
        this.listaObras.add(obra);
    }
    
    public void borrarObra(ObraArte obra){
        this.listaObras.remove(obra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccionPostal=").append(direccionPostal);
        sb.append(", director=").append(director);
        sb.append(", listaObras=").append(listaObras);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public Director getDirector() {
        return director;
    }

    public List<ObraArte> getListaObras() {
        return listaObras;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
    
}
