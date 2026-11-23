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

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el primer apellido: ");
        String primerApellido = sc.nextLine();

        System.out.print("Introduce el segundo apellido: ");
        String segundoApellido = sc.nextLine();

        String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;

        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Numero total de caracteres: " + nombreCompleto.length());

        String enMayusculas = nombreCompleto.toUpperCase();
        String enMinusculas = nombreCompleto.toLowerCase();

        System.out.println("En mayusculas: " + enMayusculas);
        System.out.println("En minusculas: " + enMinusculas);

        sc.close();
    }
}
