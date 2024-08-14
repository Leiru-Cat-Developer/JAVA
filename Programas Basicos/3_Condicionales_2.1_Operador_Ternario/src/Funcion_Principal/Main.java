package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            EL OPERADOR TERNARIO FUNCIONA DE LA SIGUIENTE MANERA
        
            VALOR  = (CONDICION) ? VALOR_1 : VALOR_2
        
            DEPENDIENDO DE SI LA CONDICION SE CUMPLE ES EL VALOR QUE VA A TOMAR, SI LO CONSIDERAMOS,
            SE PUEDE TOMAR COMO SI FUERA UN IF MÁS RESUMIDO QUE GUARDA VALORES EN LA VARIABLE A LA
            QUE LA IGUALEMOS
        */
        int Numero_Aleatorio = 0;
        String Mensaje;/*GUARDAMOS EL MENSAJE EN UN TIPO DE DATO DE CADENA*/
        Numero_Aleatorio = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO"));
        Mensaje = (Numero_Aleatorio%2 == 0) ? "NÚMERO PAR" : "NÚMERO IMPAR";
        /*VALOR =       (CONDICION)         ? "TRUE"   : "FALSE"*/
        JOptionPane.showMessageDialog(null,Mensaje);
        /*
            COMO LA CONDICION NOS DEVUELVE UNA CADENA O UN VALOR EN GENERAL, PODEMOS COPIAR TODO
            EL COMANDO DESDE LA CONDICION Y COLOCARLO DIRECTAMENTE EN EL MENSAJE FINAL PARA AHORRAR
            LA MEMORIA
        */
    }    
}