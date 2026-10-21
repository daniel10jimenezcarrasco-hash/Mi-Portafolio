import java.util.Scanner;

public class CalculadoraPrecioEntrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce su edad: ");
        int edad = scanner.nextInt();

        double precio = (edad < 12) ? 5.0 : (edad >= 65 ? 6.0 : 8.0);

        System.out.println("\n--- TICKET DE ENTRADA ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Precio de la entrada: " + precio + " €");

        scanner.close();
    }
}
