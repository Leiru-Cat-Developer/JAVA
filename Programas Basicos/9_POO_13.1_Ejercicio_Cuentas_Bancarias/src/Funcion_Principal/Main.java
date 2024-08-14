package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static int BuscarNumeroDeCuenta(Cuenta cuentas[], int n){
        int i = 0, indice  = 0;//LA VARIABLE I ES UN ITERADOR, Y LA VARIABLE INDICE ES LO QUE SE RETORNARA
        boolean variableEncontrada = false;
        //BUSQUEDA SECUENCIAL
        while((i<cuentas.length) && (variableEncontrada==false)){
            if(cuentas[i].getNumeroDeCuenta() == n){
                indice = i;//SE GUARDA LA POCISION DEL ARREGLO
                variableEncontrada = true;
            }
            i++;
        }
        if(variableEncontrada == false){
            indice -= 1;//RESTAMOS 1 PARA QUE NO SE GUARDE UNA POCISION INDESEADA
        }
        return indice;
    }
    public static void main(String [] args) {
        /*
            HACER UN PROGRAMA SENCILLO PARA REALIZAR GESTIONES EN UN BANCO, PARA LO CUAL TENDREMOS DOS
            CLASES [CLIENTE Y CUENTA]. CONSIDERAR QUE UN CLIENTE SE CARACTERIZA POR SU NOMBRE, APELLIDO
            Y DNI. EL CLIENTE PUEDE CONSULTAR SALDO, ASÍ COMO INGRESAR Y RETIRAR DINERO DE SUS CUENTAS.
            ADEMAS CADA CUENTA SE CARACTERIZA POR TENER UN NÚMERO DE CUENTA Y UN SALDO.
        */
        Scanner lectorDeDatos = new Scanner(System.in);
        String nombre, apellido, dni;
        int numeroDeCuenta, nCuentas, opcionMenu = 0, indiceCuenta;
        double saldo, cantidad;
        Cuenta cuentas[];   //OBJETO ARREGLO CUENTA
        Cliente cliente;    //OBJETO CLIENTE
        System.out.print("DIGITE EL NOMBRE DEL CLIENTE: "); nombre = lectorDeDatos.nextLine();      //lectorDeDatos.nextLine();//LIMPIAR CONSOLA
        System.out.print("DIGITE EL APELLIDO DEL CLIENTE: "); apellido = lectorDeDatos.nextLine();  //lectorDeDatos.nextLine();//LIMPIAR CONSOLA
        System.out.print("DIGITE EL DNI DEL CLIENTE: "); dni = lectorDeDatos.nextLine();            //lectorDeDatos.nextLine();//LIMPIAR CONSOLA
        System.out.print("DIGITE CUANTAS CUENTAS TIENE: "); nCuentas = lectorDeDatos.nextInt();
        cuentas = new Cuenta[nCuentas];//CREAMOS EL ARREGLO DE OBJETOS DE LA CLASE CUENTA
        for(int i = 0; i < cuentas.length; i++){
            //PEDIMOS LOS DATOS DE LA CUENTA
            System.out.println("\n\t\t"+"DIGITE LOS DATOS DE LA CUENTA "+(i+1)+"\n");
            System.out.print("DIGITE EL NÚMERO DE CUENTA: ");   numeroDeCuenta = lectorDeDatos.nextInt();
            System.out.print("DIGITE EL SALDO DE LA CUENTA: $"); saldo = lectorDeDatos.nextDouble();
            cuentas[i] = new Cuenta(numeroDeCuenta, saldo);//PASAMOS LOS DATOS AL OBJETO CUENTA
        }
        cliente = new Cliente(nombre, apellido, dni, cuentas);//PASAMOS LOS DATOS AL CONSTRUCTOR DE CUENTA
        do{//MENÚ
            System.out.print("\n\t\t"+"MENU"+"\n");
            System.out.println("1. INGRESAR DINERO A LA CUENTA");
            System.out.println("2. RETIRAR DINERO DE LA CUENTA");
            System.out.println("3. CONSULTAR DINERO DE LA CUENTA");
            System.out.println("4. SALIR");
            System.out.print("DIGITE SU OPCION -> ");   opcionMenu = lectorDeDatos.nextInt();
            //COMENZAMOS A EVALUAR CADA UNO DE LOS CASOS
            switch(opcionMenu){
                case 1:     System.out.print("\n"+"DIGITE EL NÚMERO DE CUENTA: ");   numeroDeCuenta = lectorDeDatos.nextInt();
                            indiceCuenta = BuscarNumeroDeCuenta(cuentas, numeroDeCuenta);
                            if(indiceCuenta == -1){
                                System.out.println("NO SE ENCONTRO EL NÚMERO DE CUENTA ...");
                            }else{
                                System.out.print("DIGITE LA CANTIDAD QUE DESEA INGRESAR: $"); cantidad = lectorDeDatos.nextDouble();
                                cliente.ingresarDinero(indiceCuenta, cantidad);
                                System.out.println("\t"+"INGRESO EXITOSO ...");
                                System.out.println("SALDO DISPONIBLE "+cliente.consultarSaldo(indiceCuenta));
                            }
                    break;
                case 2:     System.out.print("\n"+"DIGITE EL NÚMERO DE CUENTA: ");   numeroDeCuenta = lectorDeDatos.nextInt();
                            indiceCuenta = BuscarNumeroDeCuenta(cuentas, numeroDeCuenta);
                            if(indiceCuenta == -1){
                                System.out.println("NO SE ENCONTRO EL NÚMERO DE CUENTA ...");
                            }else{
                                System.out.print("DIGITE LA CANTIDAD QUE DESEA RETIRAR: $"); cantidad = lectorDeDatos.nextDouble();
                                if(cliente.consultarSaldo(indiceCuenta) < cantidad){
                                    System.out.println("SALDO INSUFICIENTE ...");
                                }else{
                                    cliente.retirarDinero(indiceCuenta, cantidad);
                                    System.out.println("\t"+"RETIRO EXITOSO ...");
                                    System.out.println("SALDO DISPONIBLE "+cliente.consultarSaldo(indiceCuenta));
                                }
                            }
                    break;
                case 3:     System.out.print("\n"+"DIGITE EL NÚMERO DE CUENTA: ");   numeroDeCuenta = lectorDeDatos.nextInt();
                            indiceCuenta = BuscarNumeroDeCuenta(cuentas, numeroDeCuenta);
                            if(indiceCuenta == -1){
                                System.out.println("NO SE ENCONTRO EL NÚMERO DE CUENTA ...");
                            }else{
                                System.out.println("SALDO DISPONIBLE "+cliente.consultarSaldo(indiceCuenta));
                            }
                    break;
                case 4:     System.out.println("\n\t\t"+"SALIENDO ..."+"\n");
                    break;
                default:    System.out.println("\n\t"+"LA OPCION NO EXISTE, INTENTELO DE NUEVO ...");
                    break;
            }
        }while(opcionMenu != 4);
    }
}