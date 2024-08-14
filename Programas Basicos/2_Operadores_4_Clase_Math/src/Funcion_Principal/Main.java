package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        /*
            LA CLASE MATH CONTIENE DISTINTOS METODOS [ACCIONES] QUE SE PUEDEN LLAMAR
            A LO LARGO DEL PROGRAMA PARA HACER FUNCIONES MATEMATICAS, QUE VIENEN EN
            EL NOMBRE Y SE PUEDEN BUSCAR EN LA RED
        */
        double Raiz_Double = Math.sqrt(9.0);/*LA RAIZ SOLO ACEPTA DOUBLE Y SE LLAMA GUARDANDO EL VALRO EN UNA VARIABLE*/
        int Raiz_Int = (int)Math.sqrt(81);/*SI LO QUEREMOS EN ENTEROS SE DEBE PONER INT ENTRE PARENTESIS*/
        
        System.out.println("Raíz [DOUBLE]: "+Raiz_Double);
        System.out.println("Raíz [INT]: "+Raiz_Int);
        
        double Base = 5, Exponente = 2;
        double Resultado_Potencia = Math.pow(Base,Exponente);/*ESTO SE PUEDE HACER INCLUSO SIN DOUBLE*/
        
        System.out.println("Potencia: "+Resultado_Potencia);
        
        double Double_Redondeo = 99.91;
        long Numero_Redondeado = Math.round(Double_Redondeo);/*NORMALMENTE FUNCIONA MEJOR IGUALANDO LA VARIABLE A LONG PUES ES UN NÚMERO SIN DECIMALES*/
        
        /*SI TUVIERAMOS EL CASO DE QUE EL NÚMERO ES FLOAT, LA VARIABLE DE RESULTADO DEBE SER INT PARA QUE FUNCIONE*/
        
        System.out.println("Número Redondeado: "+Numero_Redondeado);
        
        double Numero_Aleatorio = Math.random();
        
        System.out.println("Número Aleatorio: "+Numero_Aleatorio);
    }    
}