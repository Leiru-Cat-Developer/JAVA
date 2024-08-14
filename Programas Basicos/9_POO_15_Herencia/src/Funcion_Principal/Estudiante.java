package Funcion_Principal;
//DESPUES DE "public class NOMBRE DE LA CLASE" DEBEMOS AGREGAR "extends NOMBRE DE LA CLASE QUE HEREDA"
public class Estudiante extends Persona {
    //ATRIBUTOS
    private int boletaEstudiante;
    private float calificacionFinal;
    //METODOS
    public Estudiante(int boletaEstudiante, float calificacionFinal, String nombre, String apellido, int edad) {
        //EL CONSTRUCTOR AGREGA LOS ATRIBUTOS DE LA CLASE QUE HEREDA PERO SOLO CON LA PALABRA RESERVADA "SUPER"
        super(nombre, apellido, edad);
        this.boletaEstudiante = boletaEstudiante;
        this.calificacionFinal = calificacionFinal;
    }
    public void mostrarDatosDelEstudiante(){
        //HEREDAMOS CON LOS METODOS GETTER
        System.out.println("NOMBRE DEL ESTUDIANTE: "+getNombre());
        System.out.println("APELLIDO DEL ESTUDIANTE: "+getApellido());
        System.out.println("EDAD DEL ESTUDIANTE: "+getEdad());
        System.out.println("BOLETA DEL ESTUDIANTE: "+boletaEstudiante);
        System.out.println("CALIFICACION FINAL DEL ESTUDIANTE: "+calificacionFinal);
        System.out.println("");//SALTO DE LINEA
    }
    /*
        PODEMOS MODIFICAR EL ENCAPSULAMIENTO DE LA CLASE QUE HEREDA INICIANDO LAS VARIABLES CON "PROTECTED" 
        EN LUGAR DE "PRIVATE" DE ESTÁ MANERA PODEMOS COLOCAR LAS VARIABLES DIRECTAMENTE EN LUGAR DE LLAMARLAS 
        CON GETTERS, ESTO NO AFECTA EL ENCAPSULAMIENTO, SI QUEREMOS PROBAR LA TEORIA DEL INICIALIZADOR "PROTECTED" 
        HAY QUE REEMPLAZAR ESTE TROZO DE CÓDIGO Y HACER LOS ARREGLOS NECESARIOS ...
    
        **SE REEMPLAZA EN CLASE PERSONA COMO ATRIBUTOS**
        protected String nombre;
        protected String apellido;
        protected int edad;
        **SE REEMPLAZA EN CLASE ESTUDIANTE EN METODO MOSTRAR DATOS DEL ESTUDIANTE**
        System.out.println("NOMBRE DEL ESTUDIANTE: "+nombre);
        System.out.println("APELLIDO DEL ESTUDIANTE: "+apellido);
        System.out.println("EDAD DEL ESTUDIANTE: "+edad);
    */
}