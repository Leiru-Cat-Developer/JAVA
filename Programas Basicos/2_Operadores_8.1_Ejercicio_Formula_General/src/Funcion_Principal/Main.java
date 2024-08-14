package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE RESUELVA LA FORMULA GENERAL        
                             _______________
                    - b +/- /b^2  -  4 (a*c)
            x = ----------------------------
                            2(a)
        
            [UTIL PARA NÚMEROS DE UN RANGO -100 a 100 y SIN CONDICIONALES]
        */
        Scanner Lector_Datos = new Scanner(System.in);
        /*DECLARACION DE VARIABLES*/
        double Valor_A = 0, Valor_B = 0, Valor_C = 0;
        double Resultado_Final_Suma = 0, Resultado_Final_Resta = 0;
        /*PEDIMOS LOS DATOS AL USUARIO*/
        System.out.print("DIGITE EL VALOR DE A, B y C: ");    Valor_A = Lector_Datos.nextFloat(); Valor_B = Lector_Datos.nextFloat(); Valor_C = Lector_Datos.nextFloat();
        /*REALIZAMOS LAS OPERACIONES CORRESPONDIENTES*/
        Resultado_Final_Suma = ((-1 * (Valor_B)) + (Math.sqrt((Math.pow(Valor_B,2)) -4*(Valor_A * Valor_C))))/2 * Valor_A;
        Resultado_Final_Resta = ((-1 * (Valor_B)) - (Math.sqrt((Math.pow(Valor_B,2)) -4*(Valor_A * Valor_C))))/2 * Valor_A;
        /*IMPRIMIMOS LOS RESULTADOS EN PANTALLA*/
        System.out.println("POSITIVO: "+Resultado_Final_Suma);
        System.out.println("NEGATIVO: "+Resultado_Final_Resta);
    }    
}