package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        int Variable_Aumento_Derecha = 0;
        int Variable_Decremento_Derecha = 0;
        int Variable_Aumento_Izquierda = 5;
        int Variable_Decremento_Izquierda = 5;
        
        Variable_Aumento_Derecha++;
        Variable_Decremento_Derecha--;
        ++Variable_Aumento_Izquierda;
        --Variable_Decremento_Izquierda;
        /*
            DEPENDIENDO DE EN DONDE COLOQUEMOS LOS SIGNOS ES LA PRIMERA ACCION QUE SE REALIZA,
            SI ESTA A LA DERECHA, PRIMERO SE ASIGNA Y DESPUES SE CREA EL AUMENTO, SI SE COLOCA A
            LA IZQUIERDA PRIMERO SE CREA EL AUMENTO Y DESPUES SE ASIGNA, ESTO SE PUEDE NOTAR MUCHO MÁS
            CON LA IGUALACION DE UNA VARIABLE
        */
        System.out.println(Variable_Aumento_Derecha);
        System.out.println(Variable_Decremento_Derecha);
        System.out.println(Variable_Aumento_Izquierda);
        System.out.println(Variable_Decremento_Izquierda);
    }    
}