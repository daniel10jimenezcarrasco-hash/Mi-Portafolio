import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int anioActual = teclado.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = teclado.nextInt();

        int edad = anioActual - anioNacimiento;

        System.out.println("Tu edad es: " + edad + " años.");

        teclado.close();
    }
}
