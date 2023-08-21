/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class CasteoVariable {
    public static void main(String [] agrs ){
    
    int a,b,suma,resta,multi,div ;
    a= 4;
    b= 10;
    suma= a+b;
    resta = a-b;
    multi = a*b;
    div = b/a;
    System.out.println("El resultado de la suma es: "+ suma );
     System.out.println( "El resultado de las resta es:" + resta   );
      System.out.println("El resultado de las multi es" + multi);
       System.out.println("El resultado de las div es" + div   );
    
       //para evitar la perdida de informacion en la div b/a de tipo
       //realizo un casting de variables 
       float divFloat = (float) b/a; 
       System.out.println( "El valor exacto de div es:"  + divFloat);
    }
    
    
    
}
