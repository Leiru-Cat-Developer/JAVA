package Funcion_Principal;
public class OPERACION {
    //ATRIBUTOS
    int Suma = 0;
    int Resta = 0;
    int Multiplicación = 0;
    int División = 0;
    //METODOS
    public void Sumar(int Número_1, int Número_2){
        Suma = Número_1 + Número_2;
    }
    public void Restar(int Número_1, int Número_2){
        Resta = Número_1 - Número_2;
    }
    public void Multiplicar(int Número_1, int Número_2){
        Multiplicación = Número_1 * Número_2;
    }
    public void Dividir(int Número_1, int Número_2){
        División = Número_1 / Número_2;
    }
    public void Mostrar_Resultados_Al_Usuario(){
        System.out.println("LA SUMA ES: "+Suma);
        System.out.println("LA RESTA ES: "+Resta);
        System.out.println("LA MULTIPLICACIÓN ES: "+Multiplicación);
        System.out.println("LA DIVISIÓN ES: "+División);
    }
    /*
        LAS VARIABLES QUE SE ENCUENTRAN FUERA DE UN METODO SE LES LLAMA VARIABLES GLOBALES Y LAS
        QUE ESTÁN DENTRO DE UN METODO SE LES LLAMA VARIABLES LOCALES, ESTO ES UTIL, PUES AL TENER
        LAS OPERACIONES CON VARIABLES LOCALES Y GUARDARLAS EN VARIABLES GLOBALES, ENTONCES PODEMOS
        MOSTRAR ESOS RESULTADOS EN CUALQUIER PARTE DEL PROGRAMA Y LAS VARIABLES LOCALES SON USADAS
        DE UNA FORMA MÁS DINÁMICA
    */
}