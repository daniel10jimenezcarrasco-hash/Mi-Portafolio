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

public class Ejercicio4 {
    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduce tu usuario: ");
        String usuarioIngresado = scanner.nextLine();
        
        if (usuarioIngresado.equals(usuarioCorrecto)) {
            System.out.println("¡Usuario correcto! Bienvenido.");
        } else {
            System.out.println("Usuario incorrecto.");
        }
        
        scanner.close();
    }
}
    

