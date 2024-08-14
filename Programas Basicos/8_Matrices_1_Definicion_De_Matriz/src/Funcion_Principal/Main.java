package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            UNA MATRIZ ES UN ARREGLO DE ARREGLOS, SE DEFINE POR EL NÚMERO DE FILAS 'N' Y EL NÚMERO DE COLUMNAS 'M',
            SIENDO DECLARADAS COMO "MATRIZ[][]" POR EJEMPLO, UNA MATRIZ, RECONDANDO QUE PUEDEN SER ALMACENADAS CON
            CUALQUIER TIPO DE DATO, SEA PRIMITIVO O NO PRIMITIVO, PUEDE SER:
        
                    COLUMNAS
        
                    1   2   3
        
            FILAS   4   5   6
        
                    7   8   9
        
            AHORA CONOCEREMOS LA FORMA MANUAL DE RELLENAR UNA MATRIZ
        */
        int Matriz_Manual[][] = {{1,2,3},{4,5,6},{7,8,9}};
        /*IMPRESIÓN DE MATRIZ*/
        for(int i = 0; i < 3; i++){                             //I = 0; I < NÚMERO DE FILAS; I++
            for(int j = 0; j < 3; j++){                         //J = 0; J < NÚMERO DE COLUMNAS; J++
                System.out.print(Matriz_Manual[i][j]+"   ");    //IMPRESION (NOMBRE DE LA MATRIZ [FILAS][COLUMNAS] + "ESPACIOS")
            }
            System.out.println("\n");                           //DOBLE SALTO DE LINEA PARA EVITAR AGLOMERACIÓN DE DATOS
        }
        /*
            PARA LLENAR LA MATRIZ MANUALMENTE, TENEMOS QUE DECLARAR VARIABLES PARA EL NÚMERO DE FILAS Y COLUMNAS, PEDIRLAS
            POR MENSAJES EN CONSOLA O EMERGENTES, DESPUÉS INICIAR UN CICLO IGUAL AL DE IMPRESIÓN DE DATOS, PERO EN SU LUGAR
            DE IMPRESIÓN DE DATOS, TENEMOS QUE PEDIRLOS Y ALMACENARLOS EN "NOMBRE DE LA MATRIZ [FILAS][COLUMNAS]" POR MENSAJES
            EMERGENTES O POR CONSOLA. AL FINALIZAR, TENEMOS QUE IMPRIMIRLOS DE LA MISMA FORMA QUE EN ESTÉ PROYECTO, POR ULTIMO
            LA MATRIZ SIMPLEMENTE SE DECLARA:
        
            TIPO DE DATO - NOMBRE DE LA MATRIZ [][];
            NOMBRE DE LA MATRIZ = NEW INT[FILAS][COLUMAS]
        
            TODO ESTO PARA ALMACENAR EL TAMAÑO DE LA MATRIZ
        */
    }    
}