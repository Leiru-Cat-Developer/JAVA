package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA EN EL QUE SE DIGITE UNA CANTIDAD DE DINERO
            Y AL REBASAR LOS $300, SE LE HAGA UN DESCUENTO DEL 20% Y SOLO
            SE IMPRIMA SU COMPRA CON DESCUENTO APLICADO
        */
        float Total_Compra = 0, Total_Con_DESCUENTO = 0;
        /*PEDIMOS LOS DATOS AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        Total_Compra = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL TOTAL DE COMPRA  $$$"));
        /*COMPARAMOS LOS DATOS CON LO QUE NOS PIDE EL EJERCICIO*/
        if(Total_Compra >= 300){
            
            Total_Con_DESCUENTO = Total_Compra - (Total_Compra * 0.2f);/*RECORDAMOS PONER F A LOS NÚMEROS FLOTANTES*/
            JOptionPane.showMessageDialog(null,"20% APLICADO, SU TOTAL A PAGAR ES: $"+Total_Con_DESCUENTO);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"NO APLICA DESCUENTO, SU TOTAL A PAGAR ES: $"+Total_Compra);
            
        }
    }    
}