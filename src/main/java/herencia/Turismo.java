/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author noelia
 */
//Clase Turismo hereda de Vehiculo, Turismo es la subclase de Vehiculo y la superclase
public class Turismo extends Vehiculo {
    
    //Atributos de turismo, no los tiene Vehiculo
    private int numPuertas;
    private boolean automatico;

    
    public Turismo(int numPuertas, boolean automatico, String matricula, String bastidor, String marca, double tarifaAlquiler) {
        //Llamada al constructor de vehiculo, (String, String, String, double)
        super(matricula, bastidor, marca, tarifaAlquiler);
        //Una vez el vehículo está creado se inicializan los atributos propios del turismo
        this.numPuertas = numPuertas;
        this.automatico = automatico;
    }

    public Turismo() {
        //La llamada al constructor sin parámetros está implícita
        //Está pero no la vemos
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turismo{");
        sb.append(super.getMarca());
        sb.append("numPuertas=").append(numPuertas);
        sb.append(", automatico=").append(automatico);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.numPuertas;
        hash = 11 * hash + (this.automatico ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turismo other = (Turismo) obj;
        if (this.numPuertas != other.numPuertas) {
            return false;
        }
        return this.automatico == other.automatico;
    }
    
    public void anyadirRuedaRepuesto(){
        System.out.println("Añadiendo rueda...");
    }
    
    @Override
    public void pasarITV(){
        System.out.println("Soy un turismo y estoy pasando la ITV");
    }
    
}
