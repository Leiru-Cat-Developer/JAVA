package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            LA CALIFICACION FINAL DE UN ESTUDIANTE SE CALCULA CON BASE EN LAS CALIFICACIONES
            DE CUATRO ASPECTOS DE SU RENDIMIENTO ACADEMICO CON SU RESPECTIVA PONDERACIÓN:
            PARTICIPACION           ->  10%
            PRIMER EXAMEN PARCIAL   ->  25%
            SEGUNDO EXAMEN PARCIAL  ->  25%
            EXAMEN FINAL            ->  40%
        */
        Scanner Lector_Datos = new Scanner(System.in);
        /*DECLARAMOS LAS VARIABLES QUE VAMOS A NECESITAR*/
        float Calificacion_Participacion = 0, Calificacion_Primer_Examen_Parcial = 0, Calificacion_Segundo_Examen_Parcial = 0, Calificacion_Examen_Final = 0;
        float Calificacion_Final = 0;
        System.out.print("DIGITE LA CALIFICACION EN PARTICIPACIÓN: ");/*              10%     */  Calificacion_Participacion = Lector_Datos.nextFloat();
        System.out.print("DIGITE LA CALIFICACION DEL PRIMER EXAMEN PARCIAL: ");/*     25%     */  Calificacion_Primer_Examen_Parcial = Lector_Datos.nextFloat();
        System.out.print("DIGITE LA CALIFICACION DEL SEGUNDO EXAMEN PARCIAL: ");/*    25%     */  Calificacion_Segundo_Examen_Parcial = Lector_Datos.nextFloat();
        System.out.print("DIGITE LA CALIFICACION DEL EXAMEN FINAL: ");/*              40%     */  Calificacion_Examen_Final = Lector_Datos.nextFloat();
        /*EMPEZAMOS A REALIZAR LAS OPERACIONES CORRESPONDIENTES*/
        Calificacion_Participacion *= 0.10f;
        Calificacion_Primer_Examen_Parcial *= 0.25f;
        Calificacion_Segundo_Examen_Parcial *= 0.25f;
        Calificacion_Examen_Final *= 0.4f;
        /*SUMAMOS TODO EN UNA SOLA VARIABLE Y OBTENEMOS EL RESULTADO*/
        Calificacion_Final = Calificacion_Participacion + Calificacion_Primer_Examen_Parcial + Calificacion_Segundo_Examen_Parcial + Calificacion_Examen_Final;
        /*IMPRIMIMOS EL RESULTADO EN PANTALLA*/
        System.out.println("LA CALIFICACION FINAL DEL ALUMNO ES: " +Calificacion_Final);
    }    
}