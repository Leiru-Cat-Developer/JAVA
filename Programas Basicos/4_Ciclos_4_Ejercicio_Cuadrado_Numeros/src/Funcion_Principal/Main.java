package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            LEER UN NÚMERO Y ELEVARLO AL CUADRADO, DESPUES SEGUIR EL PROCESO
            HASTA QUE SE LE INSERTE UN NÚMERO NEGATIVO
        */
        int Número = 0, Cuadrado = 0;
        Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
        while(Número >= 0){
            
            Cuadrado = (int)Math.pow(Número,2);/*LO CONVERTIMOS A ENTERO Y LO GUARDAMOS*/
            JOptionPane.showMessageDialog(null,"EL NÚMERO "+Número+" AL CUADRADO ES: "+Cuadrado);
            Número = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OTRO NÚMERO"));
            
        }
    }    
}