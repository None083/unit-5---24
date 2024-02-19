/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer13;

/**
 *
 * @author FX506
 */
public class Estudiante extends Persona {
    
    private String id;

    public Estudiante(String id, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.id = id;
    }

    public Estudiante() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append(super.toString());
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void identificate() {
        System.out.println("Soy un estudiante");
    }
    
    
    
}
