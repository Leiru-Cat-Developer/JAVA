package Funcion_Principal;
import java.util.Scanner;
public class Main {
    public static double Triangulo_Con_Mayor_Area(Triangulo TRA[]){
        double Area = TRA[0].Area();
        for(int i = 1; i < TRA.length; i++){
            if(TRA[i].Area() > Area){
                Area = TRA[i].Area();
            }
        }
        return Area;
    }
    public static void main(String [] args) {
        /*
            DISEÑAR UN PROGRAMA PARA TRABAJAR CON TRIANGULOS ISOCELES. PARA ELLO DEFINA LOS ATRIBUTOS NECESARIOS QUE SE
            REQUIEREN, PROPORCIONE METODOS DE CONSULTA, UN METODO CONSTRUCTOR E IMPLEMENTE METODOS PARA CALCULAR EL PERIMETRO
            Y EL AREA DE UN TRIANGULO, ADEMAS IMPLEMENTAR UN METODO QUE A PARTIR DE UN ARREGLO DE TRIANGULOS DEVUELVA EL AREA
            DEL TRIANGULO DE MAYOR SUPERFICIE
        */
        Scanner Lector_De_Datos = new Scanner(System.in);
        double Lado = 0, Base = 0;
        int Numero_De_Triangulos = 0;
        while(Numero_De_Triangulos <= 0){
            System.out.print("DIGITE EL NÚMERO DE TRIANGULOS QUE DESEA INGRESAR: ");  Numero_De_Triangulos = Lector_De_Datos.nextInt();
            if(Numero_De_Triangulos <= 0){
                System.out.println("\n"+"EL NÚMERO DE TRIANGULOS ES ILOGICO, INTENTELO DE NUEVO ...");
            }
        }
        Triangulo TRA[] = new Triangulo[Numero_De_Triangulos];
        for(int i = 0; i < TRA.length; i++){
            System.out.println("\n\t\t"+"DATOS DEL TRIANGULO "+(i+1)+"\n");
            System.out.print("DIGITE EL VALOR DEL LADO: ");   Lado = Lector_De_Datos.nextDouble();
            System.out.print("DIGITE EL VALOR DE LA BASE: "); Base = Lector_De_Datos.nextDouble();
            TRA[i] = new Triangulo(Base, Lado);
            //MOSTRAMOS EL AREA Y EL PERIMETRO DEL TRIANGULO
            System.out.println("\n\t\t"+"AREA"+"\n");
            System.out.println("-> "+TRA[i].Area());
            System.out.println("\n\t\t"+"PERIMETRO"+"\n");
            System.out.println("-> "+TRA[i].Perimetro());
        }
        System.out.println("\n"+"EL TRIANGULO CON MAYOR SUPERFICIE ES: "+Triangulo_Con_Mayor_Area(TRA));
        
    }
}