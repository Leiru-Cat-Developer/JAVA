package Funcion_Principal;
public class Paquete {
    //ATRIBUTOS
    private int numeroDePaquete;
    private String dni;
    private double peso;
    private int prioridad;//0 PRIORIDAD NORMAL, 1 PRIORIDAD ALTA Y 2 PRIORIDAD EXPRESS
    //METODOS
    public Paquete(int numeroDePaquete, String dni, double peso, int prioridad) {
        //CONSTRUCTOR
        this.numeroDePaquete = numeroDePaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    } 
    public int getNumeroDePaquete() {
        //GETTER PARA NUMERO DE PAQUETE
        return numeroDePaquete;
    }
    public String getDni() {
        //GETTER PARA DNI
        return dni;
    }
    public double getPeso() {
        //GETTER PARA PESO
        return peso;
    }
    public int getPrioridad() {
        //GETTER PARA PRIORIDAD
        return prioridad;
    }
    public String mostrarDatosDelPaquete(){
        //MOSTRAMOS LOS DATOS DEL PAQUETE
        return "\n"+"NÚMERO DE PAQUETE: "+numeroDePaquete+", DNI: "+dni+", PESO: "+peso+", PRIORIDAD: "+prioridad+"\n";
    }
}