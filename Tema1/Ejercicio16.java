package programacion;

import java.util.Scanner;

public class PedirNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int numero = teclado.nextInt();

        System.out.println("El número es: " + numero);
    }
}
