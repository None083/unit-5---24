/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer7;

/**
 *
 * @author noelia
 */
public class Cocinero extends Trabajador {
    
    private String especialidad;

    public Cocinero(String especialidad, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.especialidad = especialidad;
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
        sb.append("Cocinero{");
        sb.append(super.toString());
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
    
    

    @Override
    public void cotizar() {
        System.out.println("Cotizando como Cocinero");
    }
    
    
    
}
