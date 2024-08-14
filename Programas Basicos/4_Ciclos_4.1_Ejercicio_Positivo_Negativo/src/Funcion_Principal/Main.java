package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE LEEA NUMEROS NEGATIVOS Y POSITIVOS, E INDIQUE SU NATURALEZA
            HASTA QUE SE LE INDIQUE UN NÚMERO CERO
        */
        int Número = 0;
        Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
        while((Número<0)||(Número>0)){
            
            if(Número > 0){
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO ES POSITIVO");;
                
            }else{
                
                JOptionPane.showMessageDialog(null,"EL NÚMERO ES NEGATIVO");
                
            }
            
            Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OTRO NÚMERO"));
            
        }
    }    
}