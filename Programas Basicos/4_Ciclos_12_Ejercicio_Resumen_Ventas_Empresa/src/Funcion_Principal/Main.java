package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            UNA EMPRESA SE DEDICA A LA VENTAS DE DESINFECTANTES, NECESITA UN PROGRAMA
            PARA GESTIONAR LAS FACTURAS. EN CADA FACTURA FIGURA: EL CÓDIGO DEL ARTICULO,
            LA CANTIDAD VENDIDA EN LITROS Y EL PRECIO POR LITRO. SE PIDE DE 5 FACTURAS
            INTRODUCIDAS: FACTURACION TOTAL, CANTIDAD EN LITROS VENDIDOS DEL ARTICULO 1 
            Y CUANTAS FACTURAS SE EMITIERON DE MÁS DE $600 
        */
        long Código_Articulo = 0, Cantidad_Vendida_Litros = 0, Litros_Articulo_Uno = 0, Contador_Facturas_Mayores_Seiscientos = 0;
        float Precio_Por_Litro = 0, Importe_Factura = 0, Facturacion_Total = 0;
        for(int i = 0; i < 5; i++){
            
            Código_Articulo = Long.parseLong(JOptionPane.showInputDialog("DIGITE EL CÓDIGO DEL ARTICULO"));
            Cantidad_Vendida_Litros = Long.parseLong(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE LITROS DEL ARTICULO"));
            Precio_Por_Litro = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO POR LITRO DEL ARTICULO"));
            
            Importe_Factura = Cantidad_Vendida_Litros * (float)Precio_Por_Litro;    /*IMPORTE POR FACTURAS*/
            Facturacion_Total += Importe_Factura;                                   /*TOTAL DE LAS FACTURAS*/
            if(Código_Articulo == 1){
                
                Litros_Articulo_Uno += Cantidad_Vendida_Litros;
                
            }
            if(Importe_Factura > 600){
                
                Contador_Facturas_Mayores_Seiscientos++;
                
            }
        }
        /*MOSTRAMOS TODO LO PEDIDO EN PANTALLA JUNTO CON LAS OPERACIONES CORRESPONDIENTES*/
        System.out.println("\t"+"RESUMEN DE VENTAS"+"\n");
        System.out.println("FACTURACION TOTAL: "+Facturacion_Total);
        System.out.println("CANTIDAD EN LITROS DEL ARTICULO 1: "+Litros_Articulo_Uno);
        System.out.println("CANTIDAD DE FACTURAS MAYORES $600: "+Contador_Facturas_Mayores_Seiscientos);
    }    
}