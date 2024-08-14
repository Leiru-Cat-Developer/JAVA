package Funcion_Principal;
public class Sucursal {
    //ATRIBUTOS
    private int numeroDeSucursal;
    private String direccion;
    private String ciudad;
    //METODOS
    public Sucursal(int numeroDeSucursal, String direccion, String ciudad) {
        //CONSTRUCTOR
        this.numeroDeSucursal = numeroDeSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    public int getNumeroDeSucursal() {
        //GETTER PARA NUMERO DE SUCURSAL
        return numeroDeSucursal;
    }
    public String getDireccion() {
        //GETTER PARA DIRECCION
        return direccion;
    }
    public String getCiudad() {
        //GETTER PARA CIUDAD
        return ciudad;
    }
    public String mostrarDatosDeSucursal(){
        //MOSTRAMOS LOS DATOS DE LA SUCURSAL
        return "\n"+"NÚMERO DE SUCURSAL: "+numeroDeSucursal+", DIRECCIÓN: "+direccion+", CIUDAD: "+ciudad+"\n";
    }
    public double calcularPrecio(Paquete p){
        double precio;
        precio = p.getPeso();
        switch(p.getPrioridad()){
            case 1:     precio += 10;
                break;
            case 2:     precio += 20;
                break;
            //NO IMPORTA SI NO TERMINAMOS EL CICLO CON DEFAULT
        }
        return precio;
    }
}