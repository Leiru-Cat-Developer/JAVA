package Funcion_Principal;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner lectorDeDatos = new Scanner(System.in);                      //LECTOR DE DATOS GLOBAL
    static ArrayList<Persona> persona = new ArrayList<Persona>();               //ARREGLO DINAMICO
    //INSTANCIAMOS OBJETOS PARA AHORRAR TIEMPO EN EL PROGRAMA, PERO IGUALMENTE SE PUEDEN PEDIR AL USUARIO
    static Persona futbolista1 = new Futbolista(9, "DELANTERO", "GONZALO", "HIGUAIN", 29);
    static Persona futbolista2 = new Futbolista(21, "DELANTERO", "PABLO", "DYBALA", 23);
    static Persona entrenador = new Entrenador("DEFENSIVA", "MAXIMILIANO", "ALEGRI", 49);
    static Persona doctor = new Doctor("LICENCIADO EN FISIOTERAPIA", 20, "ALEX", "MARRONI", 55);
    public static void main(String [] args) {
        /*
            CREAR UN PROGRAMA PARA SIMULAR UN EQUIPO DE FUTBOL (FUTBOLISTA, ENTRENADOR, DOCTOR), 
            PARA LO CUAL TENDREMOS LO SIGUIENTE:
            
            - UNA SUPERCLASE PERSONA, QUE TENDRA LOS DATOS: NOMBRE, APELLIDO, EDAD
            - LA SUBCLASE FUTBOLISTA, QUE TENDRA LOS DATOS: DORSAL, POCISIÓN
            - LA SUBCLASE ENTRENADOR, QUE TENDRA LOS DATOS: NOMBRE DE LA ESTRATEGIA QUE UTILIZA
            - LA SUBCLASE DOCTOR, QUE TENDRA LOS DATOS: TITULACIÓN, AÑOS DE EXPERIENCIA
            
            HACER UN MENÚ DONDE SE TENGAN LAS SIGUIENTES OPCIONES:
            
            - VIAJE DEL EQUIPO
            - ENTRENAMIENTO
            - PARTIDO DE FUTBOL
            - PLANIFICAR ENTRENAMIENTO
            - ENTREVISTA
            - CURAR LESIÓN
        */
        persona.add(futbolista1);                                               //RELLENANDO OBJETO
        persona.add(futbolista2);                                               //RELLENANDO OBJETO
        persona.add(entrenador);                                                //RELLENANDO OBJETO
        persona.add(doctor);                                                    //RELLENANDO OBJETO
        menu();
    }
    public static void menu(){
        int opcion;
        do{
            System.out.println("\t\t"+"...MENU..."+"\n");
            System.out.println("1. VIAJE DEL EQUIPO");
            System.out.println("2. ENTRENAMIENTO");
            System.out.println("3. PARTIDO DE FUTBOL");
            System.out.println("4. PLANIFICAR ENTRENAMIENTO");
            System.out.println("5. ENTREVISTA");
            System.out.println("6. CURAR LESIÓN");
            System.out.println("7. SALIR");
            System.out.println(/*SALTO DE LINEA*/);
            System.out.print("OPCIÓN -> ");               opcion = lectorDeDatos.nextInt();
            switch(opcion){
                case 1:     //VIAJE DEL EQUIPO
                            System.out.println(/*SALTO DE LINEA*/);
                            viajeEquipo();
                            System.out.println(/*SALTO DE LINEA*/);
                    break;
                case 2:     //ENTRENAMIENTO
                            System.out.println(/*SALTO DE LINEA*/);
                            entrenarEquipo();
                            System.out.println(/*SALTO DE LINEA*/);
                    break;
                case 3:     //PARTIDO DE FUTBOL
                            System.out.println(/*SALTO DE LINEA*/);
                            partidoDeFutbol();
                            System.out.println(/*SALTO DE LINEA*/);
                    break;
                case 4:     //PLANIFICAR ENTRENAMIENTO
                            System.out.println(/*SALTO DE LINEA*/);
                            planificarEntrenamiento();
                            System.out.println(/*SALTO DE LINEA*/);
                    break;
                case 5:     //ENTREVISTA
                            System.out.println(/*SALTO DE LINEA*/);
                            concederEntrevista();
                            System.out.println(/*SALTO DE LINEA*/);
                    break;
                case 6:     //CURAR LESIÓN
                            System.out.println(/*SALTO DE LINEA*/);
                            curarLesion();
                            System.out.println(/*SALTO DE LINEA*/);
                    break;
                case 7:     //SALIR
                            System.out.println(/*SALTO DE LINEA*/);
                            System.out.println("\t\t"+"SALIENDO ..."+"\n");
                    break;
                default:    System.out.println(/*SALTO DE LINEA*/);
                            System.out.println("\t"+"OPCION EQUIVOCADA, DIGITE DE NUEVO ..."+"\n");
                    break;
            }
        }while(opcion != 7);
    }
    public static void viajeEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.viajar();
        }
    }
    public static void entrenarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.entrenamiento();
        }
    }
    public static void partidoDeFutbol(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.partidoDeFutbol();
        }
    }
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();                     //DOWNCASTING
    }
    public static void concederEntrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
        ((Futbolista)futbolista1).entrevista();                                 //DOWNCASTING
        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
        ((Futbolista)futbolista2).entrevista();                                 //DOWNCASTING
    }
    public static void curarLesion(){
        System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" -> ");
        ((Doctor)doctor).curarLesion();                                         //DOWNCASTING
    }
}