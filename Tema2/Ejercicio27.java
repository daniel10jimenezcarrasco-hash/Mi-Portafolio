/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio27 {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        
        try {
            int entrada = scanner.nextInt();
            
            if (esPrimo(entrada)) {
                System.out.println("El número " + entrada + " ES un número primo.");
            } else {
                System.out.println("El número " + entrada + " NO es un número primo.");
            }
            
        } catch (Exception e) {
            System.out.println("Por favor, introduce un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
    

