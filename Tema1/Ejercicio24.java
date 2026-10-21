import java.util.Scanner;
/**
 * 
 * @author 19_1DAW
 */

public class PermisoSalir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = scanner.nextBoolean();

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean tareasTerminadas = scanner.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean vaABiblioteca = scanner.nextBoolean();

        boolean puedesSalir = vaABiblioteca || (!llueve && tareasTerminadas);

        System.out.println("¿Puedes salir a la calle? " + puedesSalir);

        scanner.close();
    }
}