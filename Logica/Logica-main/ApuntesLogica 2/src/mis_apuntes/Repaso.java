/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class Repaso {
    public static void  main(String [] args){
    
    //variables
     byte nun1 = 127;
     short num2 = 32767;
     int num3 = 2147483646;
     long num4 = 9223372036854775807l;
     long num5 = 2334567;
     float num6 = 4.55684290595868587574374f;
    double num7 = 5.456884736323947857348;
    char caracter = 64;
    boolean isON; // cuando declaramos una variable boolean esta por defecto es 
    //falsa.
    
     isON= true;
             
    //System.out.println("Float: " + num6);
    //System.out.println("double: " + num7);
    System.out.println (caracter);
    System.out.println (isON);
    
    /*** Operadores Aricmeticos***/
    //son +,-,/,*,%
    int a;
    int b;
    int c;
    // o se pueden declarar todas en la misma linea 
    int d, e;
    
    // a =500, b = 400, c = 390, d = 510 , e = 300
     a =500;
     b = 400; 
     c = 390;
     d = 510;
     e = 300;
     //suma
     
     int puntosTotales = a+b+c+d+e;
    
     System.out.println("en total de puntos obtenidos porpepito es de :" + puntosTotales);
           
     

// Variable tipo string
          

String name = "Pepito"; 
String name2 = "Pepito";


boolean compare = name.equals(name2);

  System.out.println("Name y Name2 son iguales? " + compare); 
          
    //a. Sacar el promedio de puntos
    //b. Por sancion perdio 50 puntos los dias martes y miercoles 
    //c. Le van a pagar por cada 50 puntos una bonificacion de 10000 los dias lunes, martes y miercoles y los 15.000 jueves y viernes 
    //d. Cuanto dinero recibe por cada bonificacion en total y cuanto dejo de ganar por las sanciones.
    //e. Debera imprimir un informe
     
   int promedioPuntos = (a+b+c+d+e)/5 ;
    
    System.out.println("Promedio de puntos es:" + promedioPuntos);
      System.out.println("valor de b antes de la resta" + b);
    
  System.out.println("Promedio de puntos es:" + promedioPuntos);
    int sancion = 50 ;
    int bSinSancion = b;
    int cSinSancion = c;
    int bConSancion = b - sancion;
    int cConSancion = c - sancion;
    System.out.println(" valor antes de la resta" + b); 
   b= b - sancion; 
   c= c - sancion;
   // b-= sancion; es la manera corta
   
   
   System.out.println("Se le a sanciona los dias martes " + b + "y miercoles " + c );
    
   
   int pagoBono10 = ((a+b+c)/50)*10000;
    int pagoBono15 = ((d+5)/50)*15000;
   
    int bonoTotal = pagoBono10 + pagoBono15;
    
//cuanto dejo de percibir
    
 int dejoDePercibir = (((bSinSancion - b)+(cSinSancion - c))/50)*10000;
 
 System.out.println("Valor de perdida " + dejoDePercibir);
           
   
          
    
     
          
          
          
    }
    
    
            
            
 }


