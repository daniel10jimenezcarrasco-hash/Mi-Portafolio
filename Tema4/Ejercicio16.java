/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros= {3,5,2,3,7,5,9,1};
        
        System.out.println("Elementos que aparecen una sola vez:");
        
        for(int i = 0; i < numeros.length; i++) {
            int contador = 0;
            
            for(int j = 0; j < numeros.length; j++) {
                if(numeros[j] == numeros[i]) {
                    contador++;
                    
                }
            }
            if (contador ==1) {
                System.out.println(numeros[i]);
            }
        }
    }
}
