package Funcion_Principal;
public class OPERACION {
    //METODOS
    public int Sumar(int Número_1, int Número_2){
        int Suma = Número_1 + Número_2;
        return Suma;
    }
    public int Restar(int Número_1, int Número_2){
        int Resta = Número_1 - Número_2;
        return Resta;
    }
    public int Multiplicar(int Número_1, int Número_2){
        int Multiplicación = Número_1 * Número_2;
        return Multiplicación;
    }
    public int Dividir(int Número_1, int Número_2){
        int División = Número_1 / Número_2;
        return División;
    }
    public void Mostrar_Resultados_Al_Usuario(int Suma, int Resta, int Multiplicación, int División){
        System.out.println("LA SUMA ES: "+Suma);
        System.out.println("LA RESTA ES: "+Resta);
        System.out.println("LA MULTIPLICACIÓN ES: "+Multiplicación);
        System.out.println("LA DIVISIÓN ES: "+División);
    }
    /*
        EN ESTE CASO NO TENEMOS VARIABLES GLOBALES POR LO CUAL TENEMOS QUE GUARDARLO EN EL METODO
        CON VARIABLES LOCALES COMO PARAMETRO Y LUEGO PEDIRLOS COMO ARGUMNETOS
    */
}