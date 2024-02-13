/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laberinto;

import java.util.Random;

/**
 *
 * @author FX506
 */
public class UtilidadesLaberinto {
    
    public static char[][] generadorLaberinto(int num){
        char[][] matriz = new char[num][num];
        Random random = new Random();
        int numRandom = 0;
        
        if((num >= 3 && num <= 10)){
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    numRandom = random.nextInt(2);
                    
                    if(numRandom == 0){
                        matriz[i][j] = 'c';
                    }else{
                        matriz[i][j] = 'b';
                    }
                }
            }
            
        }else{
            throw new IllegalArgumentException("El rango debe estar entre 3 y 10");
        }
        return matriz;
    }
    
    public static Casilla[][] generadorLaberintoCasillas(char[][] matrizLetras){
        Casilla[][] matrizCasillas = new Casilla[matrizLetras.length][matrizLetras[0].length];
        
        for (int i = 0; i < matrizLetras.length; i++) {
            for (int j = 0; j < matrizLetras[i].length; j++) {
                if(matrizLetras[i][j] == 'c'){
                    matrizCasillas[i][j] = new Casilla(i, j, TipoCasilla.CAMINO);
                }else{
                    matrizCasillas[i][j] = new Casilla(i, j, TipoCasilla.BOSQUE);
                }
            }
        }
        
        return matrizCasillas;
    }
    
}
