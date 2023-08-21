/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import  java.util.Scanner;

/**
 *
 * @author 503
 */
public class DoWhile {
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opc = 0;
        
        
        do {
            System.out.println("El total de su saldo es de: " + saldo());
            System.out.println("Veces calculadas " + opc++);
        } while (opc != 1);

    } 
    public static double saldo(){

            System.out.println("Su saldo actual");
            double num1 = sc.nextDouble();
            System.out.println("El resultado es: ");

            if (num1 <= 300.000) {

                System.out.println("Usted Tiene saldo");

                System.out.println("Saldo insuficiente");


            } else {
            }
            System.out.println("-----------------------------");
            System.out.println("Realizar retiro");

            if (num1 <= 50000) {

                System.out.println("Procesando");


            } else {
                System.out.println("El total de su saldo es:" + num1);
                double saldos = num1 - 50000;
                System.out.println("el total seria de: " + saldos);
            }
            return 0;

        }
    }