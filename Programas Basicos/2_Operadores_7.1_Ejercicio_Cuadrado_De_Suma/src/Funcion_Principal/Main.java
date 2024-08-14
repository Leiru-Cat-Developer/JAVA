package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE RESUELVA LA SUMA DE EL CUADRADO DE LA SIGUIENTE OPERACION
            
            (A + B)^2 = A^2 + 2AB + B^2
        */
        Scanner Lector_Datos = new Scanner(System.in);
        /*DECLARAMOS LAS VARIABLES QUE NECESITAMOS A LO LARGO DEL PROGRAMA*/
        int A = 0, B = 0, C = 0;
        /*PEDIMOS LOS DATOS QUE NECESITAMOS AL USUARIO*/
        System.out.print("DIGITE EL VALOR DE  'A'   y    'B' : ");   A = Lector_Datos.nextInt(); B = Lector_Datos.nextInt();
        /*REALIZAMOS LAS OPERACIONES CORRESPONDIENTES*/
        C = ((int)Math.pow(A, 2)) + (2 * (A * B)) + ((int)Math.pow(B, 2));
        /*IMPRIMIMOS EL RESULTADO EN PANTALLA*/
        System.out.println("EL RESULTADO DE LA ECUACION ES: "+C);
    }
}