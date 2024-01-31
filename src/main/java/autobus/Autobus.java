/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobus;

/**
 *
 * @author FX506
 *
 *   * 26 Enero Autobus 12 filas 4 asientos Hacer programa para reservar y
 * liberar asientos Si el viajero tiene movilidad reducida hay que dejar libres
 * todos los asientos de alrededor
 *
 * habra clase autobus con una matriz, clase asiento
 *
 *
 */
public class Autobus {

    final private int NUM_FILAS = 12;
    final private int NUM_COLUMNAS = 4;
    private Asiento autobus[][];

    public Autobus() {
        this.autobus = new Asiento[NUM_FILAS][NUM_COLUMNAS];
        int contadorAsiento = 1;

        for (int i = 0; i < this.autobus.length; i++) {
            for (int j = 0; j < this.autobus[i].length; j++) {

                if (contadorAsiento >= 1 && contadorAsiento <= 9) {
                    this.autobus[i][j] = new Asiento("0" + String.valueOf(contadorAsiento), Estado.LIBRE);
                } else {
                    this.autobus[i][j] = new Asiento(String.valueOf(contadorAsiento), Estado.LIBRE);
                }
                contadorAsiento++;
            }
        }

    }

    public Asiento[][] getAutobus() {
        return autobus;
    }

    @Override
    public String toString() {
        String bus = "";

        for (int i = 0; i < this.autobus.length; i++) {
            for (int j = 0; j < this.autobus[i].length; j++) {
                bus += this.autobus[i][j].getNumeroAsiento() + "-" + this.autobus[i][j].getEstado().getESTADO().charAt(0) + " ";
                if (j == 1) {
                    bus += "  ";
                }
            }
            bus += "\n";
        }
        return bus;
    }

    
    public void reservarAsiento(String numAsiento, boolean movReducida) {
        if (!movReducida) {
            for (int i = 0; i < this.autobus.length; i++) {
                for (int j = 0; j < this.autobus[i].length; j++) {
                    if (numAsiento.equals(this.autobus[i][j].getNumeroAsiento())) {
                        if (this.autobus[i][j].getEstado().equals(Estado.LIBRE) 
                                && (i-1>0 && this.autobus[i-1][j].getEstado().equals(Estado.LIBRE))
                                && (i-1>0 && j+1<this.autobus[i].length && this.autobus[i-1][j+1].getEstado().equals(Estado.LIBRE))
                                && (j+1<this.autobus[i].length && this.autobus[i][j+1].getEstado().equals(Estado.LIBRE))
                                && (i+1>this.autobus.length && j+1<this.autobus[i].length && this.autobus[i+1][j+1].getEstado().equals(Estado.LIBRE))
                                && (i+1>this.autobus.length && this.autobus[i+1][j].getEstado().equals(Estado.LIBRE))
                                && (i+1>this.autobus.length && j-1>0 && this.autobus[i+1][j-1].getEstado().equals(Estado.LIBRE))
                                && (j-1>0 && this.autobus[i][j-1].getEstado().equals(Estado.LIBRE))
                                && (i-1>0 && j-1>0 && this.autobus[i-1][j-1].getEstado().equals(Estado.LIBRE))) {
                            this.autobus[i][j].setEstado(Estado.RESERVADO);
                        } else {
                            System.out.println("El asiento " + numAsiento + " está ocupado");
                        }
                    }
                }
            }
        }else{
            for (int i = 0; i < this.autobus.length; i++) {
                for (int j = 0; j < this.autobus[i].length; j++) {
                    if (numAsiento.equals(this.autobus[i][j].getNumeroAsiento())) {
                        if (this.autobus[i][j].getEstado().equals(Estado.LIBRE) 
                                && (i-1>0 && this.autobus[i-1][j].getEstado().equals(Estado.LIBRE))
                                && (i-1>0 && j+1<this.autobus[i].length && this.autobus[i-1][j+1].getEstado().equals(Estado.LIBRE))
                                && (j+1<this.autobus[i].length && this.autobus[i][j+1].getEstado().equals(Estado.LIBRE))
                                && (i+1>this.autobus.length && j+1<this.autobus[i].length && this.autobus[i+1][j+1].getEstado().equals(Estado.LIBRE))
                                && (i+1>this.autobus.length && this.autobus[i+1][j].getEstado().equals(Estado.LIBRE))
                                && (i+1>this.autobus.length && j-1>0 && this.autobus[i+1][j-1].getEstado().equals(Estado.LIBRE))
                                && (j-1>0 && this.autobus[i][j-1].getEstado().equals(Estado.LIBRE))
                                && (i-1>0 && j-1>0 && this.autobus[i-1][j-1].getEstado().equals(Estado.LIBRE))) {
                            this.autobus[i][j].setEstado(Estado.MOVILIDAD_REDUCIDA);
                        } else {
                            System.out.println("El asiento " + numAsiento + " está ocupado");
                        }
                    }
                }
            }
        }

    }

}
