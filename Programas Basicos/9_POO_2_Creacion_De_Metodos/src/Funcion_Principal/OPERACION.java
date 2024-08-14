package Funcion_Principal;
import javax.swing.JOptionPane;
public class OPERACION {
    //ATRIBUTOS
    double Número_1 = 0;
    double Número_2 = 0;
    double Suma = 0;
    double Resta = 0;
    double Multiplicación = 0;
    double División = 0;
    //METODOS
    public void Pedir_Datos_Al_Usuario(){
        Número_1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO 1"));
        Número_2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO 2"));
    }
    public void Sumar(){
        Suma = Número_1 + Número_2;
    }
    public void Restar(){
        Resta = Número_1 - Número_2;
    }
    public void Multiplicar(){
        Multiplicación = Número_1 * Número_2;
    }
    public void Dividir(){
        División = Número_1 / Número_2;
    }
    public void Mostrar_Resultados_Al_Usuario(){
        System.out.println("LA SUMA ES: "+Suma);
        System.out.println("LA RESTA ES: "+Resta);
        System.out.println("LA MULTIPLICACIÓN ES: "+Multiplicación);
        System.out.println("LA DIVISIÓN ES: "+División);
    }
}