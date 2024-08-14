package Funciones_Principales;
import java.util.Scanner;
public class Main {
    static Scanner lectorDeDatos = new Scanner(System.in);                      //ESCANER GLOBAL
    final static int numeroDeAreopuertos = 4;                                   //CONSTANTE GLOBLAL
    static Aeropuerto aeropuertos[] = new Aeropuerto[numeroDeAreopuertos];      //ARREGLO GLOBAL
    public static void main(String [] args) {
        /*
            DISEÑAR Y CODIFICAR UNA APLICACIÓN INFORMÁTICA PARA UNA COMPAÑIA DE GESTIÓN AEREOPUERTUARIA SATISFACIENDO
            LOS SIGUIENTES REQUISITOS:
        
                        PARA CADA AEROPUERTO ES NECESARIO SABER:
        
            1) TODAS LAS COMPAÑIAS DE VUELOS QUE OPERAN EN EL
            2) NOMBRE DEL AEROPUERTO, LA CIUDAD DÓNDE SE UBICA Y EL PAÍ
                -- LOS AEROPUERTOS PRIVADOS TIENEN UNA SERIE DE EMPRESAS QUE LOS PATROCINAN Y ES NECESARIO SABER EL
                   NOMBRE DE CADA UNA DE ESAS EMPRESAS
                -- PARA LOS AERUPUERTOS PÚBLICOS SE REQUIERE SABER LA CANTIDAD DE DINERO CORRESPONDIENTE A LA
                   SUBVENCIÓN GUBERNAMENTAL
            6) SE NECESITA GESTIONAR TAMBIENS AL QUE PERTENECE LA INFORMACIÓN DE LOS PASAJEROS
                -- PARA CADA PASAJERO SE NECESITA SABER EL NOMBRE, NÚMERO DE PASAPORTE Y NACIONALIDAD
        
            LA APLICACIÓN TENDRÁ UN MENÚ CON LAS SIGUIENTES OPCIONES:
                 PARA CADA AEROPUERTO ES NECESARIO SABER:
                1. CONSULTAR LOS AEROPUERTOS GESTIONADOS INDICANDO SEPARADAMENTE LOS AEROPUERTOS PÚBLICOS Y LOS
                   PRIVADOS. PARA CADA UNO DE ELLOS DEBERÁ MOSTRAR SU NOMBRE, LA CIUDAD DE UBICACIÓN Y EL PAÍS AL
                   QUE PERTENECE
                2. VISUALIZAR LAS EMPRESAS QUE PATROCINAN UN DETERMINADO AEROPUERTO EN CASO DE QUE SEA PRIVADO,
                   O LA CUANTÍA DE SUBVENCIÓN EN CASO DE QUE SE TRATE DE UN AEROPUERTO PÚBLICO
                3. PARA UN DETERMINADO AEROPUERTO SE DEBE MOSTRAR LA LISTA DE COMPAÑIAS QUE VUELAN DESDE ESE
                   AEROPUERTO
                4. PARA UNA DETERMINADA COMPAÑIA QUE OPERA EN UN AEROPUERTO CONCRETO, LISTAR TODOS LOS POSIBLES
                   VUELOS QUE DICHA COMPAÑIA OFRECE, MOSTRANDO SU IDENTIFICADOR, LA CIUDAD ORIGEN Y DESTINO Y EL
                   PRECIO DEL VUELO
                5. MOSTRAR TODOS LOS POSIBLES VUELOS (IDENTIFICADOR) QUE PARTEN DE UNA CIUDAD ORIGEN A OTRA CIUDAD
                   DESTINO (INDICADAS POR EL USUARIO) Y MOSTRAR SU PRECIO
        */
        insertarDatosDeAeropuerto(aeropuertos);
        menu();
    }
    public static void insertarDatosDeAeropuerto(Aeropuerto a[]){
        a[0] = new AeropuertoPublico(8000000, "JORGE CHAVEZ", "LIMA", "PERÚ");  //AEROPUERTO 1
        a[0].insertarCompañia(new Compañia("AEROPERU"));                        //AGREGANDO 1RA COMPAÑIA
        a[0].insertarCompañia(new Compañia("LATAM"));                           //AGREGANDO 2DA COMPAÑIA
        a[0].getCompañia("AEROPERU").insertarVuelo(new Vuelo("IB20", "LIMA", "CDMX", 150.90, 150));         //CREACIÓN DE VUELO PARA 1RA COMPAÑIA
        a[0].getCompañia("AEROPERU").insertarVuelo(new Vuelo("IB21", "LIMA", "BUENOS AIRES", 180.99, 120)); //CREACIÓN DE VUELO PARA 1RA COMPAÑIA
        a[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12", "LIMA", "BUENOS AIRES", 590.90, 180));         //CREACIÓN DE VUELO PARA 2DA COMPAÑIA
        a[0].getCompañia("AEROPERU").getVuelo("IB20").insertarPasajero(new Pasajero("URIEL", "2020600HMCL", "MEXICANO"));   //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[0].getCompañia("AEROPERU").getVuelo("IB20").insertarPasajero(new Pasajero("MARIA", "PJKL20", "CHILENA"));         //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("JIMMY", "HASLDP0102", "ESTADOUNIDENSE")); //CREACIÓN DE PASAJERO PARA 2DA COMPAÑIA
        a[0].getCompañia("AEROPERU").getVuelo("IB21").insertarPasajero(new Pasajero("JONATHAN", "JM02067HM", "MEXICANA"));  //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
                        
        a[1] = new AeropuertoPublico(2000000, "BOGOTA", "BOGOTA", "COLOMBIA");  //AEROPUERTO 2
        a[1].insertarCompañia(new Compañia("AIR AMERICA"));                     //AGREGANDO 1RA EMPRESA
        a[1].insertarCompañia(new Compañia("VUELA BOGOTA"));                    //AGREGANDO 2DA EMPRESA
        a[1].getCompañia("AIR AMERICA").insertarVuelo(new Vuelo("HH20", "BOGOTA", "MEXICO", 599.99, 147));  //CREACIÓN DE VUELO PARA 1RA EMPRESA
        a[1].getCompañia("VUELA BOGOTA").insertarVuelo(new Vuelo("YZ89", "BOGOTA", "CANADA", 399.99, 150)); //CREACIÓN DE VUELO PARA 2DA EMPRESA
        a[1].getCompañia("AIR AMERICA").getVuelo("HH20").insertarPasajero(new Pasajero("DARWIN", "2020MKO", "ESTADOUNIDENSE"));     //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA    
        a[1].getCompañia("VUELA BOGOTA").getVuelo("YZ89").insertarPasajero(new Pasajero("GUMBALL", "SV86", "ESTADOUNIDENSE"));      //CREACIÓN DE PASAJERO PARA 2DA COMPAÑIA
        
        a[2] = new AeropuertoPublico(4000000, "SANTA MARTA", "CDMX", "MÉXICO"); //AEROPUERTO 3
        a[2].insertarCompañia(new Compañia("KELLOGGS"));                        //AGREGANDO 1RA EMPRESA
        a[2].insertarCompañia(new Compañia("BIMBO"));                           //AGREGANDO 2DA EMPRESA
        a[2].getCompañia("KELLOGGS").insertarVuelo(new Vuelo("ZU21", "CDMX", "ESPAÑA", 350.99, 150));    //CREACIÓN DE VUELO PARA 1RA COMPAÑIA
        a[2].getCompañia("BIMBO").insertarVuelo(new Vuelo("CTM6", "CDMX", "HOLANDA", 599.50, 350));     //CREACIÓN DE VUELO PARA 2DA COMPAÑIA
        a[2].getCompañia("KELLOGGS").getVuelo("ZU21").insertarPasajero(new Pasajero("LUIS", "2121", "MEXICANA"));           //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[2].getCompañia("KELLOGGS").getVuelo("ZU21").insertarPasajero(new Pasajero("EMILIO", "LOL9", "MEXICANA"));         //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[2].getCompañia("BIMBO").getVuelo("CTM6").insertarPasajero(new Pasajero("URIEL", "IFEUA", "MEXICANA"));            //CREACIÓN DE PASAJERO PARA 2DA COMPAÑIA
        
        a[3] = new AeropuertoPrivado("ARN", "ESTOCOLMO", "ESTOCOLMO");          //AEROPUERTO 4
        a[3].insertarCompañia(new Compañia("COCA COLA"));                       //AGREGANDO 1RA COMPAÑIA
        String empresas[] = {"COMEX","COLA CAO"};                               //AGREGANDO EMPRESAS AL ARREGLO
        ((AeropuertoPrivado)a[3]).insertarEmpresas(empresas);                   //DOWNCASTING PARA AGREGAR EMPRESAS
        a[3].getCompañia("COCA COLA").insertarVuelo(new Vuelo("C20", "ESTOCOLMO", "BRASIL", 569.80, 200));      //CREACIÓN DE VUELO PARA 1RA COMPAÑIA
        a[3].getCompañia("COCA COLA").insertarVuelo(new Vuelo("IO87", "ESTOCOLMO", "MÉXICO", 450.60, 150));     //CREACIÓN DE VUELO PARA 1RA COMPAÑIA
        a[3].getCompañia("COCA COLA").insertarVuelo(new Vuelo("GG20", "ESTOCOLMO", "MÉXICO", 240.50, 140));    //CREACIÓN DE VUELO PARA 1RA COMPAÑIA
        a[3].getCompañia("COCA COLA").getVuelo("C20").insertarPasajero(new Pasajero("MARCOS", "203050", "IRLANDÉS"));                   //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[3].getCompañia("COCA COLA").getVuelo("IO87").insertarPasajero(new Pasajero("WALTER WHITE", "SN3060", "ESTADOUNIDENSE"));      //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[3].getCompañia("COCA COLA").getVuelo("IO87").insertarPasajero(new Pasajero("JESSIE", "3030HM", "ESTADOUNIDENSE"));            //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
        a[3].getCompañia("COCA COLA").getVuelo("GG20").insertarPasajero(new Pasajero("SKYLER", "FHUAUDW", "CANADIENSE"));               //CREACIÓN DE PASAJERO PARA 1RA COMPAÑIA
    }
    public static void menu(){
        String nombreDeAeropuerto, nombreDeLaCompañia, nombreDeCiudadOrigen, nombreDeCiudadDestino;
        int opcion = 0;
        Aeropuerto ARP;
        Compañia CMP;
        do{
            System.out.println("\t\t"+"MENU PRINCIPAL"+"\n");
            System.out.println("1. CONSULTAR AEROPUERTOS GESTIONADOS");
            System.out.println("2. VISUALIZAR EMPRESAS PATROCINADORAS (PRIVADO) O SUVBENCIÓN (PÚBLICO)");
            System.out.println("3. LISTA DE COMPAÑIAS DE UN AEROPUERTO");
            System.out.println("4. LISTA DE VUELOS POR COMPAÑIA");
            System.out.println("5. LISTAR VUELOS DE ORIGEN A DESTINO (ID)");
            System.out.println("6. SALIR");
            System.out.println(/*SALTO DE LÍNEA*/);
            System.out.print("OPCIÓN -> ");       opcion = lectorDeDatos.nextInt();
            switch(opcion){
                case 1:     //AEROPUERTOS GESTIONADOS
                            System.out.println(/*SALTO DE LÍNEA*/);
                            mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2:     //VISUALIZACIÓN DE EMPRESAS
                            System.out.println(/*SALTO DE LÍNEA*/);
                            mostrarPatrocinio(aeropuertos);
                    break;
                case 3:     //LISTA DE COMPAÑIAS DE UN AEROPUERTOa
                            System.out.println(/*SALTO DE LÍNEA*/);
                            lectorDeDatos.nextLine(/*LIMPIEZA DE BUFFER*/);
                            System.out.print("DIGITE EL NOMBRE DEL AEROPUERTO: ");  nombreDeAeropuerto = lectorDeDatos.nextLine();
                            ARP = buscarAeropuerto(nombreDeAeropuerto, aeropuertos);        //BUSQUEDA SECUENCIAL
                            if(ARP == null){
                                System.out.println("\n\t\t"+"AEROPUERTO INEXISTENTE ..."+"\n");
                            }else{
                                mostrarCompañias(ARP);
                            }
                    break;
                case 4:     //LISTA DE VUELOS DE UNA COMPAÑIA
                            System.out.println(/*SALTO DE LÍNEA*/);
                            lectorDeDatos.nextLine(/*LIMPIEZA DE BUFFER*/);
                            System.out.print("DIGITE EL NOMBRE DEL AEROPUERTO: ");  nombreDeAeropuerto = lectorDeDatos.nextLine();
                            ARP = buscarAeropuerto(nombreDeAeropuerto, aeropuertos);
                            if(ARP == null){
                                System.out.println("\n\t\t"+"AEROPUERTO INEXISTENTE ..."+"\n");
                            }else{
                                System.out.print("\n"+"DIGITE EL NOMBRE DE LA COMPAÑIA: "); nombreDeLaCompañia = lectorDeDatos.nextLine();
                                CMP = ARP.getCompañia(nombreDeLaCompañia);
                                mostrarVuelos(CMP);
                            }
                    break;
                case 5:     //LISTAR TODOS LOS VUELOS DE UNA CIUDAD PARA COMPARAR PRECIOS
                            System.out.println(/*SALTO DE LÍNEA*/);
                            lectorDeDatos.nextLine(/*LIMPIEZA DE BUFFER*/);
                            System.out.print("DIGITE EL NOMBRE DE LA CIUDAD ORIGEN: "); nombreDeCiudadOrigen = lectorDeDatos.nextLine();
                            System.out.print("DIGITE EL NOMBRE DE LA CIUDAD DESTINO: "); nombreDeCiudadDestino = lectorDeDatos.nextLine();
                            mostrarVueloDeOrigenADestino(nombreDeCiudadOrigen, nombreDeCiudadDestino, aeropuertos);
                    break;
                case 6:     //SALIR
                            System.out.println("\n\t\t"+"SALIENDO ..."+"\n");
                    break;
                default:    System.out.println("\n\t"+"OPCIÓN INEXISTENTE, INTENTE DE NUEVO ..."+"\n");
                    break;
            }
        }while(opcion != 6);
    }
    public static void mostrarDatosAeropuertos(Aeropuerto a[]){
        for(int i = 0; i < a.length; i++){
            if(a[i] instanceof AeropuertoPrivado){                              //'instanceof' VERIFICA SI PERTENECE
                System.out.println("\t\t"+"AEROPUERTO PRIVADO"+"\n");
                System.out.println("NOMBRE: "+a[i].getNombreDelAeropuerto());
                System.out.println("CIUDAD: "+a[i].getCiudadDelAeropuerto());
                System.out.println("PAÍS: "+a[i].getPaisDelAeropuerto());
            }else{
                System.out.println("\t\t"+"AEROPUERTO PÚBLICO"+"\n");
                System.out.println("NOMBRE: "+a[i].getNombreDelAeropuerto());
                System.out.println("CIUDAD: "+a[i].getCiudadDelAeropuerto());
                System.out.println("PAÍS: "+a[i].getPaisDelAeropuerto());
            }
            System.out.println(/*SALTO DE LÍNEA*/);
        }
    }
    public static void mostrarPatrocinio(Aeropuerto a[]){
        String empresas[];
        for(int i=0; i<a.length; i++){
            if(a[i] instanceof AeropuertoPrivado){                              //'instanceof' VERIFICA SI PERTENECE
                System.out.println("\t\t"+"AEROPUERTO PRIVADO"+"\n");
                System.out.println("NOMBRE: "+a[i].getNombreDelAeropuerto());
                empresas = ((AeropuertoPrivado)a[i]).getListaDeEmpresas();      //DOWNCASTING
                for(int j=0; j < empresas.length; j++){
                    System.out.println("-> "+empresas[j]);
                }
            }else{
                System.out.println("\t\t"+"AEROPUERTO PÚBLICO"+"\n");
                System.out.println("NOMBRE: "+a[i].getNombreDelAeropuerto());
                System.out.println("SUBVENCIÓN: $"+((AeropuertoPublico)a[i]).getSubvencionQueDaElGobierno());    //DOWNCASTING
            }
            System.out.println(/*SALTO DE LÍNEA*/);
        }
    }
    public static Aeropuerto buscarAeropuerto(String nombreDelAeropuerto, Aeropuerto a[]){
        boolean encontrado = false;
        int iterador = 0;
        Aeropuerto ARP = null;
        //BUSQUEDA SECUENCIAL
        while((!encontrado)&&(iterador<a.length)){
            if(nombreDelAeropuerto.equals(a[iterador].getNombreDelAeropuerto())){
                encontrado = true;
                ARP = a[iterador];
            }
            iterador++;
        }
        return ARP;                                                             //VARIABLE LOCAL
    }
    public static void mostrarCompañias(Aeropuerto a/*AQUÍ NO ES UN ARREGLO*/){
        System.out.println("\n"+"COMPAÑIAS DEL AEROPUERTO: "+a.getNombreDelAeropuerto()+"\n");
        for(int i=0; i<a.getNumeroDeCompañia(); i++){
            System.out.println("-> "+a.getCompañia(i).getNombreDeLaCompañia());
        }
        System.out.println(/*SALTO DE LÍNEA*/);
    }
    public static void mostrarVuelos(Compañia c){
        Vuelo VL;
        System.out.println("\n"+"VUELOS DE LA COMPAÑIA: "+c.getNombreDeLaCompañia()+"\n");
        for(int i=0; i<c.getNumeroDeVuelo(); i++){
            VL = c.getVuelo(i);
            System.out.println("ID: "+VL.getIdentificadorDeVuelo());
            System.out.println("CIUDAD ORIGEN: "+VL.getCiudadOrigen());
            System.out.println("CIUDAD DESTINO: "+VL.getCiudadDestino());
            System.out.println("PRECIO: $"+VL.getPrecio());
            System.out.println(/*SALTO DE LÍNEA*/);
        }
    }
    public static Vuelo[] buscarVuelosDeOrigenADestino(String origen, String destino, Aeropuerto a[]){
        Vuelo VL;
        int contador = 0;
        Vuelo listaDeVuelos[];
        for(int i=0; i<a.length; i++){//RECORREMOS AEROPUERTOS
            for(int j=0; j<a[i].getNumeroDeCompañia(); j++){//RECORREMOS COMPAÑIAS
                for(int k=0; k<a[i].getCompañia(j).getNumeroDeVuelo(); k++){//RECORREMOS VUELOS
                    VL = a[i].getCompañia(j).getVuelo(k);//GUARDAMOS VUELO
                    if((origen.equals(VL.getCiudadOrigen()))&&(destino.equals(VL.getCiudadDestino()))){
                        contador++;
                    }
                }
            }
        }
        listaDeVuelos = new Vuelo[contador];
        int q = 0;
        for(int i=0; i<a.length; i++){//RECORREMOS AEROPUERTOS
            for(int j=0; j<a[i].getNumeroDeCompañia(); j++){//RECORREMOS COMPAÑIAS
                for(int k=0; k<a[i].getCompañia(j).getNumeroDeVuelo(); k++){//RECORREMOS VUELOS
                    VL = a[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(VL.getCiudadOrigen()))&&(destino.equals(VL.getCiudadDestino()))){
                        listaDeVuelos[q] = VL;
                        q++;
                    }
                }
            }
        }
        return listaDeVuelos;
    }
    public static void mostrarVueloDeOrigenADestino(String origen, String destino, Aeropuerto a[]){
        Vuelo VL[];
        VL = buscarVuelosDeOrigenADestino(origen, destino, a);
        if(VL.length == 0){
            System.out.println("\n\t\t"+"VUELOS INEXISTENTES ..."+"\n");
        }else{
            System.out.println("\n\t\t"+"VUELOS ENCONTRADOS"+"\n");
            for(int i=0; i<VL.length; i++){
                System.out.println("ID: "+VL[i].getIdentificadorDeVuelo());
                System.out.println("CIUDAD ORIGEN: "+VL[i].getCiudadOrigen());
                System.out.println("CIUDAD DESTINO: "+VL[i].getCiudadDestino());
                System.out.println("PRECIO: $"+VL[i].getPrecio());
                System.out.println(/*SALTO DE LÍNEA*/);
            }
        }
    }
}