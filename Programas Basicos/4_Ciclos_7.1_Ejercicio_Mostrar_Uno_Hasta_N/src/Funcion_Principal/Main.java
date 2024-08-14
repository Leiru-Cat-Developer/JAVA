package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR A UN USUARIO N NUMEROS Y MOSTRAR LOS NUMEROS DEL UNO HASTA EL N
        */
        int Cantidad_De_Numeros = 0, Iterador = 0;
        Cantidad_De_Numeros = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE NÚMEROS QUE DESEA"));
        if(Cantidad_De_Numeros <= 0){
            JOptionPane.showMessageDialog(null,"LA OPERACION NO ES POSIBLE CON ESA CANTIDAD DE NÚMEROS");
        }else{
            for(Iterador = 1; Iterador <= Cantidad_De_Numeros; Iterador++){
                System.out.println(Iterador);
            }
        }
    }    
}