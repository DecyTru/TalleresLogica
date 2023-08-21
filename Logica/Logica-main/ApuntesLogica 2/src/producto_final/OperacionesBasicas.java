package producto_final;

import javax.swing.*;

public class OperacionesBasicas {
    int numero1;
    int numero2;
    double resultado;

    public OperacionesBasicas() {
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }

    public void Suma() {

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void Resta(){

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " +resultado);
    }
    public void Division(){

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = numero1 / numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " +resultado);
    }
    public void Multiplicacion(){

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " +resultado);
    }
    public void Modulo(){

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        resultado = numero1 % numero2;
        JOptionPane.showMessageDialog(null, "El resultado es: " +resultado);
    }
}