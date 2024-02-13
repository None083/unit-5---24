/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer08;

import java.util.Random;

/**
 *
 * @author noelia
 */
public class Dado extends Azar {

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    @Override
    public int lanzar() {
        Random random = new Random();
        
        return random.nextInt(1, super.posibilidades);
        
    }
    
}
