/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] original = {3, 8, 5, 2, 9};
        
        int[] invertido = new int[original.length];
        
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        
        System.out.print("Original:  [");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + (i < original.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        System.out.print("Invertido: [");
        for (int i = 0; i < invertido.length; i++) {
            System.out.print(invertido[i] + (i < invertido.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
