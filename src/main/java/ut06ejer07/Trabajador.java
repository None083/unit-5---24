/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer07;

/**
 *
 * @author noelia
 * 
 * 
 * 
 */
public abstract class Trabajador {
    
    private String nombre;
    private String apellido1;
    private String NIF;
    
    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre=").append(nombre);
        sb.append(", apellido1=").append(apellido1);
        sb.append(", NIF=").append(NIF + ", ");
        return sb.toString();
    }
    
    
    
    public abstract void cotizar();   
	// Se omiten getters y setters


    
}
