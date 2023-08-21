/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;


/**
 *
 * @author 503
 */
public class DoWhileEjercicios {
   static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opc = 0;
        
        do{
            System.out.println("En grados celcius es: " + convertir()); 
            System.out.println("Veces calculadas " + opc++);
        }while(opc != 3);
        
    }
        
    
       public static double convertir(){
        
            System.out.println("Ingrese fahrenheint");
            int num = sc.nextInt();
            System.out.println("El resultado es: ");
            int resultado = (num - 32)* 5/9;
            return resultado;
            
        
        
            }
}
