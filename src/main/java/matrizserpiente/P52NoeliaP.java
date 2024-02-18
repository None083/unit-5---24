/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package matrizserpiente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class P52NoeliaP {

    public static void main(String[] args) {

        int[][] matriz = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}};

        List<Coordenada> listaCoordenadas = buscarSerpiente(matriz);
        for (Coordenada c : listaCoordenadas) {
            System.out.println(c);
        }

    }

    private static List<Coordenada> buscarSerpiente(int[][] matriz) {
        List<Coordenada> lista = new ArrayList<>();
        Coordenada c1 = new Coordenada(0, 0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {

                    c1 = new Coordenada(i, j);
                    lista.add(c1);
                    matriz[c1.fila()][c1.columna()] = 8;
                }

            }
        }
        Coordenada aux = new Coordenada(c1.fila(), c1.columna());
        boolean terminado = false;

        do {
            try{
                
            }catch(IndexOutOfBoundsException iobe){
                
            }
            if (matriz[aux.fila()][aux.columna() + 1] == 1) {

                lista.add(new Coordenada(aux.fila(), aux.columna() + 1));
                matriz[aux.fila()][aux.columna() + 1] = 8;
                aux = new Coordenada(aux.fila(), aux.columna() + 1);

            } else if (matriz[aux.fila() + 1][aux.columna()] == 1) {

                lista.add(new Coordenada(aux.fila() + 1, aux.columna()));
                matriz[aux.fila() + 1][aux.columna()] = 8;
                aux = new Coordenada(aux.fila() + 1, aux.columna());

            } else if (matriz[aux.fila()][aux.columna() - 1] == 1) {

                lista.add(new Coordenada(aux.fila(), aux.columna() - 1));
                matriz[aux.fila()][aux.columna() - 1] = 8;
                aux = new Coordenada(aux.fila(), aux.columna() - 1);

            } else if (matriz[aux.fila() - 1][aux.columna()] == 1) {

                lista.add(new Coordenada(aux.fila() - 1, aux.columna()));
                matriz[aux.fila() - 1][aux.columna()] = 8;
                aux = new Coordenada(aux.fila() - 1, aux.columna());
                
            }else if(aux.fila() < matriz.length || aux.columna() < matriz.length){
                
                aux = new Coordenada(aux.fila(), aux.columna() + 1);
                
            } else {
                terminado = true;
            }
        } while (!terminado);

        return lista;
    }

}
