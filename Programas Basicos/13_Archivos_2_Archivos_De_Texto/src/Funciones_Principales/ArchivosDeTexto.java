package Funciones_Principales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ArchivosDeTexto {
    File archivo;                                                               //ATRIBUTO
    private void crearArchivo(){
        archivo = new File("Archivo De Texto Prueba.txt");
        //CONDICIONAL QUE VERIFICA SI LA FUNCION CREA EL ARCHIVO CON LA DIRECCION RELATIVA
        try {
            if(archivo.createNewFile()){
                System.out.println("EL ARCHIVO SE HA CREADO CORRECTAMENTE");
            }
        } catch (IOException ex) {
            System.err.println("NO SE PUDO CREAR EL ARCHIVO");                  //serr + TAB [CAPTURA ERRORES]
        }
    }
    private void crearDirectorio(){
        archivo = new File("Carpeta Vacia Prueba");
        //CONDICIONAL QUE VERIFICA SI LA FUNCION CREA EL DIRECTORIO CON LA DIRECCION RELATIVA
        if(archivo.mkdir()){
            System.out.println("EL DIRECTORIO HA SIDO CREADO DIRECTAMENTE");
        }else{
            /*
                SI EL METODO SIGUE SIENDO LLAMADO DESPUES DE QUE YA SE CREO LA
                CARPETA, NOS SEGUIRA MANDANDO ERROR, PUES NO PUEDE REEMPLAZAR
                LOS ARCHIVOS EXISTENTES DESDE ESTE PROGRAMA
            */
            System.err.println("NO SE PUDO CREAR EL DIRECTORIO");               //serr + TAB [CAPTURA ERRORES]
        }
    }
    private void escribirArchivoDeTexto(String frase){
        try {
            FileWriter escribir = new FileWriter("Archivo De Texto Prueba.txt");
            escribir.write(frase);                                              //ABRIR Y ESCRIBIR
            escribir.close();                                                   //CERRAR
            /*
                PARA CREAR UN SALTO DE LINEA SE DEBE ESCRIBIR \r\n
                EN UNA CADENA DE TEXTO DECLARADA, PUES DEBEMOS RETORNAR Y
                DESPUES DAR UN SALTO DE LINEA
            */
            System.out.println("EL ARCHIVO SE HA ESCRITO CORRECTAMENTE");
        } catch (Exception e) {
            System.err.println("NO SE PUDO ESCRIBIR SOBRE EL ARCHIVO");         //serr + TAB [CAPTURA ERRORES]
        }
    }
    private void añadirMasTexto(String frase){
        try {
            //PARA AÑADIR MAS TEXTO, UNICAMENTE LE AGREGAMOS EL ATRIBUTO TRUE AL OBJETO
            FileWriter escribir = new FileWriter("Archivo De Texto Prueba.txt",true);
            escribir.write("\r\n"+frase);                                              //ABRIR Y ESCRIBIR
            escribir.close();                                                   //CERRAR
            /*
                PARA ESCRIBIR MÁS TEXTO PRIMERO DEBEMOS VERIFICAR SI YA SE
                ESCRIBIO ALGO ANTERIORMENTE Y ASI NO BORRAR LO QUE YA TENIAMOS,
                AQUI DEBEMOS BUSCAR LA SOLUCION
            */
            System.out.println("EL ARCHIVO SE HA ESCRITO CORRECTAMENTE");
        } catch (Exception e) {
            System.err.println("NO SE PUDO ESCRIBIR SOBRE EL ARCHIVO");         //serr + TAB [CAPTURA ERRORES]
        }
    }
    private void leerTexto(){
        String texto;
        //CONDICIONAL QUE VERIFICA SI EL ARCHIVO SE PUEDE ABRIR CORRECTAMENTE
        try {
            FileReader lector = new FileReader(archivo);                        //SELECCIONA EL ARCHIVO
            BufferedReader lecturaDeArchivo = new BufferedReader(lector);       //LEE EL ARCHIVO
            texto = lecturaDeArchivo.readLine();                                //LEE Y GUARDA EL TEXTO
            while(texto != null){
                //CICLO QUE REPITE EL PROCESO DE LECTURA
                System.out.println(texto);
                texto = lecturaDeArchivo.readLine();
            }
            /*
                PARA PODER LEER EL ARCHIVO CON ESTÉ METODO, NO SE DEBE INCLUIR
                LOS METODOS "CREAR DIRECTORIO, ESCRIBIR ARCHIVO DE TEXTO Y 
                TAMPOCO SE INCLUYE EL METODO AÑADIR MÁS TEXTO
            */
        } catch(FileNotFoundException e){
            System.err.println("ERROR AL LEER EL ARCHIVO");                     //serr + TAB [CAPTURA ERRORES]
        } catch (IOException e) {
            System.err.println("ERROR AL LEER EL ARCHIVO");                     //serr + TAB [CAPTURA ERRORES]
        }
    }
    public static void main(String[] args) {
        Scanner lectorDeDatos = new Scanner(System.in);
        String frase = "";
        ArchivosDeTexto archivo = new ArchivosDeTexto();                        //CREAR OBJETO DE LA CLASE ACTUAL
        archivo.crearArchivo();                                                 //CREAR ARCHIVO CON OBJETO
        archivo.crearDirectorio();                                              //CREAR DIRECTORIO CON OBJETO
        System.out.print("DIGITE UNA FRASE: ");frase = lectorDeDatos.nextLine();
        archivo.escribirArchivoDeTexto(frase);                                  //ESCRIBIR TEXTO EN EL OBJETO
        archivo.leerTexto();
    }
}