/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 16, 14, 20};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos" + i + ": " + numeros[i]);
        }
        
        numeros[3] = 18;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos" + i + ": " + numeros[i]);
        }
    }
}
