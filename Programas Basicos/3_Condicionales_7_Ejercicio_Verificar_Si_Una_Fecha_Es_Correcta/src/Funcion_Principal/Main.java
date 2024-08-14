package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADA UNA FECHA EN DIA - MES - AÑO
            NOS DIGA SI LA FECHA ES CORRECTA, CONSIDERAR MESES DE 30 DÍAS
            COMO MÁXIMO
        */
        int Dia = 0, Mes = 0, Año = 0;
        /*PEDIMOS LOS DATOS POR MEDIO DE UN JOPTION PANE*/
        Dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DÍA"));
        Mes = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL MES"));
        Año = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO"));
        /*COMPROBAMOS DE MANERA LOGICA SI LAS FECHAS SON CORRECTAS*/
        if( (Dia>=1) && (Dia<=30) && (Mes>=1) && (Mes<=12) && (Año>0) ){
           
            JOptionPane.showMessageDialog(null,"LA FECHA ES CORRECTA ...");
            
        }else{
            
            JOptionPane.showMessageDialog(null,"LA FECHA ES INCORRECTA ...");
            
        }
    }    
}