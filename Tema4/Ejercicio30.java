/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo: ");
        String archivo = scanner.nextLine().trim().toLowerCase();

        if (archivo.endsWith(".pdf")) {
            System.out.println("Tipo de archivo: Documento PDF");
        } else if (archivo.endsWith(".jpg")) {
            System.out.println("Tipo de archivo: Imagen JPG");
        } else if (archivo.endsWith(".png")) {
            System.out.println("Tipo de archivo: Imagen PNG");
        } else if (archivo.endsWith(".txt")) {
            System.out.println("Tipo de archivo: Archivo de texto");
        } else {
            System.out.println("La extensión no está permitida.");
        }

        scanner.close();
    }
}
