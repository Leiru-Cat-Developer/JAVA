package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE TRES CALIFICACIONES
        */
        Scanner Lectura_Datos = new Scanner(System.in);/*DECLARACION DEL ESCANER QUE LEE LOS DATOS*/
        float Calificacion_1 = 0, Calificacion_2 = 0, Calificacion_3 = 0, Suma_De_Calificaciones = 0;/*VARIABLES*/
        System.out.print("DIGITE TRES CALIFICACIONES: ");/*PEDIMOS LAS 3 CALIFICACIONES EN UNA MISMA LINEA*/
        Calificacion_1 = Lectura_Datos.nextFloat();
        Calificacion_2 = Lectura_Datos.nextFloat();
        Calificacion_3 = Lectura_Datos.nextFloat();
        Suma_De_Calificaciones = Calificacion_1 + Calificacion_2 + Calificacion_3;/*RESOLVEMOS LA SUMA DE CALIFICACIONES*/
        System.out.println("LA SUMA DE CALIFICACIONES ES: "+Suma_De_Calificaciones);/*IMPRIMIMOS LOS DATOS*/
    }    
}