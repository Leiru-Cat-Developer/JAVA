package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE LEEA NUMEROS HASTA QUE SE LE INTRODUZCA UN CERO Y SUMAR
            TODOS LOS NÚMEROS NEGATIVOS Y POSITIVOS QUE SE LE INTRODUJERON
        */
        int Resultado = 0, Numeros_Pedidos = 0;
        do{
            Numeros_Pedidos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
            if(Numeros_Pedidos != 0){
                
                Resultado += Numeros_Pedidos;
                
            }
        }while(Numeros_Pedidos != 0);
        JOptionPane.showMessageDialog(null,"LA SUMA DE TODOS LOS NÚMEROS ES: "+Resultado);
    }    
}