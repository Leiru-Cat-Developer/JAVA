package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADA UNA FECHA DIA - MES - AÑO
            NOS DIGA SI LA FECHA ES CORRECTA, DEBEMOS CONSIDERAR
            MESES CON DIAS DE 28, 30 Y 31
        */
        int Dia = 0, Mes = 0, Año = 0;
        /*PEDIMOS LOS DATOS POR MEDIO DE UN JOPTION PANE*/
        Dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DÍA"));
        Mes = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO"));
        Año = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO"));
        /*RESOLVEMOS EL PROBLEMA CON LA LOGICA NECESARIA DE LOS CONDICIONALES*/
        if( (Dia>=1)&&(Dia <= 28)&&(Mes == 2)&&(Año>0) ){
            
            /*CONDICIONAL PARA EL MES DE FEBRERO*/
            JOptionPane.showMessageDialog(null,"LA FECHA ES CORRECTA ...");
            
        }else if( ((Mes == 4)||(Mes == 6)||(Mes == 9)||(Mes == 11))&&(Dia >= 1)&&(Dia <= 30)&&(Año>0) ){
            
            /*CONDICIONAL PARA LOS MESES ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE*/
            JOptionPane.showMessageDialog(null,"LA FECHA ES CORRECTA ...");
            
        }else if ( ((Mes == 1)||(Mes == 3)||(Mes == 5)||(Mes == 7)||(Mes == 8)||(Mes == 10)||(Mes == 12))&&(Dia >= 1)&&(Dia <= 31)&&(Año>0) ){
            
            /*CONDICIONAL PARA LOS MESES ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE*/
            JOptionPane.showMessageDialog(null,"LA FECHA ES CORRECTA ...");
            
        }else{
            
            JOptionPane.showMessageDialog(null,"LA FECHA ES INCORRECTA ...");
            
        }
    }    
}