/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] original = {2, 5, 3, 2, 8, 5, 9};
        
        System.out.print("Original:  [");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + (i < original.length - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        System.out.print("Resultado: [");
        boolean primerElemento = true;
        
        for (int i = 0; i < original.length; i++) {
            int contador = 0;
            
            for (int j = 0; j < original.length; j++) {
                if (original[i] == original[j]) {
                    contador++;
                }
            }
            
            if (contador == 1) {
                if (!primerElemento) {
                    System.out.print(", ");
                }
                System.out.print(original[i]);
                primerElemento = false;
            }
        }
        System.out.println("]");
    }
}
