package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            QUEREMOS DESARROLLAR UNA APLICACIÓN QUE NOS AYUDE A GESTIONAR LAS NOTAS DE UN CENTRO EDUCATIVO.
            CADA GRUPO (CLASE) ESTA COMPUESTO POR 5 ALUMNOS. SE PIDE LEER LAS NOTAS DEL PRIMER,
            SEGUNDO Y TERCER TRIMESTRE DE UN GRUPO. DEBEMOS MOSTRAR AL FINAL: LA NOTA MEDIA DEL GRUPO
            EN CADA TRIMESTRE, Y LA MEDIA DEL ALUMNO QUE SE ENCUENTRA EN LA POSICIÓN N (N SE LEE POR TECLADO).
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        float Arreglo_Trimestre_Uno[] = new float[5];
        float Arreglo_Trimestre_Dos[] = new float[5];
        float Arreglo_Trimestre_Tres[] = new float[5];
        float Medias_Trimestrales_Individuales[] = new float[5];
        float Media_Trimestre_Uno = 0, Media_Trimestre_Dos = 0, Media_Trimestre_Tres = 0;
        System.out.println("\t\t"+"LLENANDO CALIFICACIONES DEL TRIMESTRE UNO"+"\n");
        for(int i = 0; i < 5; i++){
            System.out.print("DIGITE LA CALIFICACION DEL ALUMNO EN LA POCISION "+(i)+" : ");
            Arreglo_Trimestre_Uno[i] = Lector_De_Datos.nextFloat();
            /*COMENZAMOS A GUARDAR LAS SUMATORIAS DE LAS MEDIAS INDIVIDUALES DE LOS ALUMNOS*/
            Medias_Trimestrales_Individuales[i] += Arreglo_Trimestre_Uno[i];
            Media_Trimestre_Uno += Arreglo_Trimestre_Uno[i];
            /*
                ACUMULADOS DEL TRIMESTRE UNO
                0 = 0 + CALIFICACION DIGITADA
                [ACUMULADO POCISION 1] = [ACUMULADO POCISION 1] + [CALIFICACION POCISION 1]
            */
        }
        System.out.println("\n\t\t"+"LLENANDO CALIFICACIONES DEL TRIMESTRE DOS"+"\n");
        for(int i = 0; i < 5; i++){
            System.out.print("DIGITE LA CALIFICACION DEL ALUMNO EN LA POCISION "+(i)+" : ");
            Arreglo_Trimestre_Dos[i] = Lector_De_Datos.nextFloat();
            /*COMENZAMOS A GUARDAR LAS SUMATORIAS DE LAS MEDIAS INDIVIDUALES DE LOS ALUMNOS*/
            Medias_Trimestrales_Individuales[i] += Arreglo_Trimestre_Dos[i];
            Media_Trimestre_Dos += Arreglo_Trimestre_Dos[i];
            /*
                ACUMULADOS DEL TRIMESTRE DOS
                0 = 0 + CALIFICACION DIGITADA
                [ACUMULADO POCISION 1] = [ACUMULADO POCISION 1] + [CALIFICACION POCISION 1]
            */
        }
        System.out.println("\n\t\t"+"LLENANDO CALIFICACIONES DEL TRIMESTRE TRES"+"\n");
        for(int i = 0; i < 5; i++){
            System.out.print("DIGITE LA CALIFICACION DEL ALUMNO EN LA POCISION "+(i)+" : ");
            Arreglo_Trimestre_Tres[i] = Lector_De_Datos.nextFloat();
            /*COMENZAMOS A GUARDAR LAS SUMATORIAS DE LAS MEDIAS INDIVIDUALES DE LOS ALUMNOS*/
            Medias_Trimestrales_Individuales[i] += Arreglo_Trimestre_Tres[i];
            Media_Trimestre_Tres += Arreglo_Trimestre_Tres[i];
            /*
                ACUMULADOS DEL TRIMESTRE TRES
                0 = 0 + CALIFICACION DIGITADA
                [ACUMULADO POCISION 1] = [ACUMULADO POCISION 1] + [CALIFICACION POCISION 1]
            */
        }
        /*SACAMOS LA MEDIA GRUPAL GENERAL*/
        float Media_Grupal_General = 0, Acumulador_De_Medias_Individuales = 0;
        for(int i = 0; i < 5; i++){
            Acumulador_De_Medias_Individuales += Medias_Trimestrales_Individuales[i];
        }
        Media_Grupal_General = Acumulador_De_Medias_Individuales / 15; //SE DIVIDE ENTRE 15 POR QUE SON TODAS LAS CALIFICACIONES
        Media_Trimestre_Uno /= 5;
        Media_Trimestre_Dos /= 5;
        Media_Trimestre_Tres /= 5;
        /*AHORA SOLO FALTA PEDIR EL PROMEDIO INDIVIDUAL DE UN ALUMNO*/
        int Pocision_De_Alumno_Individual = 0;
        System.out.println("");/*SALTO DE LINEA PARA NO MEZCLARCE CON LO ANTERIOR*/
        do{
            System.out.print("DIGITE LA POCISION DEL ALUMNO PARA SU MEDIA INDIVIDUAL: ");
            Pocision_De_Alumno_Individual = Lector_De_Datos.nextInt();
            if((Pocision_De_Alumno_Individual < 0)||(Pocision_De_Alumno_Individual > 4)){
                System.out.println("\n"+"LA POCISION NO ES VALIDA, INGRESELA DE NUEVO ..."+"\n");
            }
        }while((Pocision_De_Alumno_Individual < 0)||(Pocision_De_Alumno_Individual > 4));
        /*UNA VEZ DIGITADA LA POCISION DEL ALUMNO, AHORA TENEMOS QUE BUSCARLO Y SACAR SU MEDIA INDIVIDUAL Y LA MEDIA GRUPAL DE CADA TRIMESTRE Y LA GENERAL*/
        System.out.println("\n"+"LA MEDIA DEL TRIMESTRE UNO ES: "+Media_Trimestre_Uno);
        System.out.println("LA MEDIA DEL TRIMESTRE DOS ES: "+Media_Trimestre_Dos);
        System.out.println("LA MEDIA DEL TRIMESTRE TRES ES: "+Media_Trimestre_Tres);
        System.out.println("LA MEDIA GRUPAL ES: "+Media_Grupal_General);
        System.out.println("LA MEDIA INDIVIDUAL DEL ALUMNO "+(Pocision_De_Alumno_Individual)+" ES: "+(Medias_Trimestrales_Individuales[Pocision_De_Alumno_Individual]/3));
    }    
}