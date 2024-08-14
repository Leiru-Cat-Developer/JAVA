package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            PEDIR UN NÚMERO ENTRE 0 - 99,999 Y DECIR CUANTAS CIFRAS TIENE
        */
        int Cifra = 0;
        /*PEDIMOS LOS DATOS POR MEDIO DE UN JOPTION PANE*/
        Cifra = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NÚMERO ENTRE 0 - 99,999"));
        /*HACEMOS NUESTRAS CONVERSIONES NECESARIAS*/
        if((Cifra >= 0) && (Cifra <= 99999)){
            
            /*CONVERTIMOS NUESTO DATO EN UNA CADENA, PARA LEERLO CON UN METODO DE LECTURA Y LO IGUALAMOS A UNA VARIABLE*/
            String Longitud = Integer.toString(Cifra);
            /*COMO LA CADENA YA ESTA CONVERTIDA, AHORA SOLO LLAMAMOS AL METODO LENGTH QUE NOS DARA LA LONGITUD DE LA CADENA*/
            JOptionPane.showMessageDialog(null,"EL NÚMERO "+Cifra+" TIENE: "+Longitud.length()+" CIFRA(s)");
            
        }else{
            
            /*MOSTRAMOS EL MENSAJE DE ERROR*/
            JOptionPane.showMessageDialog(null,"EL NÚMERO QUE SE INGRESO ESTA FUERA DE RANGO");
            
        }
    }    
}