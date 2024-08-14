package Funcion_Principal;
public class NumeroComplejo {
    //ATRIBUTOS
    private double parteReal;        //POR EJEMPLO EL NÚMERO 3
    private double parteImaginaria;  //POR EJEMPLO EL NÚMERO 4i
    //METODOS
    public NumeroComplejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        //CONSTRUCTOR
    }
    public double getParteReal() {
        return parteReal;
        //GETTER PARTE REAL
    }
    public double getParteImaginaria() {
        return parteImaginaria;
        //GETTER PARTE IMAGINARIA
    }
    public NumeroComplejo calcularSuma(NumeroComplejo numero){
        NumeroComplejo suma;
        suma = new NumeroComplejo((parteReal+numero.getParteReal()), (parteImaginaria+numero.getParteImaginaria()));
        return suma;
        /*
            SUPOCISION SUMA:
        
            PARTE 1:    3 + 4i
            PARTE 2:    5 + 3i
            SUMA:       8 + 7i
        */
    }
    public NumeroComplejo calcularMultiplicacion(NumeroComplejo numero){
        NumeroComplejo multiplicacion;
        multiplicacion = new NumeroComplejo((parteReal*numero.getParteReal())-(parteImaginaria*numero.getParteImaginaria()),(parteReal*numero.getParteImaginaria())+(parteImaginaria*numero.getParteReal()));
        return multiplicacion;
        /*
            SUPOCISION MULTIPLICACION:
    
            PARTE 1:                3 + 4i
            PARTE 2:                5 + 3i
            MULTIPLICACION:         (3*5 - 4*3)+(3*3 + 4*5)
        */
    }
    public boolean comprobarIgualdad(NumeroComplejo numero){
        boolean igualdad = false;
        if((parteReal == numero.parteReal)&&(parteImaginaria == numero.parteImaginaria)){
            igualdad = true;
        }
        return igualdad;
        /*
            SUPOCISION COMPARACION:
    
            PARTE 1:                3 + 4i
            PARTE 2:                3 + 4i
        */
    }
    public NumeroComplejo multiplicacionPorEntero(int Entero){
        NumeroComplejo multiplicacion;
        multiplicacion = new NumeroComplejo(parteReal*Entero, parteImaginaria*Entero);
        return multiplicacion;
        /*
            SUPOCISION MULTIPLICACION POR ENTERO:
    
            PARTE 1:                3 + 4i
            ENTERO:                 2
            MULTIPLICACION:         6 + 8i
        */
    }
}