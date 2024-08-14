package Funcion_Principal;
public class Vehiculo {
    //ATRIBUTOS
    private String Marca;
    private String Modelo;
    private float Precio;
    //METODOS
    public Vehiculo(String Marca, String Modelo, float Precio){
        //CONSTRUCTOR
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }
    public float getPrecio(){
        //GETTER DE PRECIO
        return Precio;
    }
    public String Mostrar_Datos(){
        //SOLO PARA MOSTRAR DATOS EN PANTALLA
        System.out.println("\n\t\t"+"COCHE MÁS BARATO"+"\n");
        return "MARCA: "+Marca+"\n"+"MODELO: "+Modelo+"\n"+"PRECIO: $"+Precio+"\n";
    }
}