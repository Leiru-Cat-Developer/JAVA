package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static int Coche_Mas_Barato(Vehiculo COCHES[]){
        /*
            LA CLASE ESTATICA ES LLAMADA EN LA CLASE PRINCIPAL PARA EVITAR GASTAR CÓDIGO, ADEMÁS DE QUE
            EVITA ESTÁR TRANSPORTANDO DATOS A UNA CLASE DE FORMA INECESARIA, LO QUE HACE ES PEDIR EL
            PRECIO INICIAL PARA TOMARLO COMO SI FUERA EL MÁS BAJO Y DESPUÉS COMPRARALO CON LOS SIGUIENTES
            Y ESTAR REASIGNANDOLO CUANDO EL PRECIO SEA MENOR QUE EL PRIMERO Y GUARDA LA POCISION EN EL
            INDICE, HACIENDO QUE SEA MÁS SENCILLO ENCONTRAR LA POCISION DEL VEHICULO MÁS BARATO
        */
        float Precio;
        int Indice = 0;
        Precio = COCHES[0].getPrecio();
        for(int i = 1; i < COCHES.length; i++){
            if(COCHES[i].getPrecio() < Precio){
                Precio = COCHES[i].getPrecio();
                Indice = i;
            }
        }
        return Indice;
    }
    public static void main(String [] args){
        /*
        CONSTRUIR UN PROGRAMA QUE DADA UNA SERIE DE VEHICULOS CARACTERIZADOS POR SU MARCA, MODELO Y PRECIO, IMPRIMA
        LAS PROPIEDADES DEL VEHICULO MÁS BARATO. PARA ELLO, SE DEBERAN LEER POR TECLADO LAS CARACTERISTICAS DE CADA
        VEHICULO Y CREAR UNA CLASE QUE REPRESENTE A CADA UNO DE ELLOS
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        String Marca, Modelo;
        float Precio;
        int Cantidad_De_Vehiculos = 0, Indice_Coche_Mas_Barato = 0;
        while((Cantidad_De_Vehiculos <= 0)){
            System.out.print("DIGITE LA CANTIDAD DE VEHICULOS QUE DESEA INGRESAR: ");   Cantidad_De_Vehiculos = Lector_De_Datos.nextInt();
            if((Cantidad_De_Vehiculos <= 0)){
                System.out.println("\n"+"LA CANTIDAD DE VEHICULOS ES ILOGICA, INTENTE DE NUEVO ..."+"\n");
            }
        }
        Vehiculo COCHES[] = new Vehiculo[Cantidad_De_Vehiculos];                //ARREGLO DE OBJETOS
        for(int i = 0; i < COCHES.length; i++){
            Lector_De_Datos.nextLine();                                         //LIMPIEZA DE BUFFER
            System.out.println("\n\t\t"+"DATOS DEL COCHE "+(i+1)+"\n");
            //SE HACE NEXTLINE POR QUE PUEDEN SER MARCAS LARGAS
            System.out.print("MARCA: ");    Marca = Lector_De_Datos.nextLine();
            System.out.print("MODELO: ");   Modelo = Lector_De_Datos.nextLine();
            System.out.print("PRECIO: $");  Precio = Lector_De_Datos.nextFloat();
            COCHES[i] = new Vehiculo(Marca, Modelo, Precio);
        }
        //MOSTRAMOS LOS DATOS EN PANTALLA
        Indice_Coche_Mas_Barato = Coche_Mas_Barato(COCHES);
        System.out.println(COCHES[Indice_Coche_Mas_Barato].Mostrar_Datos());
    }
}