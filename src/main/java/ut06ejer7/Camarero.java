/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer7;

/**
 *
 * @author noelia
 */
public class Camarero extends Trabajador {

    // Único atributo propio de Camarero
    private String rango;

    public Camarero(String rango, String nombre, String apellido1,
            String NIF) {
        // Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }

    // Método propio de camarero
    public void servirMesa() {
        System.out.println("Objeto Camarero: Sirviendo una mesa");
    }

    // Se omite getRango y setRango
    @Override
    public void cotizar() {
        System.out.println("Cotizando como Camarero");
    }

}
