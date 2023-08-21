/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadorArimetico {
    //a. Sacar el promedio de puntos
    //b. Por sancion perdio 50 puntos los dias martes y miercoles 
    //c. Le van a pagar por cada 50 puntos una bonificacion de 10000 los dias lunes, martes y miercoles y los 15.000 jueves y viernes 
    //d. Cuanto dinero recibe por cada bonificacion en total y cuanto dejo de ganar por las sanciones.
    //e. Debera imprimir un informe
    public static void main (String [] agrs){
        
    int a,b,c,d,e;
    
    a=500;        
    b=400;
    c=390;
    d=510;
    e=300;        
           
    int promedioPuntos = (a+b+c+d+e)/5 ;
    
    System.out.println("Promedio de puntos es:" + promedioPuntos);
    int sancion = 50 ;
    int bSinSancion = b;
    int cSinSancion = c;
    int bConSancion = b - sancion;
    int cConSancion = c - sancion;
    System.out.println(" valor antes de la resta" + b); 
   b= b - sancion; 
   c= c - sancion;
   
   
   
   System.out.println("Se le a sanciona los dias martes " + b + "y miercoles " + c );
    
   
   int pagoBono10 = ((a+b+c)/50)*10000;
    int pagoBono15 = ((d+5)/50)*15000;
   
    int bonoTotal = pagoBono10 + pagoBono15;
    

    
 int dejoDePercibir = (((bSinSancion - b)+(cSinSancion - c))/50)*10000;
 
 System.out.println("Valor de perdida " + dejoDePercibir);

   
   



    }
}
