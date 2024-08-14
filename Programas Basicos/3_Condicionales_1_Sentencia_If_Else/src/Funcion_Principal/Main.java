package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            ESTRUCTURA DE LA SENTENCIA IF - ELSE
        
            IF (CONDICION){
                
                INSTRUCCION 1
        
            }ELSE{
                
                INSTRUCCION 2
                
            }
        */
        int Numero = 0;
        final int Dato = 5;
        /*PEDIMOS LOS DATOS AL USUARIO POR MEDIO DE UN JOPTION PANE*/
        Numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
        /*LLAMAMOS A LA SENTENCIA IF - ELSE*/
        if(Numero == Dato){
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO ES 5");/*INSTRUCCION NÚMERO 1*/
            
        }else{
            
            JOptionPane.showMessageDialog(null,"EL NÚMERO ES DIFERENTE DE 5");/*INSTRUCCION NÚMERO 2*/
            
        }
        /*EN ESTE CASO USAMOS == QUE SIGNIFICA QUE COMPARAMOS DOS NÚMEROS PARA SABER SI SON IGUALES*/
        /*TAMBIEN PODEMOS REEMPLAZARLO POR != QUE SIGNIFICA QUE COMPARA SI EL NÚMERO ES DIFERENTE DE OTRO*/
        /*
            EXISTEN TAMBIEN LOS OPERADORES
        
            >       MAYOR
            >=      MAYOR O IGUAL
            <       MENOR
            <=      MENOR O IGUAL
        
            TODO ESTO SIGUIENDO LA MISMA LOGICA DEL CONDICIONAL Y REGRESAN VALORES BOOLEANOS
        */
    }    
}