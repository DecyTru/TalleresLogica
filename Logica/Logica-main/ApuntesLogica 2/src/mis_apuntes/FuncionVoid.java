/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;



/**
 *
 * @author 505
 */
import java.util.Scanner;
public class FuncionVoid {
    static Scanner sc = new Scanner (System.in);
    //-----------------Variable--------------------
    
    static int opc;
    //-----------------Main-----------------
    
    public static void main(String[] args) {
       
        
        System.out.println("Sleccione\n 1 Bebidas\n 2.Snacks");
        opc = sc.nextInt();
        switch(opc){
            case 1:
                System.out.println("Mostrar Bebidas");
                printSwitch();
                break;
            case 2:
                System.out.println("Mostrar Snacks");
             menuSnacks();
             break;
            default:
                System.out.println("Seccione una opcion valida");
        }
                
        
          
        
            
    }
   //------------------Funcion-------------------------
    
    public static void printSwitch(){
        System.out.println("Seleccione una opcion");
        
        System.out.println("1. Cocacola   "
                + "  2. Manzana   "
                + "  3. Jugo Natural");
  
         opc = sc.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("  1. Coca-cola  ");
                break;
            case 2:
                System.out.println("  2. Manzana   ");
                break;
            case 3:
                System.out.println("3. Jugo Natural  ");
                break;
            default:
                    System.out.println("No es valida tu opcion"); 
        }
    }
        //------------------Funcion-------------------------
   
    public static void menuSnacks(){
            
            System.out.println("Seleccione una opcion \n"
            +"1. Chocoolates \n"
            + "2. Deditos \n"
            + "3. Pastelitos \n");  
            
            opc = sc.nextInt();
            
            switch(opc){
                
                case 1:
                    System.out.println("Seleccione chocolate");
                    break;
                case 2:
                    System.out.println("Seleccione Deditos");
                    break;
                case 3:
                    System.out.println("Seleccione Pastelitos");
                    break;
                default:
                    System.out.println("Porfavor introducir numero valido");
            }
    }
}
            
        
        
        
    
            

