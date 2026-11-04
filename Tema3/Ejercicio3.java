/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author 19_1DAW
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        final double IVA = 21;
        double precio, precioTotal, descuento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el precio del articulo:");
        precio = entrada.nextDouble();
        System.out.println("Introduce el descuento del articulo:");
        descuento = entrada.nextDouble();
        precioTotal = calcularDescuento(precio, descuento, IVA);
        mostrarDatos(precio, descuento, precioTotal, IVA);
        entrada.close();
    }
    public static double calcularDescuento(double precio, double descuento, double IVA) {
        double precioDescuento = precio - (precio / 100 / (1 / descuento));
        double divisorIva = 1 / (1 + (IVA / 100));
        double precioTotal = precioDescuento / divisorIva;
        return precioTotal;
    }
    public static void mostrarDatos(double precio, double descuento, double precioTotal, double IVA) {
        double precioSinIva = precio - (precio / 100 / (1 / descuento));
        System.out.println("Ticket");
        System.out.println("==============");
        System.out.println("Precio: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio Total sin IVA: " + precioSinIva);
        System.out.println("IVA: " + IVA + "%");
        System.out.println("Precio Total con IVA: " + precioTotal);
    }
}

