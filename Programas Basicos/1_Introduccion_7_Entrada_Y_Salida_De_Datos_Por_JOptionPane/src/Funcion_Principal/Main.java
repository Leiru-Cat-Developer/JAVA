package Funcion_Principal;
import javax.swing.JOptionPane;/*LIBRERIA IMPORTADA POR JOptionPane*/
public class Main {
    public static void main(String[] args) {
        /*
            PARA UTILIZA ESTE TIPO DE VIZUALIZADOR DE TEXTO EN PANTALLA, PRIMERO DEBEMOS AGREGAR
            LA SIGUIENTE FRASE A UNA DE LAS VARIABLES PARA QUE IMPORTE LA LIBRERIA NECESARIA
            PARA INCIAR EL PROCESO:
            
            VARIABLE = JOptionPane.showInputDialog("Texto");
            VARIABLE = JOptionPane.showInputDialog("Texto").charAt(0);
        
            GRACIAS A ESTE COMANDO, SE GUARDA DENTRO DE LA VARIABLE POR UNA VENTANA EMERGENTE QUE
            HACE MUCHO MÁS SENCILLO GUARDAR ESPECIFICAMENTE LAS CADENAS, Y PARA LOS CARACTERES
            SOLO SE LE AGREGA DESPUES EL ".CHARAT(0)"
        
            POR OTRO LADO SI QUEREMOS GUARDAR NÚMEROS, DEBEMOS HACER LA CONVERSION DE LA CADENA, HAY DE
            DOS MANERAS, LA PRIMERA ES PULSAR EL SOLUCIONADOR DE PROBLEMAS DE LA LINEA DE CÓDIGO O EN CASO
            DE QUE NO FUNCIONES DEBEMOS ESCRIBIR LO SIGUIENTE:
        
            Valor_Int = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO ENTERO"));
        
            ESTO SE REPITE CON "FLOAT, DOUBLE, LONG, BITES, ETC"
        */
        String Valor_String;
        int Valor_Int;
        double Valor_Double;
        char Valor_Char;
        
        Valor_String = JOptionPane.showInputDialog("DIGITE UNA CADENA DE CARACTERES");
        Valor_Int = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO ENTERO"));
        Valor_Double = Double.parseDouble(JOptionPane.showInputDialog("DIGITE UN NÚMERO DOUBLE"));
        Valor_Char = JOptionPane.showInputDialog("DIGITE UNA LETRA").charAt(0);
        /*
            PARA MOSTRAR LOS DATOS UTILIZAMOS EL MISMO COMANDO PERO EN LUGAR DE "SHOW INPUT DIALOG"
            UTILIZAMOS EL COMANDO "SHOW MESSAGE DIALOG" QUE NOS DARA DOS PARAMETROS QUE LLENAREMOS
            DE LA SIGUIENTE MANERA:
        
            JOptionPane.showMessageDialog(null , "TEXTO" + VARIABLES);
        */
        JOptionPane.showMessageDialog(null, "LA CADENA ES:  "+Valor_String);
        JOptionPane.showMessageDialog(null, "EL NUMERO ENTERO ES:  "+Valor_Int);
        JOptionPane.showMessageDialog(null, "EL NUMERO DOUBLE ES:  "+Valor_Double);
        JOptionPane.showMessageDialog(null, "LA CARACTER ES:  "+Valor_Char);
    }    
}