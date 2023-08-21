/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author Decy
 */
public class Ejercicio7 {
        public static void main(String[] args) {
       
        int life = 5;
        
        int point = 5;
        
        int num = 1;
        
        while (life != 0){
            
        num = (int)(Math.random()* 100);
        if (num == 3){
            
                    life--;
            
            System.out.println("Le queda " + life + " vidas");
            
            }else{
            
                    point++;
                    
                    System.out.println("Has ganado 1 punto: " + point);
           }
          
            
        }
        
    }
}
