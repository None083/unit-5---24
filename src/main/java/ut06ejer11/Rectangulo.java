/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer11;

/**
 *
 * @author FX506
 */
public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    public Rectangulo() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo: ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public double calcularArea() {
        return ((double) super.getBase() * super.getAltura());
    }

}
