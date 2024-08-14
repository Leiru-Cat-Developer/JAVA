package Funciones_Principales;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class ArchivoDeTexto {
    File archivoDeContactos;
    public void crarArchivoDeContactos() {
        archivoDeContactos = new File("Archivo Contactos.txt");                  //RUTA RELATIVA
        try {
            if(archivoDeContactos.createNewFile()){
                System.out.println("ARCHIVO CREADO CORRECTAMENTE");
            }
        } catch (IOException ex) {
            System.err.println("ERROR AL CREAR EL ARCHIVO");
        }
    }
    public void escribirTexto(Persona persona) {
        try {
            FileWriter escribir = new FileWriter(archivoDeContactos, true);
            //DATOS SEPARADOS POR '%'
            escribir.write(persona.getNombre()+"%"+
                           persona.getCelular()+"%"+
                           persona.getCorreo()+"\r\n");
            escribir.close();
            JOptionPane.showMessageDialog(null,"CONTACTO AÑADIDO");             //MUESTRA EN PANTALLA
            System.out.println("ARCHIVO ESCRITO CORRECTAMENTE");                //MUESTRA EN CONSOLA
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"ERROR AL AÑADIR CONTACTO");     //MUESTRA EN PANTALLA
            System.err.println("ERROR AL ESCRIBIR EN EL ARCHIVO");              //MUESTRA EN CONSOLA
        }
    }
}