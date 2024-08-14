package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            DE A CUERDO A LAS HORAS SEMANALES DIGITADAS POR EL USUARIO DEBEMOS DETERMINAR
            SI TRABAJA MENOS DE 40 HORAS SE LE PAGA $16 POR HORA, PERO SI SUPERA LAS 40 HORAS
            SE LE PAGAN $16 POR HORA + $20 POR CADA HORA EXTRA
        */
        int Horas_Trabajadas = 0, Salario_Total = 0;
        /*PEDIMOS LOS DATOS AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        Horas_Trabajadas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TOTAL DE HORAS SEMANALES TRABAJADAS"));
        /*DE A CUERDO AL CONDICIONAL QUE NECESITEMOS RESOLVEMOS EL EJERCICIO*/
        if(Horas_Trabajadas > 40){
            
            Salario_Total = 640 + ((Horas_Trabajadas - 40)*20);
            JOptionPane.showMessageDialog(null,(Horas_Trabajadas - 40)+" HORAS EXTRAS, SU PAGO ES DE: $"+Salario_Total);
            
        }else{
            
            Salario_Total = Horas_Trabajadas * 16;
            JOptionPane.showMessageDialog(null,"NINGUNA HORA EXTRA, SU PAGO TOTAL ES DE: $"+Salario_Total);
            
        }
    }    
}