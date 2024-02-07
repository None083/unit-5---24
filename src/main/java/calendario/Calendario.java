/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendario;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author FX506
 */
public class Calendario {

    private int[][] calendario;
    private int mes;
    private int anyo;

    public Calendario(int mes, int anyo) {
        this.calendario = new int[6][7];
        this.mes = mes;
        this.anyo = anyo;
        
        LocalDate fecha = LocalDate.of(anyo, mes, 1);
        int diaInicio = fecha.getDayOfWeek().getValue();
        int contadorDia = 1;
        
        for (int i = 0; i < this.calendario.length; i++) {
            for (int j = 0; j < this.calendario[i].length; j++) {
                
                if (i == 0 && j < diaInicio - 1) {
                    // Espacios en blanco antes del primer día
                    this.calendario[i][j] = 0;
                } else if (contadorDia <= fecha.lengthOfMonth()) {
                    // Llenar con los días del mes
                    this.calendario[i][j] = contadorDia;
                    contadorDia++;
                } else {
                    // Días restantes después de que el mes termina
                    this.calendario[i][j] = 0;
                }
            }
        }
    }

    public int[][] getCalendario() {
        return calendario;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        
        String txt = "L\tM\tX\tJ\tV\tS\tD\n";
        
        for (int i = 0; i < this.calendario.length; i++) {
            for (int j = 0; j < this.calendario[i].length; j++) {
                if(this.calendario[i][j] == 0){
                    txt += " \t";
                }else{
                    txt += this.calendario[i][j] + "\t";
                }
            }
            txt += "\n";
        }
        return txt;
    }

}
