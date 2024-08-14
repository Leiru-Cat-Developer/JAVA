package Funciones_Principales;
public class AeropuertoPrivado extends Aeropuerto {
    //ATRIBUTOS
    private String listaDeEmpresas[] = new String[10];
    private int numeroDeEmpresa;
    //METODOS
    public AeropuertoPrivado(String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto) {
        //CONSTRUCTOR 1
        super(nombreDelAeropuerto, ciudadDelAeropuerto, paisDelAeropuerto);
    }
    public AeropuertoPrivado(String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto, Compañia[] c, String e[]) {
        //CONSTRUCTOR 2
        super(nombreDelAeropuerto, ciudadDelAeropuerto, paisDelAeropuerto, c);
        listaDeEmpresas = e;
        numeroDeEmpresa = e.length;
    }
    public void insertarEmpresas(String e[]){
        this.listaDeEmpresas = e;
        this.numeroDeEmpresa = e.length;
    }
    public void insertarEmpresa(String e){
        listaDeEmpresas[numeroDeEmpresa] = e;
        numeroDeEmpresa++;
    }
    public String[] getListaDeEmpresas() {
        //GETTER PARA LISTA DE EMPRESAS
        return listaDeEmpresas;
    }
    public int getNumeroDeEmpresa() {
        //GETTER PARA NÚMERO DE EMPRESA
        return numeroDeEmpresa;
    }   
}
