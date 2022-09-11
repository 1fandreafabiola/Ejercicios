package com.mycompany.periodo1clase5;
import java.util.Scanner;
public class Periodo1Clase5 {
    public static void main(String[] args) {
        int plato, cantidad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 1 o 2 según el plato que desee ");
        plato= entrada.nextInt();
        System.out.println("numero de ordenes: ");
        cantidad= entrada.nextInt();
        double totalInicial = 0, descuento, totalFinal = 0, precioPlato1 = 5, precioPlato2 = 7;
        if (plato ==1){
            if (cantidad >= 1 & cantidad <= 5){
                descuento = 0.05;
                totalInicial = cantidad * precioPlato1;
                descuento = 0.07;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >= 11){
                totalInicial = cantidad * precioPlato1;
                descuento = 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else {
                System.out.println("Cantidad equivocada");
            }
        } else if (plato == 2){
            if (cantidad >= 1 & cantidad <=5){
                totalInicial = cantidad * precioPlato2;
                descuento = 0.06;
                totalFinal= totalInicial - (totalInicial * descuento);
            } else if (cantidad >=6 & cantidad <=10 ){
                totalInicial= cantidad * precioPlato2;
                descuento= 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >=11 ){
                totalInicial= cantidad * precioPlato2;
                descuento= 0.12;
                totalFinal = totalInicial - (totalInicial * descuento);
        } else {
                System.out.println("Cantidad equivocada");
            }
        } else {
                System.out.println("Plato equivocado");
            }
        System.out.println("El menú es: " + plato);
        System.out.println("La cantidad es: "+ cantidad);
        System.out.println("El total inicial es:"+ totalInicial);
        System.out.println("El total final es "+ totalFinal);
        }
    }

