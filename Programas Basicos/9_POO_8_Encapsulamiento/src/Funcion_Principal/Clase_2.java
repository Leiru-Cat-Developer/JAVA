package Funcion_Principal;
public class Clase_2 {
    public static void main(String [] args){
        Clase_1 C1 = new Clase_1();
        C1.Set_Edad(20);
        C1.setNombre("URIEL");
        System.out.println("LA EDAD ES: "+C1.Get_Edad());
        System.out.println("EL NOMBRE ES: "+C1.getNombre());
    }
}