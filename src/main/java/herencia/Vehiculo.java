/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herencia;

import java.util.Objects;

/**
 *
 * @author noelia
 */
public abstract class Vehiculo {

    private String matricula;
    private String bastidor;
    private String marca;
    private double tarifaAlquiler;

    public Vehiculo(String matricula, String bastidor, String marca, double tarifaAlquiler) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.tarifaAlquiler = tarifaAlquiler;
    }

    public Vehiculo() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTarifaAlquiler() {
        return tarifaAlquiler;
    }

    public void setTarifaAlquiler(double tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", bastidor=").append(bastidor);
        sb.append(", marca=").append(marca);
        sb.append(", tarifaAlquiler=").append(tarifaAlquiler);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.matricula);
        hash = 71 * hash + Objects.hashCode(this.bastidor);
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.tarifaAlquiler) ^ (Double.doubleToLongBits(this.tarifaAlquiler) >>> 32));
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
        final Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(this.tarifaAlquiler) != Double.doubleToLongBits(other.tarifaAlquiler)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }
    
    //Si los métodos son privados no los puedo ver desde turismo
    //Habría que poner protected, pero si quiero usar el metodo en un main fuera de este paquete
    //no lo podré utilizar
    protected void descontarTarifa(double cantidad){
        this.tarifaAlquiler -=cantidad;
    }
    
    public abstract void pasarITV();
}
