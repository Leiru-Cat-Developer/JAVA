package Funcion_Principal;
public class Main {
    public static void main(String [] args){
        //CREACIÓN DEL OBJETO
        OPERACION OP = new OPERACION();
        //METODOS DEL OBJETO LLAMADOS CON "VARIABLE.METODO"
        OP.Pedir_Datos_Al_Usuario();
        OP.Sumar();
        OP.Restar();
        OP.Multiplicar();
        OP.Dividir();
        OP.Mostrar_Resultados_Al_Usuario();
    }
}