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

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        final String PIN_CORRECTO = "1234";
        
        int intentos = 0;
        final int MAX_INTENTOS = 3;
        boolean accesoConcedido = false;

        System.out.println("=== 🛡️ EL GUARDIÁN DEL SISTEMA 🛡️ ===");
        
        // NIVEL PLATA
        while (intentos < MAX_INTENTOS && !accesoConcedido) {
            System.out.print("\nIntroduce tu PIN de acceso (" + (MAX_INTENTOS - intentos) + " intentos restantes): ");
            String pinIngresado = scanner.nextLine();
            
            // NIVEL BRONCE
            if (pinIngresado.equals(PIN_CORRECTO)) {
                System.out.println("✅ ¡PIN Correcto! Acceso concedido.");
                accesoConcedido = true;
            } else {
                intentos++;
                System.out.println("❌ PIN Incorrecto.");
                if (intentos < MAX_INTENTOS) {
                    System.out.println("Inténtalo de nuevo.");
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("\n🚨 Has superado el número máximo de intentos. Sistema bloqueado.");
        } 
        // NIVEL ORO
        else {
            int opcion = 0;
            
            while (opcion != 4) {
                System.out.println("\n--- 💻 MENÚ DEL SISTEMA ---");
                System.out.println("1. Consultar estado del servidor");
                System.out.println("2. Ver logs de seguridad");
                System.out.println("3. Reiniciar firewall");
                System.out.println("4. Cerrar sesión");
                System.out.print("Selecciona una opción (1-4): ");

                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    
                    
                    switch (opcion) {
                        case 1:
                            System.out.println("\n📊 Estado: Todos los sistemas operativos y estables (CPU: 12%, RAM: 45%).");
                            break;
                        case 2:
                            System.out.println("\n📜 Último evento: Inicio de sesión exitoso por el Administrador.");
                            break;
                        case 3:
                            System.out.println("\n🔄 Reiniciando firewall del sistema... ¡Firewall activo y seguro!");
                            break;
                        case 4:
                            System.out.println("\n👋 Cerrando sesión. ¡Hasta pronto, Guardián!");
                            break;
                        default:
                            System.out.println("\n⚠️ Opción no válida. Por favor, elige un número del 1 al 4.");
                    }
                } else {
                    System.out.println("\n⚠️ Entrada no válida. Introduce un número entero.");
                    scanner.nextLine();
                }
            }
        }

        scanner.close();
    }
    
}
