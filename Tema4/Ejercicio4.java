/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arrayPar = {10, 20, 30, 40, 50, 60};
        
        System.out.println("=== ARRAY DE 6 ELEMENTOS ===");
        System.out.println("Antes:   " + Arrays.toString(arrayPar));
        invertirArray(arrayPar);
        System.out.println("Después: " + Arrays.toString(arrayPar));

        int[] arrayImpar = {1, 2, 3, 4, 5, 6, 7};
        
        System.out.println("\n=== AMPLIACIÓN: ARRAY DE 7 ELEMENTOS ===");
        System.out.println("Antes:   " + Arrays.toString(arrayImpar));
        invertirArray(arrayImpar);
        System.out.println("Después: " + Arrays.toString(arrayImpar));
    }

    public static void invertirArray(int[] array) {
        
        for (int i = 0; i < array.length / 2; i++) {
            int posicionOpuesta = array.length - 1 - i;
            intercambiar(array, i, posicionOpuesta);
        }
    }

    public static void intercambiar(int[] array, int pos1, int pos2) {
        int temporal = array[pos1]; 
        array[pos1] = array[pos2];  
        array[pos2] = temporal;   
    }
}
