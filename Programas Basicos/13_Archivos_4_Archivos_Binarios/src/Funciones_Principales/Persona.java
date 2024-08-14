package Funciones_Principales;
import java.io.Serializable;
//AQUI ES IMPORTANTE COLOCAR "implements Serializable"
public class Persona implements Serializable{
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostraDatos(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
        System.out.println("");
    }
}