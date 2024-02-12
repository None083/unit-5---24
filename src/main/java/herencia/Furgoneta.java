/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author noelia
 */
public class Furgoneta extends Vehiculo {
    
    private double cargaMax;

    //Constructores sobrecargados
    //Mismo método en la misma clase
    public Furgoneta(double cargaMax, String matricula, String bastidor, String marca, double tarifaAlquiler) {
        super(matricula, bastidor, marca, tarifaAlquiler);
        this.cargaMax = cargaMax;
    }

    public Furgoneta() {
    }
    
    public Furgoneta(double cargaMax, String matricula, String bastidor){
        super(matricula, bastidor, null, 0);
        this.cargaMax = cargaMax;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.cargaMax) ^ (Double.doubleToLongBits(this.cargaMax) >>> 32));
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
        final Furgoneta other = (Furgoneta) obj;
        return Double.doubleToLongBits(this.cargaMax) == Double.doubleToLongBits(other.cargaMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Furgoneta{");
        sb.append(super.toString());
        sb.append("cargaMax=").append(cargaMax);
        sb.append('}');
        return sb.toString();
    }
    
    public void aumentarCarga(double cantidad){
        this.cargaMax += cantidad;
    }
    
    @Override
    public void pasarITV(){
        System.out.println("Soy una furgoneta y estoy pasando la ITV");
    }
    
}
