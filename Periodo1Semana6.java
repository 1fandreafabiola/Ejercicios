package com.mycompany.periodo1semana6;
import java.util.Scanner;
public class Periodo1Semana6 {
    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese clave de usuario: ");
        clave = entrada.nextLine();
        if (nombre.equals ("Juan") && clave.equals ("123456")){
        System.out.println("BIENVENIDO AL SISTEMA");
    }
        else {
         System.out.println("Nombre de usuario o contraseña incorrecto");    
        }
       
    }
}
