/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author 19_1DAW
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        
        System.out.println("Introduzca un numero:");
        Scanner sc = new Scanner (System.in);
        int doble =calcularDoble(sc.nextInt());
        System.out.println(doble);

    }
    public static int calcularDoble(int numero){
        return numero * 2;
    }
    public static void mostrarMensaje(){
        System.out.println("Hola"); 
   }
}
