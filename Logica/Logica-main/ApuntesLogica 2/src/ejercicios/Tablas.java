/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author desarrollo
 */
public class Tablas {
    public static void main(String[] args){
    frutas();
    redesSociales();
    salarioMinimo();
    }
public static String frutas(){
  String[] frutas={"banana","fresa","Mango","limon","parchita"};
  int size= frutas.length;
  for (int i=0; i<frutas.length; i++) {
             System.out.println("El numero de frutas " + i + " es " + frutas[i]);
  }
        return null;
}
public static String redesSociales (){
String[] redes={"Facebook","Instagram","X","Meet","Thresds"};
  int size= redes.length;
  for (int i=0; i<redes.length; i++) {
             System.out.println("El numero de frutas " + i + " es " + redes[i]);
            }
        return null;
}
public static float notas (){
float [] notas = {3.5f,4.5f,2.2f,1.0f,5.0f};
        
  float size= notas.length;
  for (int i=0; i<notas.length; i++) {
             System.out.println("El numero de frutas " + i + " es " + notas[i]);
            }
        return 0;
        
}
public static double salarioMinimo(){
    
    
double[] salario = {616.000,566.700,737.717,877.803,828.116,781.242};
double size= salario.length;
for (int i=0; i<salario.length; i++){
            System.out.println("El salario minimo del año es: " + i + " es " + salario[i]);
}
        return 0;
}
}
