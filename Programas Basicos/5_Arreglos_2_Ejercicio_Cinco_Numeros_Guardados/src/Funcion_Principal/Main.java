package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR CINCO NÚMEROS Y GUARDARLOS EN UN ARREGLO, Y DESPUES IMPRIMIRLOS EN EL MISMO ORDEN
        */
        float Numeros[] = new float[5];/*ASÍ SE DECLARA UN ARREGLO EN JAVA*/
        for(int i = 0; i < 5; i++){
            
            Numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL NÚMERO "+(i+1)));
            
        }
        /*DESPUES SIMPLEMENTE LOS IMPRIMIMOS EN EL MISMO ORDEN*/
        for(float i:Numeros){
            
            JOptionPane.showMessageDialog(null,i);
            
        }
        /*EN LOS BUCLES NORMALMENTE SE USAN SOLO LETRAS COMO ITERADORES PARA NO HACER MÁS GRANDE EL CÓDIGO*/
    }    
}