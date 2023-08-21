/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
 import java.util.Scanner;
/**
 *
 * @author 505
 */
public class Condicional {
    
    static Scanner sc=new Scanner (System.in);
    public static void main (String[] args){
        //-------------------------//
    int num1= 5;
    int num2= 5;
    boolean isEcual= num1== num2;
     System.out.println("es igual"+ isEcual);
     String word= "hola";
     String word2= "hola";
     boolean resulte = word.equals (word2);
     System.out.println("hola"+ resulte);
     //-----------------------//
     String name="Pepito";
     String email= "pepito@gmail.com";
     int password=123456;
     
     System.out.println("ingrese el email: ");
     String emailUser= sc.nextLine();
     System.out.println("Ingrese contraseña: ");
     int passUser= sc.nextInt();
     
     if (email.equals(emailUser)&& password==passUser){System.out.println("Bienvenidos "+ name );
     }else{ 
         System.out.println("Los datos no coinciden ");}
     
        
    }
 
    
}
