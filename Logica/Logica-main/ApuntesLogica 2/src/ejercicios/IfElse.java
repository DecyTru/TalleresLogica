/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class IfElse {

    public static void main(String [] args){

        // validar si una persona es mayor de edad , puede ingresar sino no puede

        int edad1=18;
        int edad2=15;

        if(edad1 <= edad2){
            System.out.println("La persona puede ingresar?: ");
        }
        
        // Validar si una persona gana menos de dos salarios minimos se le paga auxilio de transporte si no se le paga el salario convenido

        boolean salarioMenor = true;
        boolean salarioMayor = false;

        if(salarioMenor == true || salarioMayor == true){
            System.out.println("Gana el minimo");
        }else{
            System.out.println("si se le paga el axilio de transporte");
        }

        // int num1 = 30; int num2 = 32;

        int num1 = 30;
        int num2 = 32;

        //validar si el num1 es menor que el num2 y cual es la diferencia

        if(num1 < num2){
            System.out.println("El num1 es menor que num2?");
        }else{
            System.out.println("Si es menor");
        }
        // validar si num1 es igual que num2

       if(num1 == num2){
            System.out.println("El num1 es igual que num2");
       }else{
            System.out.println("No es igual");
        }
        // validar si num1 es diferente que num2

        if(num1 != num2){
            System.out.println("Es num1 es diferente que num2");
        }else{
            System.out.println("Si es diferente");
        }
        // validar si num2 es mayor que num1 y cual es la diferencia

        if(num2 > num1){
            System.out.println("Es num2 es mayor que num1");
        }else{
            System.out.println("Si num2 es mayor");
        }
        //castear num1 y num2 y realizar una division, una multiplicacio; suma y resta
        int a, b, suma, resta, multi, div;

        a = num1;
        b = num2;

        suma= a+b;
        resta = a-b;
        multi= a*b;
        div= b/a;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multi);
        System.out.println("El resultado de la division es: " + div);

        // tipo num3 = num1 - num2;------ tipo suma =num 1 + num2; realizar la siguiente operacion num1%num2 , explicar el resultado

        int num3= num1 - num2;
        System.out.println("num3 es de:" + num3);

        int suma1 = num1 + num2;
        System.out.println("suma1 es de" + suma1);

        double total= num1/num2;
        System.out.println("el resultado es:" + total + "Porque al dividir el num1 y el num2 da un resultado con punto por lo tanto al estar en int habra que cambiarlo a double");

    }
    





// int num1 = 30; int num2 = 32;
    
//validar si el numero 1 es menor que el num2 y cual es la diferencia
    // validar si num1 es igual que num2
    // validar si num1 es diferente que num2
    // validar si num2 es mayor que num1 y cual es la diferencia
    //castear num1 y num2 y realizar una division, una multiplicacio; suma y resta
    // tipo num3 = num1 - num2;------ tipo suma =num 1 + num2;
//realizar la siguiente operacion num1%num2 , explicar el resultado
    
}
