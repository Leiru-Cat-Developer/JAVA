package Funcion_Principal;
public class Main {
    public static void main(String[] args) {
        String[] Nombres_De_Personas = {"URIEL","MANUEL","DANIEL","JUAN"};
        /*
            LA MANERA CONVENCIONAL SERÍA HACER:
            for(int i = 0; i<4; i++){
            
                System.out.println(Nombres_De_Personas[i]);
                
            }
        
            O SI NOS DA PEREZA SABER CUANTOS ELEMENTOS HAY EN EL ARREGLO
            for(int i = 0; i<Nombres_De_Personas.length(); i++){
            
                System.out.println(Nombres_De_Personas[i]);
                
            }
        */
        for(String Elementos:Nombres_De_Personas){
            
            System.out.println(Elementos);
            
        }
        /*SIMPLEMENTE SE COPEEA TODO EN EL ITERADOR DEL MISMO TIPO DEL ARREGLO E IMPRIMIMOS EL ARREGLO*/
    }    
}