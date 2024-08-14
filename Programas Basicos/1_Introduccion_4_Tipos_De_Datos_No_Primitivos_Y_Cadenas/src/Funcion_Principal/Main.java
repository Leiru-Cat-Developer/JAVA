package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            LOS DATOS PRIMITIVOS NO ALMACENAN NULL, COMO LOS QUE VIMOS EN EL PROGRAMA ANTERIORES,
            LOS DATOS NO PRIMITIVOS SE PUEDEN IGUALAR A NULL, POR EJEMPLO
            
            int NOMBRE_VARIABLE = null ; -> ERROR
            Integer NOMBRE_VARIABLE = null; -> CORRECTO
        
            POR EL MOMENTO ES EL UNICO VALOR QUE SE COMENTARA EN ESTE PROGRAMA
        */
        Integer Valor_Integer = null;
        String Valor_String = "HOLA, ¿COMO ESTAS?";        //ALMACENAMIENTO DE TEXTO ENTRE COMILLAS " " -> COMILLAS DOBLES
        System.out.println("EL VALOR DE INTEGER ES: "+Valor_Integer);
        System.out.println("EL VALOR DE STRING ES: "+Valor_String);
    }    
}