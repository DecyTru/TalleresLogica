/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Decy
 */
public class Ejercicio5 {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
         
         int bandera= 0;
         int seleccion= 0;
         do{
         do{
             System.out.println("Seleccione una opcion: ");
             System.out.println("----------------------------");
             System.out.println("1.Consultar saldo ");
             System.out.println("2.Realizar transferencia ");
             System.out.println("3.Cambiar clave ");
             System.out.println("4.Bloquear producto ");
             System.out.println("5.Realizar donación ");
             System.out.println("6.SALIR ");
             System.out.println("----------------------------");
             
             seleccion = sc.nextInt();
             
             if(seleccion >= 1 && seleccion <= 6){
                 bandera = 1;
             }else{
                 System.out.println("Coloque numero valido");
             }
         }while(bandera == 0);
         
         if(seleccion == 1){
             Saldo();
         }else if(seleccion == 2){
             transferencia();
         }else if(seleccion ==3){
             Cuenta();
         }else if(seleccion == 4){
             Block();
         }else if(seleccion == 5){
             Donar();
         }else if(seleccion == 6){
             bandera = 2;
         }
         }while (bandera != 2);
    }
    public static double Saldo(){
        double a;
        a = 10000;
        System.out.println("----------------------------");
        System.out.println("Tu saldo es de: " +a);
        System.out.println("----------------------------");
        return 0;
    }
    public static double transferencia(){
        System.out.println("--------------------------------------------");
        System.out.println("Introdusca cantidad que desea transferir: ");
        System.out.println("--------------------------------------------");
       if(sc.nextDouble()<= 10000){
           System.out.println("-----------------------------------");
           System.out.println("Transferencia realizada con exito");
           System.out.println("-----------------------------------");
       }else{
           System.out.println("----------------------------");
           System.out.println("No tiene suficiente saldo");
           System.out.println("----------------------------");
       }
       return 0;
    }
    private static void Cuenta(){
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese Nueva contraseña: ");
        System.out.println("--------------------------------------------");
        String contraseña = sc.next();
        System.out.println("--------------------------------------------");
        System.out.println("Haz cambiado tu contraseña con exito ");
        System.out.println("--------------------------------------------");
    }
    public static void Block(){
        System.out.println("Producto bloqueado ");
        
    }   
    public static void Donar(){
        System.out.println("Porfavor coloque la cantidad que desea donar ");
         if(sc.nextDouble()<= 10000000){
             System.out.println("Muchas gracias por su donacion :)");    
         }
    }
}
