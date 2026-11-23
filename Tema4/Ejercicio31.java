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

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una dirección de correo electrónico: ");
        String entrada = sc.nextLine();

        String correo = entrada.trim().toLowerCase();

        int posArroba = correo.indexOf('@');
        boolean contieneArroba = posArroba != -1;

        int posPuntoTrasArroba = contieneArroba ? correo.indexOf('.', posArroba) : -1;
        boolean puntoDespuesArroba = contieneArroba && posPuntoTrasArroba != -1 && posPuntoTrasArroba > posArroba + 1;

        boolean sinEspacios = !correo.contains(" ");

        System.out.println("Resultados de la comprobación");
        System.out.println("Correo normalizado: \"" + correo + "\"");
        System.out.println("Contiene '@': " + (contieneArroba ? "Sí" : "No"));
        System.out.println("Contiene '.' después de '@': " + (puntoDespuesArroba ? "Sí" : "No"));
        System.out.println("No contiene espacios: " + (sinEspacios ? "Sí" : "No"));

        if (contieneArroba && sinEspacios && posArroba > 0 && posArroba < correo.length() - 1) {
            String usuario = correo.substring(0, posArroba);
            String dominio = correo.substring(posArroba + 1);

            System.out.println("Datos extraídos");
            System.out.println("Nombre de usuario: " + usuario);
            System.out.println("Dominio: " + dominio);
        } else {
            System.out.println("No se puede extraer usuario y dominio con un formato válido.");
        }

        sc.close();
    }
}
