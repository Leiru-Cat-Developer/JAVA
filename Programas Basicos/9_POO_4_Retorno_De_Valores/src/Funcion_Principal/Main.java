package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        int N1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO 1"));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO 2"));
        //CREAMOS UN OBJETO
        OPERACION OP = new OPERACION();
        //CREAMOS VARIABLES LOCALES
        int Suma = 0, Resta = 0, Multiplicación = 0, División = 0;
        Suma = OP.Sumar(N1,N2);
        Resta = OP.Restar(N1,N2);
        Multiplicación = OP.Multiplicar(N1,N2);
        División = OP.Dividir(N1,N2);
        //MOSTRAMOS LOS RESULTADOS EN PANTALLA Y LE PASAMOS LOS PARAMETROS AL METODO
        OP.Mostrar_Resultados_Al_Usuario(Suma,Resta,Multiplicación,División);
        /*
            TAMBIEN SE PUEDEN IMPRIMIR DIRECTAMENTE:
        
            System.out.println("LA SUMA ES: "+OP.Sumar(N1,N2));
        */
    }
}