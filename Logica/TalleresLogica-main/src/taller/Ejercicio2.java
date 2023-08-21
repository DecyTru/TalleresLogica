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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int a,b,c,d;
        
        System.out.println("Ingrese la altura");
        a=sc.nextInt();
        System.out.println("Ingrese la base");
        b=sc.nextInt();
        
        c= a*b;
        d= (a+b)*2;
        System.out.println("El area de el rectangulo es de: " + c + "cm");
        System.out.println("El perimetro de el rectangulo es de: " + d + "cm");
    }
    
}
