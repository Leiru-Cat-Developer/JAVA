package Funcion_Principal;
public class Main {
    public static void main(String [] args) {
        Planta P1 = new Planta();
        AnimalCarnivoro AC = new AnimalCarnivoro();
        AnimalHervivoro AH = new AnimalHervivoro();
        P1.alimentarse();
        AC.alimentarse();
        AH.alimentarse();
        /*
            - LAS CLASES ABSTRACTAS NO SE PUEDEN INSTANCIAR
            - SI TENEMOS UNA CLASE ABSTRACTA, ENTONCES TODOS SUS METODOS DEBEN SER ABSTRACTOS
            - CUANDO HEREDAMOS DE UNA CLASE ABSTRACTA, ESTÁ DEBE DE HACER SOBRE ESCRITURA DE MIEMBROS
            - DEPENDIENDO DE CUAL SEA NUESTRA CLASE PRINCIPAL, SE HARA TODO LO DEMÁS
        */
    }
}