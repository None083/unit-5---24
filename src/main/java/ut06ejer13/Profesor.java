/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer13;

/**
 *
 * @author FX506
 */
public class Profesor extends Persona {
    
    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad = especialidad;
    }

    public Profesor() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append(super.toString());
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void identificate() {
        System.out.println("Soy un profesor");
    }
    
}
