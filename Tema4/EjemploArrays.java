/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Arrays;

/**
 *
 * @author 19_1DAW
 */
public class EjemploArrays {
    public static void main(String[] args) {
        double[] temperaturas = {18.5, 21.0, 24.5, 19.0, 27.5};
        //System.out.println("Temperaturas: " + temperaturas);
        
        for (int i = 0; i <= temperaturas.length - 1; i++) {
            System.out.println("Día " + (i + 1) + " - " + temperaturas[i]);
        }
        
        temperaturas[1] = 22.0;
        
        
       System.out.println(temperaturas[1]);
    }
    
}
