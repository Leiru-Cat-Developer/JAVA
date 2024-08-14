package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE PIDA DOS NÚMEROS Y QUE DECIFRE CUAL ES
            MAYOR -- MENOR -- IGUAL A LOS DOS NÚMEROS QUE SE DIGITARON
        */
        int Numero_Int_1 = 0, Numero_Int_2 = 0;
        /*PEDIMOS LOS DOS NÚMEROS AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        Numero_Int_1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NÚMERO"));
        Numero_Int_2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NÚMERO"));
        /*AHORA CON EL CONDICIONAL IF - ELSE COMPARAMOS TODAS LAS POSIBLES OPCIONES*/
        if(Numero_Int_1 > Numero_Int_2){
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO MAYOR ES: "+Numero_Int_1);
            
        }else if(Numero_Int_1 < Numero_Int_2){
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO MAYOR ES: "+Numero_Int_2);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"AMBOS NÚMEROS SON IGUALES");
            
        }
        /*A ESTA SENTENCIA SE LE CONOCE COMO IF - ELSE ANIDADO, PUES SON MUCHAS OPCIONES UNIDAS CON EL MISMO METODO*/
    }    
}