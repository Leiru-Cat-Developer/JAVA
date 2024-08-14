package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        //OTRA FORMA DE RELLENAR VARIABLES
        int N1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO 1"));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NÚMERO 2"));
        //CREAMOS UN OBJETO
        OPERACION OP = new OPERACION();
        OP.Sumar(N1,N2);                          //N1 y N2 SON ARGUMENTOS
        OP.Restar(N1,N2);                         //N1 y N2 SON ARGUMENTOS
        OP.Multiplicar(N1,N2);                    //N1 y N2 SON ARGUMENTOS
        OP.Dividir(N1,N2);                        //N1 y N2 SON ARGUMENTOS
        OP.Mostrar_Resultados_Al_Usuario();       //NO TIENE ARGUMENTOS
    }
}