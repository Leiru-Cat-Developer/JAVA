package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static int BuscarSucursal(Sucursal t[], int numeroDeSucursal, int contadorSucursal) {
        int indice = 0;
        boolean encontrado = false;
        for(int i = 0; i < contadorSucursal; i++){
            if(t[i].getNumeroDeSucursal() == numeroDeSucursal){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
    public static int BuscarPaquete(Paquete t[], int numeroDePaquete, int contadorPaquete) {
        int indice = 0;
        boolean encontrado = false;
        for(int i = 0; i < contadorPaquete; i++){
            if(t[i].getNumeroDePaquete()== numeroDePaquete){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
    public static void main(String [] args) {
        /*
            UNA EMPRESA DE ENVIO DE PAQUETES TIEN VARIAS SUCURSALES EN TODO EL PAÍS. CADA SUCURSAL ESTÁ DEFINIDA
            POR SU NÚMERO DE SUCURSAL, DIRECCIÓN Y CIUDAD. PARA CALCULAR EL PRECIO QUE CUESTA ENVIAR CADA PAQUETE
            Y LA PRIORIDAD, SABIENDO QUE SE COBRA UN DOLAR POR KILO, 10 DOLARES MÁS SI LA PRIORIDAD ES ALTA Y 20
            SI ES EXPRESS. CADA PAQUETE ENVIADO TENDRA UN NÚMERO DE REFERENCIA Y EL DNI DE LA PERSONA QUE LO ENVIA.
        */
        Scanner lectorDeDatos = new Scanner(System.in);
        int numeroDeSucursal, numeroDePaquete, prioridad, opcion, contadorSucursal = 0, contadorPaquete = 0;
        int indiceSucursal = 0, indicePaquete = 0;
        String direccion, ciudad, dni;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[50];//CREAMOS ALGUNOS ARREGLOS DE SUCURSALES
        Paquete paquete[] = new Paquete[100];//CREAMOS ALGUNOS ARREGLOS DE PAQUETES
        do {
            System.out.println("\t\t"+"MENU"+"\n");
            System.out.println("1. CREAR UNA NUEVA SUCURSAL");
            System.out.println("2. ENVIAR PAQUETE");
            System.out.println("3. CONSULTAR SUCURSAL");
            System.out.println("4. CONSULTAR PAQUETE");
            System.out.println("5. MOSTRAR TODAS LAS SUCURSALES");
            System.out.println("6. MOSTRAR TODOS LOS PAQUETES");
            System.out.println("7. SALIR");
            System.out.print("\n"+"DIGITE SU OPCIÓN -> ");   opcion = lectorDeDatos.nextInt();
            //EVALUAMOS LA OPCION PARA DIRIGIRLO A LA OPCION QUE SE ELIGE
            switch(opcion) {
                case 1:     System.out.print("\n"+"DIGITE EL NÚMERO DE SUCURSAL: "); numeroDeSucursal = lectorDeDatos.nextInt(); 
                            lectorDeDatos.nextLine();//LIMPIEZA DE BUFFER
                            System.out.print("DIGITE LA DIRECCIÓN: ");    direccion = lectorDeDatos.nextLine();
                            System.out.print("DIGITE LA CIUDAD: ");   ciudad = lectorDeDatos.nextLine();
                            sucursal[contadorSucursal] = new Sucursal(numeroDeSucursal, direccion, ciudad);
                            contadorSucursal++;
                            System.out.println("");//SALTO DE LINEA
                    break;
                case 2:     System.out.print("\n"+"DIGITE EL NÚMERO DE SUCURSAL: "); numeroDeSucursal = lectorDeDatos.nextInt();
                            indiceSucursal = BuscarSucursal(sucursal, numeroDeSucursal, contadorSucursal);
                            if(indiceSucursal == -1){
                                System.out.println("\n"+"LA SUCURSAL NO EXISTE ..."+"\n");
                            }else{
                                System.out.print("DIGITE EL NÚMERO DE PAQUETE: "); numeroDePaquete = lectorDeDatos.nextInt();
                                lectorDeDatos.nextLine();//LIMPIEZA DE BUFFER
                                System.out.print("DIGITE EL DNI DE LA PERSONA: "); dni = lectorDeDatos.nextLine();
                                System.out.print("DIGITE EL PESO DEL PAQUETE: "); peso = lectorDeDatos.nextDouble();
                                System.out.print("DIGITE LA PRIORIDAD [0,1,2]: ");  prioridad = lectorDeDatos.nextInt();
                                paquete[contadorPaquete] = new Paquete(numeroDePaquete, dni, peso, prioridad);
                                precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);
                                System.out.println("EL PRECIO DEL PAQUETE ES: $"+precioPaquete+"\n");
                                contadorPaquete++;
                            }
                    break;
                case 3:     System.out.print("\n"+"DIGITE EL NÚMERO DE SUCURSAL: "); numeroDeSucursal = lectorDeDatos.nextInt();
                            indiceSucursal = BuscarSucursal(sucursal, numeroDeSucursal, contadorSucursal);
                            if(indiceSucursal == -1){
                                System.out.println("\n"+"LA SUCURSAL NO EXISTE ..."+"\n");
                            }else{
                                System.out.println("\n\t\t"+"DATOS DE LA SUCURSAL"+"\n");
                                System.out.print(sucursal[indiceSucursal].mostrarDatosDeSucursal());
                                System.out.println("");//SALTO DE LINEA
                            }
                    break;
                case 4:     System.out.print("\n"+"DIGITE EL NÚMERO DE PAQUETE: ");  numeroDePaquete = lectorDeDatos.nextInt();
                            indicePaquete = BuscarPaquete(paquete, numeroDePaquete, contadorPaquete);
                            if(indicePaquete == -1){
                                System.out.println("\n"+"EL PAQUETE NO EXISTE ..."+"\n");
                            }else{
                                System.out.println("\n\t\t"+"DATOS DEL PAQUETE"+"\n");
                                System.out.print(paquete[indicePaquete].mostrarDatosDelPaquete());
                                System.out.println("");//SALTO DE LINEA
                            }
                    break;
                case 5:     for(int i = 0; i < contadorSucursal; i++){
                                System.out.println("\n\t\t"+"DATOS DE LA SUCURSAL "+(i+1)+"\n");
                                System.out.print(sucursal[i].mostrarDatosDeSucursal());
                                System.out.println("");//SALTO DE LINEA
                            }
                    break;
                case 6:     for(int i = 0; i < contadorPaquete; i++){
                                System.out.println("\n\t\t"+"DATOS DEL PAQUETE "+(i+1)+"\n");
                                System.out.print(paquete[i].mostrarDatosDelPaquete());
                                System.out.println("");//SALTO DE LINEA
                            } 
                    break;
                case 7:     System.out.println("\n\t\t"+"SALIENDO ..."+"\n");
                    break;
                default:    System.out.println("\n\t"+"LA OPCION NO EXISTE, INTENTELO DE NUEVO ..."+"\n");
                    break;
            }
        }while(opcion != 7);
    }
}