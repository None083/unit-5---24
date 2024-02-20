/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer15;

/**
 *
 * @author noelia
 */
public class Alcalde extends Legislador {
    
    private String ciudad;

    public Alcalde(String ciudad, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.ciudad = ciudad;
    }

    public Alcalde() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alcalde{");
        sb.append(super.toString());
        sb.append("ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
