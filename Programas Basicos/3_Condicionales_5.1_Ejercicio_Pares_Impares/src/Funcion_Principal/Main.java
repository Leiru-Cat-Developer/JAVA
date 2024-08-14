package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADOS DOS NUMEROS NOS DIGA SI AMBOS
            SON PARES O IMPARES, O APLICANDO VARIACIONES
        */
        int Numero_Uno = 0, Numero_Dos = 0;
        /*PEDIMOS LOS DATOS AL USUARIO MEDIANTE UN JOPTION PANE*/
        Numero_Uno = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PRIMER NÚMERO"));
        Numero_Dos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NÚMERO"));
        /*HACEMOS LA COMPARACION DE LOS DOS NÚMEROS PARA SABER SI AMBOS SON PARES O IMPARES*/
        if((Numero_Uno%2==0)&&(Numero_Dos%2==0)){
            
            /*EL SIMBOLO && SIGNIFICA 'Y' PARA QUE SE CUMPLAN DOS CONDICIONES*/
            JOptionPane.showMessageDialog(null,"AMBOS NÚMEROS SON PARES");
            
        }else if((Numero_Uno%2!=0)&&(Numero_Dos%2!=0)){
            
            /*EL SIMBOLO != SIGNIFICA QUE ES DIFERENTE, Y EL SIGNO == SIGNIFICA QUE ES IGUAL*/
            JOptionPane.showMessageDialog(null,"AMBOS NÚMEROS SON IMPARES");
            
        }else if((Numero_Uno%2==0)&&(Numero_Dos%2!=0)){
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO "+Numero_Uno+" ES PAR Y EL NÚMERO "+Numero_Dos+" ES IMPAR");
            
        }else if((Numero_Uno%2!=0)&&(Numero_Dos%2==0)){
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO "+Numero_Uno+" ES IMPAR Y EL NÚMERO "+Numero_Dos+" ES PAR");
            
        }
    }    
}