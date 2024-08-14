package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE LEEA NÚMERO HASTA QUE SE LE INGRESE UN NÚMERO
            NEGATIVOS Y DECIR CUANTOS NÚMEROS SE INTRODUJERON
        */
        int Número = 0, Contador = 0;
        while(Número >= 0){
            
            Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
            if(Número >= 0){
                
                Contador++;
             
            }
            /*PODEMOS QUITAR EL IF POR QUE AL ENTRAR EN LA CONDICION DA POR HECHO QUE ES POSITIVO*/
        }
        JOptionPane.showMessageDialog(null,"EL TOTAL DE NÚMEROS INTRODUCIDOS ES: "+Contador);
    }    
}