package Funciones_Principales;
public class Aeropuerto {
    //ATRIBUTSO
    private String nombreDelAeropuerto;
    private String ciudadDelAeropuerto;
    private String paisDelAeropuerto;
    private Compañia listaDeCompañias[] = new Compañia[10];
    private int numeroDeCompañia;
    //METODOS
    public Aeropuerto(String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto) {
        //CONSTRUCTOR 1
        this.nombreDelAeropuerto = nombreDelAeropuerto;
        this.ciudadDelAeropuerto = ciudadDelAeropuerto;
        this.paisDelAeropuerto = paisDelAeropuerto;
        //INICIALIZACIÓN MANUAL
        this.numeroDeCompañia = 0;
    }
    public Aeropuerto(String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto, Compañia c[]) {
        //CONSTRUCTOR 2
        this.nombreDelAeropuerto = nombreDelAeropuerto;
        this.ciudadDelAeropuerto = ciudadDelAeropuerto;
        this.paisDelAeropuerto = paisDelAeropuerto;
        //INICIALIZACIÓN MANUAL
        listaDeCompañias = c;
        this.numeroDeCompañia = c.length;
    }
    public void insertarCompañia(Compañia compañia){
        listaDeCompañias[numeroDeCompañia] = compañia;
        numeroDeCompañia++;
    }
    public String getNombreDelAeropuerto() {
        //GETTER PARA NOMBRE DEL AEROPUERTO
        return nombreDelAeropuerto;
    }
    public String getCiudadDelAeropuerto() {
        //GETTER PARA CIUDAD DEL AEROPUERTO
        return ciudadDelAeropuerto;
    }
    public String getPaisDelAeropuerto() {
        //GETTER PARA PAÍS DEL AEROPUERTO
        return paisDelAeropuerto;
    }
    public Compañia[] getListaDeCompañias() {
        //GETTER PARA LISTA DE COMPAÑIAS
        return listaDeCompañias;
    }
    public int getNumeroDeCompañia() {
        //GETTER PARA NÚMERO DE COMPAÑIA
        return numeroDeCompañia;
    }
    public Compañia getCompañia(int i){
        //GETTER PARA OBTENER LAS COMPAÑIAS
        return listaDeCompañias[i];
    }
    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int iterador = 0;
        Compañia c = null;
        //BUSQUEDA SECUENCIAL
        while((!encontrado)&&(iterador < listaDeCompañias.length)){
            if(nombre.equals(listaDeCompañias[iterador].getNombreDeLaCompañia())){
                encontrado = true;
                c = listaDeCompañias[iterador];
            }
            iterador++;
        }
        return c;
    }
}