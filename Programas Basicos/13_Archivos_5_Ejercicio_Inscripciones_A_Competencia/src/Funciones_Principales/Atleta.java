package Funciones_Principales;
import java.io.Serializable;
public class Atleta implements Serializable{                                    //TRANSFORMACION A BINARIO
    private String nombre;
    private int edad;
    private double peso;
    private int estatura;
    public Atleta(String nombre, int edad, double peso, int estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }
    public int getEstatura() {
        return estatura;
    }
}