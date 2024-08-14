package Funciones_Principales;
public class Vuelo {
    //ATRIBUTOS
    private String identificadorDeVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numeroMaximoDePasajeros;
    private int numeroActualDePasajeros;
    private Pasajero listaDePasajeros[];
    //METODOS
    public Vuelo(String identificadorDeVuelo, String ciudadOrigen, String ciudadDestino, double precio, int numeroMaximoDePasajeros) {
        //CONSTRUCTOR
        this.identificadorDeVuelo = identificadorDeVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numeroMaximoDePasajeros = numeroMaximoDePasajeros;
        //INICIALIZACIÓN MANUAL
        this.numeroActualDePasajeros = 0;
        this.listaDePasajeros = new Pasajero[numeroMaximoDePasajeros];
    }
    public String getIdentificadorDeVuelo() {
        //GETTER PARA IDENTIFICADOR DE VUELO
        return identificadorDeVuelo;
    }
    public String getCiudadOrigen() {
        //GETTER PARA CIUDAD ORIGEN
        return ciudadOrigen;
    }
    public String getCiudadDestino() {
        //GETTER PARA CIUDAD DESTINO
        return ciudadDestino;
    }
    public double getPrecio() {
        //GETTER PARA PRECIO
        return precio;
    }
    public int getNumeroMaximoDePasajeros() {
        //GETTER PARA NÚMERO MÁXIMO DE PASAJEROS
        return numeroMaximoDePasajeros;
    }
    public int getNumeroActualDePasajeros() {
        //GETTER PARA NÚMERO ACTUAL DE PASAJEROS
        return numeroActualDePasajeros;
    }
    public void insertarPasajero(Pasajero pasajero){
        listaDePasajeros[numeroActualDePasajeros] = pasajero;
        numeroActualDePasajeros++;
    }
    public Pasajero getPasajero(int i){
        //BUSQUEDA DE UN PASAJERO
        return listaDePasajeros[i];
    }
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int iterador = 0;
        Pasajero p = null;
        //BUSQUEDA SECUENCIAL
        while((!encontrado)&&(iterador < listaDePasajeros.length)){             //(ENCONTRADO == FALSE) IGUAL (!ENCONTRADO)
            if(pasaporte.equals(listaDePasajeros[iterador].getNumeroDePasaporte())){    //COMPARACION [EJEMPLO]
                encontrado = true;
                p = listaDePasajeros[iterador];
            }
            iterador++;
        }
        return p;
    }
}