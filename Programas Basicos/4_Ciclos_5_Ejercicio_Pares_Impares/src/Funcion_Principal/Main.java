package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE HASTA QUE SE LE INTRODUZCA UN CERO
            LEEA NÚMEROS Y NOS INDIQUE SI EL NÚMERO ES PAR O IMPAR
        */
        int Número = 0;
        Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
        while((Número < 0)||(Número > 0)){
            
            if(Número%2 == 0){
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO ES PAR");
                
            }else{
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO ES IMPAR");
                
            }
            Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OTRO NÚMERO"));
        }
    }    
}