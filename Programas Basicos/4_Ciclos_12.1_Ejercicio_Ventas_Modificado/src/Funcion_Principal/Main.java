package Funcion_Principal;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        /*
            LAS MODIFICACIONES DEL PROGRAMA ANTERIOR SON SUPONIENDO QUE:
        
                NO SE INTRODUCE EL PRECIO POR LITRO, EN CAMBIO EXISTEN PRECIOS FIJOS
                
            ** 1.-  $0.6 EL LITRO
            ** 2.-  $3.0 EL LITRO
            ** 3.-  $1.25 EL LITRO
        
            ESTO SIGNIFICA QUE TODO TIENE QUE SER CON BASE AL CÓDIGO QUE SE INGRESE
        */
        long Código_Articulo = 0, Cantidad_Vendida_Litros = 0, Litros_Articulo_Uno = 0, Contador_Facturas_Mayores_Seiscientos = 0;
        float Importe_Factura = 0, Facturacion_Total = 0;
        for(int i = 0; i < 5; i++){
            
            Código_Articulo = Long.parseLong(JOptionPane.showInputDialog("DIGITE EL CÓDIGO DEL ARTICULO"));
            Cantidad_Vendida_Litros = Long.parseLong(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE LITROS DEL ARTICULO"));
            
            switch((int)Código_Articulo){
                case 1:     Importe_Factura = Cantidad_Vendida_Litros * 0.6f;    /*IMPORTE POR FACTURAS*/
                            Facturacion_Total += Importe_Factura;                /*TOTAL DE LAS FACTURAS*/
                            Litros_Articulo_Uno += Cantidad_Vendida_Litros;
                            if(Importe_Factura > 600){
                                Contador_Facturas_Mayores_Seiscientos++;
                            }
                    break;
                case 2:     Importe_Factura = Cantidad_Vendida_Litros * 3f;    /*IMPORTE POR FACTURAS*/
                            Facturacion_Total += Importe_Factura;                /*TOTAL DE LAS FACTURAS*/
                            if(Importe_Factura > 600){
                                Contador_Facturas_Mayores_Seiscientos++;
                            }
                    break;
                case 3:     Importe_Factura = Cantidad_Vendida_Litros * 1.25f;    /*IMPORTE POR FACTURAS*/
                            Facturacion_Total += Importe_Factura;                /*TOTAL DE LAS FACTURAS*/
                            if(Importe_Factura > 600){
                                Contador_Facturas_Mayores_Seiscientos++;
                            }
                    break;
                default:        JOptionPane.showMessageDialog(null,"EL ARTICULO NO EXISTE, NO SERÁ CONTADO");
                    break;
            }
        }
        /*MOSTRAMOS TODO LO PEDIDO EN PANTALLA JUNTO CON LAS OPERACIONES CORRESPONDIENTES*/
        System.out.println("\t"+"RESUMEN DE VENTAS"+"\n");
        System.out.println("FACTURACION TOTAL: "+Facturacion_Total);
        System.out.println("CANTIDAD EN LITROS DEL ARTICULO 1: "+Litros_Articulo_Uno);
        System.out.println("CANTIDAD DE FACTURAS MAYORES $600: "+Contador_Facturas_Mayores_Seiscientos);
    }    
}