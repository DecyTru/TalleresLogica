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
public class Arrays2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
     String flores[]={"Crisanteno","Loto","Girasoles","Loto","Margaritas","Orquideas"};   
     
        System.out.println("El tamaño del array es: " + flores.length);
        
        for(int j = 0; j<flores.length; j++){
            
            System.out.println("La flor es: " + flores[j]);
        }
        
        //Podemos acceder a la posicion indicando la misma
        
        System.out.println("La flor en la posicion 0 es " + flores[0]);
        
        //Podemos definir una array y agregar elementos en las distintas posiciones
        
        int tallas[]; //Esto es definir una array
        
        tallas= new int [7]; //Esto es declarar el array 
        
        int n = 0;
        
        System.out.println("El numero de tallas de hombre es: ");
        
        n=sc.nextInt();
        
        int tallasHombres [] = new int[n]; //Define y se declarar el array
        
        System.out.println("La longitud del array es: " + tallasHombres.length);
        
        tallasHombres[0] = sc.nextInt();
        tallasHombres[1] = sc.nextInt();
        tallasHombres[2] = sc.nextInt();
        tallasHombres[3] = sc.nextInt();
        tallasHombres[4] = sc.nextInt();
        
        for(int i=0; i < tallasHombres.length; i++){
            
            System.out.println("La talla  " + i + " es: " + tallasHombres[i]);
            
        }
            
        
    }
    
}
