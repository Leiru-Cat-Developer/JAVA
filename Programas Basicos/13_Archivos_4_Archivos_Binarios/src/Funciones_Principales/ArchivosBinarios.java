package Funciones_Principales;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ArchivosBinarios {
    private void escribirBinario() {
        try {
            //CREACION DE OBJETO PARA GENERAR ARCHIVO BINARIO
            FileOutputStream archivo = new FileOutputStream("Archivo.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
             //CREANCO OBJETOS PERSONA
            Persona persona1 = new Persona("Uriel", 21);
            Persona persona2 = new Persona("Luis", 22);
            Persona persona3 = new Persona("Jonathan", 20);
            //ESCRIBIMOS LOS OBJETOS SOBRE EL ARCHIVO BINARIO [SE ESCRIBEN COMO OBJETOS]
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            escritura.close();                                                  //CERRAMOS EL ARCHIVO
            System.out.println("EL ARCHIVO FUE CREADO CORRECTAMENTE");
        } catch (FileNotFoundException ex) {
            System.err.println("EL ARCHIVO NO SE PUDO CREAR "+ex);
        } catch (IOException ex){
            System.err.println("EL ARCHIVO NO SE PUDO ESCRIBIR "+ex);
        }
    }
    public void leerBinario(){
        Persona objetoPersona;
        try {
            //CREACION DE OBJETO PARA LEER ARCHIVO BINARIO
            FileInputStream archivo = new FileInputStream("Archivo.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while(true){
                //SE RECORRE EL ARCHIVO BINARIO [CICLO INFINITO]
                objetoPersona = (Persona)lectura.readObject();
                objetoPersona.mostraDatos();
            }
        } catch (EOFException ex) {
            //FINALIZA EL CICLO WHILE INFINITO [TERMINA DE LEER EL ARCHIVO BINARIO]
            return;
        } catch (FileNotFoundException ex) {
            System.err.println("NO ENCONTRO EL ARCHIVO PARA LEERLO "+ex);
        } catch (IOException ex){
            System.err.println("NO SE PUDO LEER EL ARCHIVO "+ex);
        } catch (ClassNotFoundException ex){
            System.err.println("NO SE ENCONTRO LA CLASE DE LECTURA "+ex);
        }
    }
    private void añadirBinario() {
        try {
            //CREACION DE OBJETO PARA ESCRIBIR ARCHIVO BINARIO [SE AÑADE TRUE]
            FileOutputStream archivo = new FileOutputStream("Archivo.bin", true);
            AñadirContenido escritura = new AñadirContenido(archivo);
             //CREANCO OBJETOS PERSONA
            Persona persona1 = new Persona("LUZ", 30);
            Persona persona2 = new Persona("MANUEL", 55);
            //ESCRIBIMOS LOS OBJETOS SOBRE EL ARCHIVO BINARIO [SE ESCRIBEN COMO OBJETOS]
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.close();                                                  //CERRAMOS EL ARCHIVO
        } catch (FileNotFoundException ex) {
            System.err.println("EL ARCHIVO NO SE PUDO CREAR "+ex);
        } catch (IOException ex){
            System.err.println("EL ARCHIVO NO SE PUDO ESCRIBIR "+ex);
        }
    }
    public static void main(String[] args) {
        ArchivosBinarios archivo = new ArchivosBinarios();
        //POR PRIMERA VEZ DEBEN EJECUTAR LOS DOS METODOS [ESCRIBIR Y LEER] PARA NO GENERAR PROBLEMAS
        //archivo.escribirBinario();
        archivo.añadirBinario();
        archivo.leerBinario();
    }
}