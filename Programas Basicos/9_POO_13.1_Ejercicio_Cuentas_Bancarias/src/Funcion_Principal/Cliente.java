package Funcion_Principal;
public class Cliente {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];//ARREGLO DE LA CLASE CUENTA
    //METODOS
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        //METODO CONSTRUCTOR
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    public String getNombre() {
        //GETTER PARA NOMBRE
        return nombre;
    }  
    public String getApellido() {
        //GETTER PARA APELLIDO
        return apellido;
    }
    public String getDni() {
        //GETTER PARA DNI
        return dni;
    }
    public double consultarSaldo(int n) {//n ES UN ITERADOR
        return cuentas[n].getSaldo();//CONSULTAMOS EL SALDO DE LA CUENTA Y DEVOLVEMOS LA CANTIDAD
    }
    public void ingresarDinero(int n, double cantidad) {//n ES UN ITERADOR Y CANTIDAD ES EL DINERO QUE INGRESAREMOS
        cuentas[n].ingresarDinero(cantidad);//BUSCAMOS LA CUENTA CON EL ITERADOR Y INGRESAMOS LA CANTIDAD
    }
    public void retirarDinero(int n, double cantidad) {//n ES UN ITERADOR Y CANTIDAD ES EL DINERO QUE RETIRAREMOS
        cuentas[n].retirarDinero(cantidad);//BUSCAMOS LA CUENTA CON EL ITERADOR Y RETIRAMOS LA CANTIDAD
    }
}