package Funcion_Principal;
import java.util.Scanner;//LIBRERIA IMPORTADA DEL SCANNER
public class Main {
    public static void main(String[] args) {
        /*          DECLARAMOS LA SIGUIENTE LINEA DE CODIGO JUSTO AL INICIO DE NUESTRO PROGRAMA       */
        /*                          Scanner VARIABLE = new Scanner(System.in);                        */
        /*BASICAMENTE LO UNICO QUE SE CAMBIA EN ESTE CASO ES LA VARIABLE, LUEGO IMPORTAMOS LA LIBRERIA*/
        
        Scanner Lectura_Datos = new Scanner(System.in);
        int Numero_Entero = 0;
        float Numero_Flotante = 0;
        double Numero_Double = 0;
        String Cadena_SIN = "";                                 //DECLARACION DE UNA CADENA VACIA
        String Cadena_CON = "";                                 //DECLARACION DE UNA CADENA VACIA
        char Letra;                                             //DECLARACION DE CARACTERES VACIA
        System.out.print("DIGITE UN NÚMERO ENTERO: ");
        Numero_Entero = Lectura_Datos.nextInt();            //SE GUARDA CON ".NEXTINT" POR QUE EL DATO ES ENTERO
        System.out.print("DIGITE UN NÚMERO FLOTANTE: ");
        Numero_Flotante = Lectura_Datos.nextFloat();        //SE GUARDA CON ".NEXTFLOAT" POR QUE EL DATO ES FLOTANTE
        System.out.print("DIGITE UN NÚMERO DOUBLE: ");
        Numero_Double = Lectura_Datos.nextDouble();         //SE GUARDA CON ".NEXTDOUBLE" POR QUE EL DATO ES FLOTANTE}
        System.out.print("DIGITE UNA CADENA: ");
        Cadena_SIN = Lectura_Datos.next();                  //SE GUARDA CON ".NEXT" PARA QUE SOLO GUARDE HASTA DONDE ENCUENTRE ESPACIOS
        //  System.out.print("DIGITE OTRA CADENA: ");
        //  Cadena_CON = Lectura_Datos.nextLine();              //SE GUARDA CON ".NEXTLINE" PARA QUE GUARDE TODOS LOS ESPACIOS
        System.out.print("DIGITE UNA LETRA: ");
        Letra = Lectura_Datos.next().charAt(0);             //SE GUARDA CON ".NEXT.CHARAT(0)" PARA QUE GUARDE LAS LETRAS EN EL NÚMERO QUE INDICA LA POCISION
        System.out.println("EL NÚMERO ENTERO ES: "+Numero_Entero);
        System.out.println("EL NÚMERO FLOAT ES: "+Numero_Flotante);
        System.out.println("EL NÚMERO DOUBLE ES: "+Numero_Double);
        System.out.println("EL VALOR DE CADENA SIN: "+Cadena_SIN);
        System.out.println("LA LETRA ES: "+Letra);
        /*SI LLENAMOS VARIAS CADENAS A LA VEZ HAY QUE VACIAR EL BUFFER, PERO ESO SE VERA MUCHO MÁS ADELANTE*/
        /*DE MOMENTO SI QUEREMOS VER VARIOS RESULTADOS HAY QUE COLOCAR COMO COMENTARIO LAS DEMAS CADENAS*/
    }    
}