import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leerlo
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("Por favor, introduce tu edad: ");
        int edad = scanner.nextInt();

        // Devuelve un literal booleano: si es true o false
        boolean esMayorDeEdad = edad >= 18;

        // Mostrar el resultado
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);

        // Cerrar el scanner
        scanner.close();
    }
}
