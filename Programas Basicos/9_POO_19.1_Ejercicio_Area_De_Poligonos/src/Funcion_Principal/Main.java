package Funcion_Principal;
import java.util.ArrayList; //LIBRERIA IMPORTADA POR EL ARREGLO DINAMICO
import java.util.Scanner;
public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();    //AREGLO DINAMICO GLOBAL
    /*
        ¿CÓMO SE DECLARA UN ARREGLO DINAMICO?
    
        static ArrayList<NOMBRE DE LA CLASE> NOMBRE DE VARIABLE = new ArrayList<NOMBRE DE LA CLASE>();
    */
    static Scanner lectorDeDatos = new Scanner(System.in);              //LECTOR DE DATOS GLOBAL
    public static void main(String [] args) {
        /*
            HACER UN PROGRAMA PARA CALCULAR EL ÁREA DE POLÍGONOS (TRIÁNGULOS Y RECTÁNGULOS), EL PROGRAMA DEBE SER
            CAPAZ DE ALMACENAR EN UN ARREGLO DE "N" TRIÁNGULOS Y RECTÁNGULOS, Y AL FINAL MOSTRAR EL ÁREA Y LOS DATOS
            DE CADA UNO. PARA ELLO SE PIDE LO SIGUIENTE:
        
            - UNA SUPERCLASE LLAMADA POLÍGONO
            - UNA SUBCLASE LLAMADA RECTÁNGULO
            - UNA SUBCLASE LLAMADA TRIÁNGULO
        */
        
        //LLENAR EL OBJETO POLÍGONO
        llenarPoligono();
        //MOSTRAR LOS DATOS Y EL ÁREA DE CADA POLÍGONO
        mostrarResultados();
    }
    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do{
            do{
                System.out.print("\t\t"+"DIGITE QUE POLIGONO DESEA"+"\n");
                System.out.println("1. TRIANGULO");
                System.out.println("2. RECTANGULO");
                System.out.println(/*SALTO DE LINEA*/);
                System.out.print("OPCION -> "); opcion = lectorDeDatos.nextInt();
            }while((opcion < 1)||(opcion > 2));  
            switch(opcion){
                case 1:     //LLENAR UN TRIANGULO
                            llenarTriangulo();
                    break;
                case 2:     //LENAR UN RECTANGULO
                            llenarRectangulo();
                    break;
            }
            System.out.print("\n"+"¿DESEA INTRODUCIR OTRO POLIGONO? [S/N]: ");  
            respuesta = lectorDeDatos.next().charAt(0);
            System.out.println(/*SALTO DE LINEA*/);
        }while((respuesta == 'S')||(respuesta == 's'));
    }
    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.println(/*SALTO DE LINEA*/);
        System.out.print("DIGITE EL LADO 1 DEL TRIANGULO: ");   lado1 = lectorDeDatos.nextDouble();
        System.out.print("DIGITE EL LADO 2 DEL TRIANGULO: ");   lado2 = lectorDeDatos.nextDouble();
        System.out.print("DIGITE EL LADO 3 DEL TRIANGULO: ");   lado3 = lectorDeDatos.nextDouble();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);       //PASANDO PARAMETROS AL OBJETO
        poligono.add(triangulo);                                        //GUARDANDO OBJETO EN EL ARREGLO
    }
    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.println(/*SALTO DE LINEA*/);
        System.out.print("DIGITE EL LADO 1 DEL RECTANGULO: ");   lado1 = lectorDeDatos.nextDouble();
        System.out.print("DIGITE EL LADO 2 DEL RECTANGULO: ");   lado2 = lectorDeDatos.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);               //PASANDO PARAMETROS AL OBJETO
        poligono.add(rectangulo);                                           //GUARDANDO OBJETO EN EL ARREGLO
    }
    public static void mostrarResultados() {
        //AL USAR POLIMORFISMO, EL METODO 'TO STRING' IMPRIME LO PRIMERO QUE ENCUENTRE EL ARREGLO
        for(Poligono P: poligono){
            //RECORRIENDO EL ARREGLO DE LOS POLIGONOS
            System.out.println(P.toString());
            System.out.println("AREA: "+P.area());
            System.out.println(/*SALTO DE LINEA*/);
        }
    }
}