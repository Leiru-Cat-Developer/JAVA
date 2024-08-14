package Funcion_Principal;
public class Main {
    public static void main(String [] args){
        Persona P1 = new Persona();
        Perro PR1 = new Perro();
        Vaca V1 = new Vaca();
        //INSTANCIAMOS LOS OBJETOS
        P1.comer();
        PR1.comer();
        V1.comer();
        /*
            LA SOBRE ESCRITURA DE MIEMBROS ES AQUELLA QUE SE HACE EN DISTINTAS CLASE PARA RESOLVER EL PROBLEMA
            DE UNA FORMA DISTINTA, EN ESTE PROGRAMA PODEMOS VER CLARAMENTE QUE CUANDO LLAMAMOS LOS OBJETOS
            CON EL METODO COMER, APESAR DE QUE TIENEN EL MISMO NOMBRE, ESTOS NO HACEN LO MISMO, ESTO SUCEDE POR
            QUE SE LE AGREGA LA PALABRA RESERVADA "@Override" ANTES DEL METODO QUE ESTAMOS INSTANCIANDO
        */
    }
}