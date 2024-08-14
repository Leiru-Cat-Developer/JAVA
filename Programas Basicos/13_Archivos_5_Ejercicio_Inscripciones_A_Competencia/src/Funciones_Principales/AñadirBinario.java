package Funciones_Principales;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class AñadirBinario extends ObjectOutputStream {
    public AñadirBinario(OutputStream out) throws IOException {
        super(out);
    }
    public AñadirBinario() throws IOException, SecurityException {
    }
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("Registro Atletas.bin");
        if(archivo.length() == 0){
            //SI EL ARCHIVO ESTA VACIO
            super.writeStreamHeader();
        }else{
            //SI EL ARCHIVO YA TIENE CONTENIDO
            reset();
        }
    }
}