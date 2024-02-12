/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer7;

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
    
    public abstract void cotizar();   
	// Se omiten getters y setters


    
}
