package Funcion_Principal;
import java.io.File;
/*
    LA RUTA ABSOLUTA ES LA QUE NOS LLEVA PASO A PASO A NUESTRO ARCHIVO
    LA RUTA RELATIVA ES EL NOMBRE DE NUESTRO ARCHIVO, MIENTRAS ESTÉ DENTRO DEL PROYECTO
*/
public class Main {
    public static void main(String[] args) {
        //INICIALIZACIÓN DEL OBJETO FILE
        File directorio = new File("CarpetaPrueba");
        //COMPROBACIÓN DE LA EXISTENCIA DEL ARCHIVO
        if(directorio.exists()){
            System.out.println("SI EXISTE");
            System.out.println("RUTA ABSOLUTA: "+directorio.getAbsolutePath());    //IMPRIME LA RUTA ABSOLUTA
            System.out.println("¿ES UN ARCHIVO?: "+directorio.isDirectory());      //SI ES ARCHIVO O DIRECTORIO [CARPETA]
            System.out.println("¿SE PUEDE LEER?: "+directorio.canRead());          //SI SE PUEDE LEER O ESTÁ PROTEGIDO
        }else{
            System.out.println("NO EXISTE");
        }
    }
}