package Funcion_Principal;
public class Cuenta {
    //ATRIBUTOS
    private int numeroDeCuenta;
    private double saldo;
    //METODOS
    public Cuenta(int numeroDeCuenta, double saldo) {
        //METODO CONSTRUCTOR
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }
    public int getNumeroDeCuenta() {
        //GETTER PARA NÚMERO DE CUENTA
        return numeroDeCuenta;
    }
    public double getSaldo() {
        //SETTER PARA SALDO
        return saldo;
    }
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;//SUMAMOS LA CANTIDAD DE DINERO
    }
    public void retirarDinero(double cantidad) {
        saldo -= cantidad;//RESTAMOS LA CANTIDAD DE DINERO
    }
}