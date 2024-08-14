package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR 10 NÚMEROS Y ESCRIBIR LA SUMA TOTAL
        */
        float Pedir_Numero = 0, Resultado = 0;
        for(int Iterador = 1; Iterador <= 10; Iterador++){
            
            Pedir_Numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO "+Iterador));
            Resultado += Pedir_Numero;
            
        }
        System.out.println("EL RESULTADO ES: "+Resultado);
    }    
}