package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            UNA VARIABLE ES UN ESPACIO DE MEMORIA EN LA QUE SE PUEDE ALMACENAR UN VALOR,
            LAS VARIABLES SE PUEDEN DECLARAR DE DOS FORMAS, COMO SE MUESTRA A CONTINUACIÓN:
                    
                                        F O R M A       1
        
            TIPO DE VARIABLE [espacio] NOMBRE DE LA VARIABLE [ = ]  VALOR ACEPTADO POR EL TIPO DE DATO ;
        
                                        F O R M A       2
            
            TIPO DE VARIABLE [espacio] NOMBRE DE LA VARIABLE ;
            NOMBRE DE LA VARIABLE [ = ] VALOR ACEPTADO POR EL TIPO DE DATO ;
        */
        
        /*  T I P O S     D E     V A R I A B L E S */
        byte Valor_Byte = 12;             //SU RANGO DE ALMACENAMIENTO ES [-128 HASTA 127] -> USA 8 BITS
        short Valor_Short = 32000;        //SU RANGO DE ALMACENAMIENTO ES [-32,768 HASTA 32,767] -> USA 16 BITS
        int Valor_Int = 78560;            //SU RANGO DE ALMACENAMIENTO ES [-2,147,483,648 HASTA 2,147,483,647] -> USA 32 BITS
        long Valor_Long = 799567230;      //SU RANGO DE ALMACENAMIENTO ES [-9,223,372,036,854,775,808 HASTA -9,223,372,036,854,775,807] -> USA 64 BITS
        float Valor_Float = 3.1416f;      //SU RANGO DE ALMACENAMIENTO ES [1.4e-045 HASTA 3.4e+038] -> USA 32 BITS
        double Valor_Double = 145.62371;  //SU RANGO DE ALMACENAMIENTO ES [4.9e-324 HASTA 1.8e+308] -> USA 64 BITS
        char Valor_Char = 'A';            //ALMACENAMIENTO DE CARACTERES INDIVIDUALES CON COMILLAS SIMPLES -> ' '
        boolean Valor_Boolean = false;    //ALMACENAMIENTO DE VALOR "true" Y "false" -> IMPORTANTE EN MINUSCULAS
        System.out.println("EL VALOR DEL BYTE ES: "+Valor_Byte);
        System.out.println("EL VALOR DEL SHORT ES: "+Valor_Short);
        System.out.println("EL VALOR DEL INT ES: "+Valor_Int);
        System.out.println("EL VALOR DEL LONG ES: "+Valor_Long);
        System.out.println("EL VALOR DEL FLOAT ES: "+Valor_Float);
        System.out.println("EL VALOR DEL DOUBLE ES: "+Valor_Double);
        System.out.println("LA LETRA DEL CHAR ES: "+Valor_Char);
        System.out.println("EL VALOR DE BOOLEAN ES: "+Valor_Boolean);
        /*
            EL COMANDO QUE VEMOS EN EL PRIMER PROGRAMA ACEPTA LA CONCATENACION DE VARIABLES SI
            SE LE AGREGA UN SIGNO "+" DESPUES DE QUE COLOQUEMOS TODO EL TEXTO ENTRE COMILLAS:
        
            "System.out.println("TEXTO" + VARIABLE);"
        */
        
        /*
            A LOS NÚMEROS DE TIPO "FLOAT" SE LES DEBE AGREGAR UNA "F MINUSCULA" AL FINAL DEL VALOR QUE QUERAMOS
            ALMACENAR DE LA VARIABLE DE LA SIGUIENTE MANERA, EN CUALQUIERA DE LOS DOS CASOS QUE INTENTES
            PARA REFLEJAR UN VALOR DE TIPO FLOTANTE:
            
            float NOMBRE_VARIABLE = NUMERO f ;
            
            float NOMBRE_VARIABLE ;
            NOMBRE_VARIABLE = NUMERO f ;
        */
        
        /**
         *                      N O T A
         * 
         * LAS VARIABLES "BYTE, SHORT, INT, LONG" SON TODAS ENTERAS, POR LO QUE SI AGREGAMOS UN NÚMERO
         * CON VALOR DECIMAL QUE SE ENCUENTRE ENTRE LOS RANGOS DE ESTOS TIPOS DE DATOS
         * NO SERÁ ACEPTADO Y NOS ARROJARA UN ERROR AL COMPILAR
         **/
        
        /**
         *                      N O T A
         * 
         * LAS VARIABLES "FLOAT, DOUBLE" SON TODAS REALES, POR LO QUE SI AGREGAMOS TANTO NÚMEROS
         * ENTEROS COMO NÚMEROS CON PUNTO DECIMAL, SERAN ACEPTADOS, PERO ESTO DEPENDERA DE LA
         * FUNCIONALIDAD DE NUESTRO PROGRAM, PUES PUEDE SER QUE NO LAS NECESITEMOS Y OCUPEMOS MEMORIA
         * DE UNA FORMA TAN INCECESARIA QUE EL PROGRAMA COMIENCE A FALLAR
         **/
    }    
}