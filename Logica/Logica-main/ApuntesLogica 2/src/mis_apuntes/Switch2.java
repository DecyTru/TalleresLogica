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
public class Switch2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int menu;
        
        System.out.println("Bienvenido que desea ordenar");
        System.out.println("desayunos Seleccione 1");
        System.out.println("almuerzo seleccione 2");
        System.out.println("cena seleccione 3");
        System.out.println("bebidas seleccione 4");
        System.out.println("snacks seleccione 5");
        System.out.println("comidas rapidas seleccione 6");
        
        System.out.println("Seleccione una opcion");
        menu = sc.nextInt();
        
        switch (menu){
          case 1:
                System.out.println("Usted elugio desayuno");
                break;
            case 2:
                System.out.println("Usted elugio Almuerso");
                break;
            case 3:
                System.out.println("Usted elugio Cena");
                break;
            case 4:
                System.out.println("Usted elugio Bebidas");
                break;
            case 5:
                System.out.println("Usted elugio Snacks");  
                break;
            case 6:
                System.out.println("Usted elugio Comidas Rapidas" 
                        +"1. Hamburguesa"
                        +"2 Pizza"
                        +"3. Lasaña");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }
        
        //Crear un menu para seleccionar platos en un restaorante 
        //Cree una opcion para desayunos, almuerzo, cena, bebidas, snacks y comidas rapidas
        
    }
    
}
