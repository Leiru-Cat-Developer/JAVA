//CONSTANTE
package Funcion_Principal;
public class Persona {
    //ATRIBUTOS
    private int Edad = 0;           //VARIABLE
    private final String Nombre;    //CONSTANTE
    //METODOS
    public Persona(int Edad, String Nombre){
        this.Edad = Edad;
        this.Nombre = Nombre;
        //LA CONSTANTE SE DECLARA SIN LA PALABRA "final" EN LA DECLARACIÓN
    }
    public void Mostrar_Datos_Al_Usuario(){
        System.out.println("LA EDAD ES: "+Edad);
        System.out.println("EL NOMBRE ES: "+Nombre);
    }
    //GETTER y SETTER
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    /*NO SE PUEDEN CREAR GETTER'S Y SETTER'S PARA LAS CONSTANTES*/
}