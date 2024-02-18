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
public class P52NoeliaP1 {

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

        List<Coordenada1> listaCoordenadas = buscarSerpiente(matriz);
        for (Coordenada1 c : listaCoordenadas) {
            System.out.println(c);
        }
    }

    private static List<Coordenada1> buscarSerpiente(int[][] matriz) {
        List<Coordenada1> lista = new ArrayList<>();
        Coordenada1 c1 = new Coordenada1(0, 0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    c1.setFila(i);
                    c1.setColumna(j);
                }
            }
        }
        lista.add(c1);
        matriz[c1.getFila()][c1.getColumna()] = 8;
        Coordenada1 aux = new Coordenada1(c1.getFila(), c1.getColumna());
        boolean terminado = false;

        do {
            if (matriz[aux.getFila()][aux.getColumna() + 1] == 1) {

                lista.add(new Coordenada1(aux.getFila(), aux.getColumna() + 1));
                matriz[aux.getFila()][aux.getColumna() + 1] = 8;
                aux.setColumna(aux.getColumna() + 1);

            } else if (matriz[aux.getFila() + 1][aux.getColumna()] == 1) {

                lista.add(new Coordenada1(aux.getFila() + 1, aux.getColumna()));
                matriz[aux.getFila() + 1][aux.getColumna()] = 8;
                aux.setFila(aux.getFila() + 1);

            } else if (matriz[aux.getFila()][aux.getColumna() - 1] == 1) {

                lista.add(new Coordenada1(aux.getFila(), aux.getColumna() - 1));
                matriz[aux.getFila()][aux.getColumna() - 1] = 8;
                aux.setColumna(aux.getColumna() - 1);

            } else if (matriz[aux.getFila() - 1][aux.getColumna()] == 1) {

                lista.add(new Coordenada1(aux.getFila() - 1, aux.getColumna()));
                matriz[aux.getFila() - 1][aux.getColumna()] = 8;
                aux.setFila(aux.getFila() - 1);

            } else {
                terminado = true;
            }
        } while (!terminado);
        return lista;
    }

}
