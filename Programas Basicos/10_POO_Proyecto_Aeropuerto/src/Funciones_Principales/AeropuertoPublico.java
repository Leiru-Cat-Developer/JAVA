package Funciones_Principales;
public class AeropuertoPublico extends Aeropuerto {
    //ATRIBUTOS
    private double subvencionQueDaElGobierno;
    //METODOS
    public AeropuertoPublico(String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto) {
        //CONSTRUCTOR 1
        super(nombreDelAeropuerto, ciudadDelAeropuerto, paisDelAeropuerto);
    }

    public AeropuertoPublico(double subvencionQueDaElGobierno, String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto, Compañia[] c) {
        //CONSTRUCTOR 2
        super(nombreDelAeropuerto, ciudadDelAeropuerto, paisDelAeropuerto, c);
        this.subvencionQueDaElGobierno = subvencionQueDaElGobierno;
    }

    public AeropuertoPublico(double subvencionQueDaElGobierno, String nombreDelAeropuerto, String ciudadDelAeropuerto, String paisDelAeropuerto) {
        //CONSTRUCTOR 3
        super(nombreDelAeropuerto, ciudadDelAeropuerto, paisDelAeropuerto);
        this.subvencionQueDaElGobierno = subvencionQueDaElGobierno;
    }
    public double getSubvencionQueDaElGobierno() {
        //GETTER PARA SUBVENCIÓN QUE DA EL GOBIERNO
        return subvencionQueDaElGobierno;
    }
}
