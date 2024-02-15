package ut06ejer12;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author noelia
 */
public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;
    private static Set<String> listaNumeroCuenta = new HashSet<>();

    public Cuenta(Persona cliente) {
        String numCuentaTemp = RandomStringUtils.randomNumeric(20);
        
        while (listaNumeroCuenta.contains(numCuentaTemp)) {
            numCuentaTemp = RandomStringUtils.randomNumeric(20);
        }
        listaNumeroCuenta.add(numCuentaTemp);
        this.numeroCuenta = numCuentaTemp;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double cantidad);

}
