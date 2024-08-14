package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
            HACER UN PROGRAMA QUE CUMPLA LA FUNCION EN UN ESTABLECIMIENTO DE AUTOS, EN LA QUE
            PAGA A SU PERSONAL DE VENTAS UN SALARIO DE $1000 MENSUALES, MÁS UNA COMISIÓN DE
            $150 POR CADA CARRO VENDIDO, MÁS EL 5% DEL VALOR DE LA VENTA POR CARRO. CADA MES
            EL CAPTURISTA DE LA EMPRESA INGRESA EN LA COMPUTADORA LOS DATOS PERTINENTES. HACER
            UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO MENSUAL DE UN VENDEDOR DADO.
        */
        Scanner Lector_Datos = new Scanner(System.in);
        int Cantidad_De_Autos_Vendidos = 0;
        float Valor_De_La_Venta_Por_Carro = 0, Salario_Del_Empleado = 0;
        /*PEDIMOS LOS DATOS DE LOS AUTOS VENDIDOS POR EL EMPLEADO*/
        System.out.print("CANTIDAD DE AUTOS VENDIDOS POR EL EMPLEADO: "); Cantidad_De_Autos_Vendidos = Lector_Datos.nextInt();
        System.out.print("INGRESE LA CANTIDAD DE DINERO TOTAL POR AUTOS VENDIDOS: $");  Valor_De_La_Venta_Por_Carro = Lector_Datos.nextFloat();
        /*RESOLVEMOS CON LAS OPERACIONES CORRESPONDIENTES*/
        Salario_Del_Empleado = 1000 + (Cantidad_De_Autos_Vendidos * 150) + (0.05f * Valor_De_La_Venta_Por_Carro * Cantidad_De_Autos_Vendidos);
        /*IMPRIMIMOS EL RESULTADO EN PANTALLA*/
        System.out.println("EL SALARIO TOTAL DEL EMPLEADO ES: $"+Salario_Del_Empleado);
    }    
}