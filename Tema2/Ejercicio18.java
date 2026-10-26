/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 10:");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; 
            }
            
            System.out.println(i);
        }
    }
    
}
