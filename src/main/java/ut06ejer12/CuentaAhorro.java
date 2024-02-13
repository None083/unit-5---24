/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer12;

/**
 *
 * @author FX506
 */
public class CuentaAhorro extends Cuenta {
    
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public CuentaAhorro(Persona cliente) {
        super(cliente);
    }

    public double getInteres() {
        return interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaAhorro{");
        sb.append(super.toString());
        sb.append("interes=").append(interes);
        sb.append(", comisionAnual=").append(comisionAnual);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void actualizarSaldo() {
        this.setSaldo((this.getSaldo() + (this.getSaldo() * this.interes)) - this.comisionAnual);
    }

    @Override
    public void retirar(double cantidad) {
        if(this.getSaldo() > 0){
            this.setSaldo(this.getSaldo() - cantidad);
        }else{
            System.out.println("No hay saldo");
        }
    }

}
