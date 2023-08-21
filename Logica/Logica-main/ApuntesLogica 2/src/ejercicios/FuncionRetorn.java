/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 503
 */
public class FuncionRetorn {
    
    public static void main(String[] args) {
        
        double area = calcularArea();
        
        System.out.println("Area" + area);
      
        System.out.println("Si el area es: "+ calcularArea()+ "Mts cuadre");
        
    }
    
    public static double calcularArea(){
        
        double ladoA= 30;
        double ladoB= 30;
        
        double areaTotal = ladoA*ladoB;
        
        return areaTotal;
        
    }
    
    
}
