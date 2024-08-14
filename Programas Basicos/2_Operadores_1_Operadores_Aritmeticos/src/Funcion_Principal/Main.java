package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Lectura_Datos = new Scanner(System.in);
        float Numero_Cualquiera_1 = 0, Numero_Cualquiera_2 = 0;
        
        System.out.print("DIGITA EL NÚMERO 1: ");   Numero_Cualquiera_1 = Lectura_Datos.nextFloat();
        System.out.print("DIGITA EL NÚMERO 2: ");   Numero_Cualquiera_2 = Lectura_Datos.nextFloat();
        
        /*O P E R A D O R E S           A R I T M E T I C O S*/
        float Suma = Numero_Cualquiera_1 + Numero_Cualquiera_2;
        float Resta = Numero_Cualquiera_1 - Numero_Cualquiera_2;
        float Multiplicacion = Numero_Cualquiera_1 * Numero_Cualquiera_2;
        float Division = Numero_Cualquiera_1 / Numero_Cualquiera_2;
        float Residuo = Numero_Cualquiera_1 % Numero_Cualquiera_2;
        /*
            LO MÁS RECOMENDABLE ES DECLARAR TODAS LAS VARIABLES EN UNA MISMA LINEA DE CODIGO
            Y DESPUES IGUALARLAS A LA OPERACION QUE NECESITAMOS
        */
        System.out.println("\n"+"LA SUMA ES: "+Suma);
        System.out.println("LA RESTA ES: "+Resta);
        System.out.println("LA MULTIPLICACION ES: "+Multiplicacion);
        System.out.println("LA DIVISION ES: "+Division);
        System.out.println("EL RESIDUO DE LA DIVISION ES: "+Residuo);
    }    
}