package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR UN NÚMERO Y CALCULAR SU FACTORIAL
        
            N! = 1*2*3*...*N
        */
        long Numero_Aleatorio = 0, Factorial = 1;
        Numero_Aleatorio = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
        if(Numero_Aleatorio < 0){
            
            Numero_Aleatorio *= -1;
            for(int Iterador = 1; Iterador <= Numero_Aleatorio; Iterador++){
            
                Factorial *= Iterador;
            
            }
            Factorial *= -1;
            JOptionPane.showMessageDialog(null,"EL FACTORIAL ES: "+Factorial);
        }else{
            
            for(int Iterador = 1; Iterador <= Numero_Aleatorio; Iterador++){
            
                Factorial *= Iterador;
            
            }
            JOptionPane.showMessageDialog(null,"EL FACTORIAL ES: "+Factorial);
        }
    }    
}