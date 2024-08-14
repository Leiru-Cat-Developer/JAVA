package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        /*
            CONSTRUIR UN PROGRAMA PARA TRABAJAR CON 2 NÚMEROS COMPLEJOS, IMPLEMENTE EL SIGUIENTE MENÚ:
        
            1. SUMAR 2 NÚMEROS COMPLEJOS
            2. MULTIPLICAR 2 NÚMEROS COMPLEJOS
            3. COMPRAR DOS NÚMEROS COMPLEJOS [IGUALES O NO]
            4. MULTIPLICAR UN NÚMERO COMPLEJO POR UN ENTERO
            5. SALIR
        */
        Scanner lectorDeDatos = new Scanner(System.in);
        NumeroComplejo numeroUno, numeroDos, suma, multiplicacion;
        int opcion = 0, numeroEntero = 0;
        double a,b,c,d;                                 //VARIABLES DE NÚMEROS COMPLEJOS
        do{
            System.out.println("\t\t"+"OPERACIONES CON NÚMEROS COMPLEJOS"+"\n");
            System.out.println("1. SUMAR 2 NÚMEROS COMPLEJOS");
            System.out.println("2. MULTIPLICAR 2 NÚMEROS COMPLEJOS");
            System.out.println("3. COMPRAR DOS NÚMEROS COMPLEJOS [IGUALES O NO]");
            System.out.println("4. MULTIPLICAR UN NÚMERO COMPLEJO POR UN ENTERO");
            System.out.println("5. SALIR"+"\n");
            System.out.print("DIGITE SU OPCION -> "); opcion = lectorDeDatos.nextInt();
            //REALIZAMOS LA OPERACION DEL SWITCH PARA HACER LA OPERACION CORRESPONDIENTE
            switch(opcion){
                case 1:     System.out.println("\n"+"DIGITE EL PRIMER NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         a = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   b = lectorDeDatos.nextDouble();
                            System.out.println("\n"+"DIGITE EL SEGUNDO NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         c = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   d = lectorDeDatos.nextDouble();
                            //INICIALIZAMOS EL OBJETO Y LE PASAMOS LOS PARAMETROS
                            numeroUno = new NumeroComplejo(a, b);
                            numeroDos = new NumeroComplejo(c, d);
                            suma = numeroUno.calcularSuma(numeroDos);
                            System.out.println("\n"+"LA SUMA TOTAL ES: "+suma.getParteReal()+" + "+suma.getParteImaginaria()+"i"+"\n");
                    break;
                case 2:     System.out.println("\n"+"DIGITE EL PRIMER NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         a = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   b = lectorDeDatos.nextDouble();
                            System.out.println("\n"+"DIGITE EL SEGUNDO NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         c = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   d = lectorDeDatos.nextDouble();
                            //INICIALIZAMOS EL OBJETO Y LE PASAMOS LOS PARAMETROS
                            numeroUno = new NumeroComplejo(a, b);
                            numeroDos = new NumeroComplejo(c, d);
                            multiplicacion = numeroUno.calcularMultiplicacion(numeroDos);
                            System.out.println("\n"+"LA MULTIPLICACION TOTAL ES: "+multiplicacion.getParteReal()+" + "+multiplicacion.getParteImaginaria()+"i"+"\n");
                    break;
                case 3:     System.out.println("\n"+"DIGITE EL PRIMER NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         a = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   b = lectorDeDatos.nextDouble();
                            System.out.println("\n"+"DIGITE EL SEGUNDO NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         c = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   d = lectorDeDatos.nextDouble();
                            //INICIALIZAMOS EL OBJETO Y LE PASAMOS LOS PARAMETROS
                            numeroUno = new NumeroComplejo(a, b);
                            numeroDos = new NumeroComplejo(c, d);
                            if(numeroUno.comprobarIgualdad(numeroDos)){
                                System.out.println("\n"+"LOS NÚMEROS COMPLEJOS SON IGUALES");
                            }else{
                                System.out.println("\n"+"LOS NÚMEROS COMPLEJOS SON DIFERENTES");
                            }
                    break;
                case 4:     System.out.println("\n"+"DIGITE EL PRIMER NÚMERO COMPLEJO"+"\n");
                            System.out.print("DIGITE LA PARTE REAL: ");         a = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE LA PARTE IMAGINARIA: ");   b = lectorDeDatos.nextDouble();
                            System.out.print("DIGITE EL NÚMERO ENTERO: ");      numeroEntero = lectorDeDatos.nextInt();
                            //INICIALIZAMOS EL OBJETO Y LE PASAMOS LOS PARAMETROS
                            numeroUno = new NumeroComplejo(a, b);
                            multiplicacion = numeroUno.multiplicacionPorEntero(numeroEntero);
                            System.out.println("\n"+"LA MULTIPLICACION TOTAL ES: "+multiplicacion.getParteReal()+" + "+multiplicacion.getParteImaginaria()+"i"+"\n");

                    break;
                case 5:     System.out.println("\n\t\t"+"SALIENDO ..."+"\n");
                    break;
                default:    System.out.println("\n\t"+"LA OPCION NO EXISTE, INTENTELO DE NUEVO ..."+"\n");
                    break;
            }
        }while(opcion != 5);
    }
}
/*
    A PARTIR DE ESTE PROGRAMA COMENZAMOS A USAR:
        
        -> VARIABLES LARGAS Y ESPECIFICAS
        -> VARIABLES GLOBALES Y LOCALES CON NOTACION CAMELLO EMPEZANDO CON LETRA MINUSCULA
        -> COMENTARIOS EN MAYUSCULAS, COMENTARIOS EN UNA MISMA LINEA Y ESPECIFICOS Y CORTOS, COMENTARIOS LARGOS EXPLICATIVOS
        -> TERMINAR LOS COMENTARIOS CON UN PUNTO SI NO LLEVAN UNA LISTA AL FINAL
        -> CLASES EN NOTACION CAMELLO CON INICIAL EN LETRA MAYUSCULAS
        -> NO USAR ACENTOS O CORRECCIONES GRAMATICALES EN LAS VARIABLES, SOLO EN LOS COMENTARIOS
        -> USAR ESPACIOS Y COLOCAR NÚMERO DE UNA LISTA DE UNA FORMA MÁS DECENTE
*/