/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Casos {
    
   public static void main(String [] args){
       
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Seleccione una opcion: ");
       int opc = sc.nextInt();
       
       switch (opc){
           
           case 1:
              
               System.out.println("Calcular Area");
               
               System.out.println("Ingrese el lado 1: ");
               double a= sc.nextDouble();
               System.out.println("Ingrese el lado 2 ");
               double b= sc.nextDouble();
               System.out.println("El area total es: " + calcularArea(a,b));
               break;
               
              
           case 2:
               System.out.println("Calcular Perimetro");
               System.out.println("Lado 1");
               double a1 = sc.nextDouble();
               System.out.println("Lado 2");
               double b2 = sc.nextDouble();
               System.out.println("Lado 3");
               double c3 = sc.nextDouble();
               System.out.println("Lado 4");
               double d4 = sc.nextDouble();
               System.out.println("el perimetro total es: " + calcularPerimetroCuadrado(a1,b2,c3,d4));
               break;
           case 3:
               System.out.println("Salir");
               break;
           default:
               System.out.println("Seleccione una opcion valida");
       }
       
       
   }
    public static double calcularArea(double ladoA, double ladoB){
        
        double areaTotal = ladoA*ladoB;
        
        return areaTotal;
        
    }
    
    public static double calcularPerimetroCuadrado(double lado1, double lado2, double lado3, double lado4){
        
        double perimetroCuadradoTotal = lado1+ lado2+ lado3+lado4;
        
        return perimetroCuadradoTotal;
        
    }
    
    
    
}
