package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADA UNA NOTA DE 0 - 10
            NOS DIGA SI ES:
            
            -   INSUFICIENTE
            -   SUFICIENTE
            -   BIEN
            -   NOTABLE
            -   SOBRESALIENTE
        */
        int Nota_Alumno = 0;
        /*PEDIMOS LOS DATOS AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        Nota_Alumno = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA NOTA FINAL DEL ALUMNO"));
        /*RESOLVEMOS EL EJERICIO POR MEDIO DE UN SWITCH COMO EN EL EJERCICIO ANTERIOR*/
        switch (Nota_Alumno){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:     JOptionPane.showMessageDialog(null,"LA NOTA DEL ALUMNO ES INSUFICIENTE");
                break;
            case 6:     JOptionPane.showMessageDialog(null,"LA NOTA DEL ALUMNO ES SUFICIENTE");
                break;
            case 7:     JOptionPane.showMessageDialog(null,"LA NOTA DEL ALUMNO ES BUENA");
                break;
            case 8:
            case 9:     JOptionPane.showMessageDialog(null,"LA NOTA DEL ALUMNO ES NOTABLE");
                break;
            case 10:    JOptionPane.showMessageDialog(null,"LA NOTA DEL ALUMNO ES SOBRESALIENTE");
                break;
            default:    JOptionPane.showMessageDialog(null,"FUERA DE RANGO");
                break;
        }
    }    
}