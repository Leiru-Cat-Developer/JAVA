package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR 10 NÚMERO Y VERIFICAR SI SE HA DIGITADO UN NÚMERO NEGATIVO
        */
        int Número_Digitado = 0;
        boolean Negativos = false;
        for(int i = 0; i < 10; i++){
            Número_Digitado = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO "+(i+1)));
            if(Número_Digitado < 0){
                Negativos = true;
            }
        }
        if(Negativos == true){
            JOptionPane.showMessageDialog(null,"EXISTE AL MENOS UN NÚMERO NEGATIVO");
        }else{
            JOptionPane.showMessageDialog(null,"NO HAY NÚMEROS NEGATIVOS");
        }
    }    
}