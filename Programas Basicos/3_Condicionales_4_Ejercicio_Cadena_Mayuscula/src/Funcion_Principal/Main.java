package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE LEEA UN CARACTER, Y NOS DIGA SI EL CARACTER
            ES UNA LETRA MAYUSCULA O MINUSCULA
        */
        char Caracter;
        /*PEDIMOS LOS DATOS AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        Caracter = JOptionPane.showInputDialog("DIGITE UNA LETRA").charAt(0);/*RECORDAMOS COLOCAR EL CHARAT(0)*/
        /*APLICAMOS EL CONDICIONAL QUE NECESESITEMOS PUES SE PUEDE DE MUCHAS MANERAS*/
        JOptionPane.showMessageDialog(null,(Character.isUpperCase(Caracter)) ? "SE HA DIGITADO UNA LETRA MAYUSCULA" : "SE HA DIGITADO UNA LETRA MINUSCULA");
        /*
            ESTE METODO NOS DEVUELVE UN VALOR BOOLEANO QUE LA SENTENCIA DETECTA
            Y ESTO NOS DICE QUE ES UN TIPO DE DATO NO PRIMITIVO
        
            EL METODO ES:
        
            Character.isUpperCase(VARIABLE)
        
            PRIMERO DETECTA SI ES MAYUSCULA, Y DESPUES SI ES UNA MINUSCULA ASÍ QUEDARIA QUE
             
            MAYUSCULA = TRUE y MINUSCULA = FALSE
        */
    }    
}