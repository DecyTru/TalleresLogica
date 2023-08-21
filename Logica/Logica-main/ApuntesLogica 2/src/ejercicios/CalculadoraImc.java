/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class CalculadoraImc {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Ingrese peso: ");
        float peso= sc.nextFloat();
        System.out.println("Ingrese altura");
        float altura= sc.nextFloat();
        
        float pesoAltura = peso/(altura*altura);
        //System.out.println("Imc " + pesoAltura);
        
        if (pesoAltura <18.5){ 
            System.out.println("Bajo peso");
        }else if (pesoAltura>=18.5 && pesoAltura<= 24.99){
            System.out.println("Peso normal");
            
        }else if (pesoAltura>=25 && pesoAltura<=29.99 ){
                System.out.println("Sobrepeso");
                }else if (pesoAltura>=30 && pesoAltura<= 100 ){
                    System.out.println("Obeso");
                }else System.out.println("valor incorrecto ");{
    }
        
                    
        
        
        
        
        
    
    
    
    
    }
    
    
}
