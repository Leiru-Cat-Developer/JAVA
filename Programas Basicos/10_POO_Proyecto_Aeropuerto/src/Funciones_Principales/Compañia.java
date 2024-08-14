package Funciones_Principales;
public class Compañia {
    //ATRIBUTOS
    private String nombreDeLaCompañia;
    private Vuelo listaDeVuelos[] = new Vuelo[10];
    private int numeroDeVuelo = 0;
    //METODOS
    public Compañia(String nombreDeLaCompañia) {
        //CONSTRUCTOR 1
        this.nombreDeLaCompañia = nombreDeLaCompañia;
    }
    public Compañia(String nombreDeLaCompañia, Vuelo v[]) {
        //CONSTRUCTOR 2
        this.nombreDeLaCompañia = nombreDeLaCompañia;
        listaDeVuelos = v;
        numeroDeVuelo = v.length;
    }
    public String getNombreDeLaCompañia() {
        //GETTER PARA NOMBRE DE LA COMPAÑIA
        return nombreDeLaCompañia;
    }
    public int getNumeroDeVuelo() {
        //GETTER PARA NÚMERO DE VUELO
        return numeroDeVuelo;
    } 
    public void insertarVuelo(Vuelo vuelo){
        listaDeVuelos[numeroDeVuelo] = vuelo;
        numeroDeVuelo++;
    }
    public Vuelo getVuelo(int i){
        //GETTER PARA BUSCAR NÚMERO DE VUELO
        return listaDeVuelos[i];
    }
    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int iterador = 0;
        Vuelo v = null;
        //BUSQUEDA SECUENCIAL
        while((!encontrado)&&(iterador < listaDeVuelos.length)){
            if(id.equals(listaDeVuelos[iterador].getIdentificadorDeVuelo())){
                encontrado = true;
                v = listaDeVuelos[iterador];
            }
            iterador++;
        }
       return v;
    }
}