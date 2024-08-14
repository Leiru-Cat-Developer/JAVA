package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE DADAS DOS NÚMEROS DEL USUARIO NOS DE LA OPERACION
            QUE EL USUARIO QUIERA POR MEDIO DE COMANDOS QUE PUEDEN SE:
        
            SUMA                ->      S   s
            RESTA               ->      R   r
            MULTIPLICACION      ->      P   p   M   m
            DIVISION            ->      D   d
        */
        double Numero_Uno = 0, Numero_Dos = 0;
        char Opcion;
        /*PEDIMOS LOS DATOS POR MEDIO DE UN JOPTION PANE*/
        Numero_Uno = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO"));
        Numero_Dos = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO"));
        Opcion = JOptionPane.showInputDialog("DIGITE LA OPERACION QUE QUIERE [S,R,M o P, D]").charAt(0);
        /*REALIZAMOS LOS CONDICIONALES NECESARIOS PARA RESOLVER EL EJERCICIO*/
        switch(Opcion){
            case 'S':   
            case 's':   JOptionPane.showMessageDialog(null,"LA SUMA ES: "+(Numero_Uno + Numero_Dos));
                break;
            case 'R':
            case 'r':   JOptionPane.showMessageDialog(null,"LA RESTA ES: "+(Numero_Uno - Numero_Dos));
                break;
            case 'M':
            case 'm':
            case 'P':
            case 'p':   JOptionPane.showMessageDialog(null,"LA MULTIPLICACION ES: "+(Numero_Uno * Numero_Dos));
                break;
            case 'D':
            case 'd':   JOptionPane.showMessageDialog(null,"LA DIVISION ES: "+(Numero_Uno / Numero_Dos));
                break;
            default:    JOptionPane.showMessageDialog(null,"ESTA OPCION NO EXISTE");
                break;
        }
    }    
}