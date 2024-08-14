package Funcion_Principal;
public class Main {
    public static void main(String [] args) {
        /*
            CONVERSION DESCENDENTE DE TIPOS (DOWNCASTING), CONVERTIR UN OBJETO DE LA SUPERCLASE EN UNO DE LA SUBCLASE
            PARA ELLO PREVIAMENTE DEBIO HABER EXISTIDO UN UPCASTING
        */
        Vehiculo vehiculo = new VehiculoTurismo(4,"HTML","FERRARI","A89");//UPCASTING
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo;//TRANSFORMACION EN DONDE LE DECIMOS EN QUE SE TRANSFORME EN LOS PARENTESIS, COMO UNA ESPECIE DE NEW
        System.out.println(nuevoVehiculo);
        /*
            EL SIGUIENTE CÓDIGO Y COMENTARIOS SE REEMPLAZA CON LO ANTERIOR PARA SOLO PROBAR EL POLIMORFISMO:
            
            Vehiculo misVehiculos[] = new Vehiculo[4];
            misVehiculos[0] = new Vehiculo("HTMLVRA0","FERRARI","A89");
            misVehiculos[1] = new VehiculoTurismo(4,"MAAU0130","AUDI","T14");
            misVehiculos[2] = new VehiculoDeportivo(10,"2020600","FORD","TT09");
            misVehiculos[3] = new VehiculoFurgoneta(6000,"700HJL","TOYOTA","HFA9");
            for(Vehiculo vehiculos: misVehiculos){
                System.out.println(vehiculos.mostrarDatos());
                System.out.println("");
            }
        
            //LOS OBJETOS ACTUAN DE DIFERENTE FORMA CUANDO LOS INSTANCIAMOS
        */
        
        /*
            EL SIGUIENTE CÓDIGO Y COMENTARIOS SE REEMPLAZA CON LO ANTERIOR PARA PROBAR EL UPCASTING
        
            //CONVERSION ASCENDENTE DE TIPOS (UPCASTING), CONVERTIR UN OBJETO DE LA SUBCLASE UN OBJETO DE LA SUPERCLASE
            Vehiculo nuevoVehiculo = new VehiculoTurismo(4,"HTML","FERRARI","A89");
            System.out.println(nuevoVehiculo);
        */
    }
}
