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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        boolean b;
        double e;
        
        System.out.println("Ingrese el Primer digito");
        a=sc.nextInt();
        if (a <= 100000) {
            b = true;
            e = (1.5*200);
            System.out.println("Se le descuenta 1.5%: " + e);
            }
        if (a > 100000 && a<= 250000){
            b = true;
            e = (1.8*200);
            System.out.println("Se le descuenta 1.8%: " + e);
        }
        if (a > 250000 ){
            b = true;
            e = (2.3*200);
            System.out.println("Se le descuenta 2.3%: " + e);
        }
 
    }
}
