package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       /*
            DIGITAR N SUELDOS, DESPUES PEDIR ESA N CANTIDAD DE SUELDOS Y DETERMINAR CUAL ES EL
            SUELDO MAYOR DE TODOS LOS INTRODUCIDOS
       */
       int Numero_De_Sueldos = 0;
       float Sueldo_Pedido = 0, Sueldo_Mayor = 0;
       while(Numero_De_Sueldos <= 0){
           Numero_De_Sueldos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE SUELDOS"));
       }
       for(int i = 0; i < Numero_De_Sueldos; i++){
           Sueldo_Pedido = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL SUELDO NÚMERO "+(i+1)));
           if(Sueldo_Pedido > Sueldo_Mayor){
               Sueldo_Mayor = Sueldo_Pedido;
           }
       }
       JOptionPane.showMessageDialog(null,"EL SUELDO MAYOR ES: $"+Sueldo_Mayor);
    }
}