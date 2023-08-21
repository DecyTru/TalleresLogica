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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a,b,c,d;
        
        System.out.println("introdusca podCarbon1 ");
        a=sc.nextDouble();
        System.out.println("Introdusca podCarbon2 ");
        b=sc.nextDouble();
        System.out.println("podCarbon12");
        c=sc.nextDouble();
        d=a+b+c/3;
        System.out.println("El promedio de toneladas anual es de: " + d + " Toneladas");
    }
}
