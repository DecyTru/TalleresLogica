/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 503
 */
public class TheGame {
    public static void main(String[] args) {
       
        int life = 5;
        
        int point = 0;
        
        int num = 1;
        
        while (life != 0){
            
        num = (int)(Math.random()* 100);
        if (num == 0){
            
                    life--;
            
            System.out.println("Le queda vidas " + life + "vidas");
            
            }else{
                    point++;
                    
                    System.out.println("Has ganado" + point);
           }
          
            
        }
        
    }
}
