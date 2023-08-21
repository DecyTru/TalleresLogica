package producto_final;

import javax.swing.*;

public class Main {

static int option;
static String menu;
    public static void main(String[] args) {

        OperacionesBasicas object = new OperacionesBasicas();

        do{
          menu = JOptionPane.showInputDialog("Menu Preincipal\n" + "1. Suma\n" + "2. Resta\n" + "3. Divicion\n" + "4.Multiplicacion\n" + "5.Modulo\n" + "6.Salir");
          option = Integer.parseInt(menu);
          switch (option){
              case 1:
                  object.Suma();
                  break;
              case 2:
                  object.Resta();
                  break;
              case 3:
                  object.Division();
                  break;
              case 4:
                  object.Multiplicacion();
                  break;
              case 5:
                  object.Modulo();
                  break;
          }
        }while (option != 6);
    }
}
