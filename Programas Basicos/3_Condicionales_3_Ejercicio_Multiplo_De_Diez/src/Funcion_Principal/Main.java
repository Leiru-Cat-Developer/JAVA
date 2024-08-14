package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE IDENTIFIQUE CUANDO UN NÚMERO ENTERO QUE LEEA
            SEA MULTIPLO DE 10
        */
        int Numero_Int = 0;
        /*PEDIMOS EL NÚMERO AL USUARIO*/
        Numero_Int = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO ENTERO"));
        /*APLICAMOS EL CONDICIONAL NECESARIO*/
        if(Numero_Int % 10 == 0){
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO ES MULTIPLO DE DIEZ");
            
        }else{
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO NO ES MULTIPLO DE DIEZ");
            
        }
        /*
            OTRA MANERA DE HACERLO CON EL OPERADOR TERNARIO
        
            JOptionPane.showMessageDialog(null,(Numero_Int%10 == 0) ? "EL NÚMERO ES MULTIPLO DE DIEZ" : "EL NÚMERO NO ES MULTIPLOD DE DIEZ");
        */
    }    
}