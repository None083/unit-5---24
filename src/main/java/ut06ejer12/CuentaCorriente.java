/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer12;

/**
 *
 * @author FX506
 */
public class CuentaCorriente extends Cuenta {
    
    private double interes;
    private double saldoMin;
    
    public CuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);        
        final double INTERES_FIJO = 1.5;
        
        this.interes = INTERES_FIJO;
        this.saldoMin = saldoMin;
    }
    
    public CuentaCorriente(Persona cliente) {
        super(cliente);
    }
    
    public double getInteres() {
        return interes;
    }
    
    public double getSaldoMin() {
        return saldoMin;
    }
    
    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append(super.toString());
        sb.append("interes=").append(interes);
        sb.append(", saldoMin=").append(saldoMin);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void actualizarSaldo() {
        if(this.getSaldo() > 1000){
            this.setSaldo(this.getSaldo() + (this.saldoMin * this.interes));
        }else{
            this.setSaldo(this.getSaldo() + (this.saldoMin + this.interes));
        }
    }
    
    @Override
    public void retirar(double cantidad) {
        if (cantidad <= this.saldoMin) {
            this.setSaldo(this.getSaldo() - cantidad);
        }
    }
    
}
