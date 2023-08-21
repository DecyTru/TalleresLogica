/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class While {
    
    static Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        menCalc();
        
    }
    public static void menCalc(){
        
        
                int isOn;
                System.out.println("Oprima 1 para encender la calculadora");
                isOn = sc.nextInt();
                while(isOn!=0){
                  
                System.out.println("---------------------");
                System.out.println("Calculadora Personal");
                System.out.println("---------------------");
                System.out.println("1. Suma\n" + "2. Resta\n" + "3. Multiplicacion\n" + "4. Divicion\n" + "5.Modulo\n" + "6.Salir");
                System.out.println("---------------------");
                
                    System.out.println("Ingrese una opcion");
                    int opc=sc.nextInt();
                    
                    double num1 = capturarDatos("Ingrese numero 1");
                    double num2 = capturarDatos("Ingrese numero 2");
                    
                switch(opc){
                    case 1:
                        sumar (num1,num2);
                        break;
                     case 2:
                        restar(num1,num2);
                        break;
                     case 3:
                       multiplicar(num1,num2);
                        break;
                     case 4:
                        Divicion(num1,num2);
                        break;
                     case 5:
                        Modulo(num1,num2);
                        break;
                     case 6:
                         System.out.println("6.Salir");
                         isOn=0;
                         break;
                     default:
                         System.out.println("Ingrese numero valido");
                          
                }
                    
                }
    }
    public static double capturarDatos(String Cadena){
        
        System.out.println(Cadena);
                        double num= sc.nextDouble();
                        /*System.out.println("Ingrese el numero 2: ");
                        double num2 = sc.nextDouble();*/
                        return num;
                        
        
    }
    
    public static double sumar(double num1, double num2){
        
        double suma= num1 + num2;
        
        return suma;
   }
    public static double restar( double num1, double num2){
        
        double resta = num1 - num2;
        
        return resta; 
    }
    public static double multiplicar(double num1, double num2){
        
        double multiplicar = num1 * num2;
        
        return multiplicar;
    }
     public static double Divicion(double num1, double num2){
        
        double Divicion = num1 / num2;
        
        return Divicion;
     }     
     public static double Modulo (double num1, double num2){
        
        double Mod = num1 % num2;
        
        return Mod;
     }
}
