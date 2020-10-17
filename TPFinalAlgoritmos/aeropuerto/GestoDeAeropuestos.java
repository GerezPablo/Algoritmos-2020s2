package aeropuerto;
import java.io.*;

public class GestoDeAeropuestos {
    ArbolBinario arbolBinario;

    public GestoDeAeropuestos(){
        this.arbolBinario = new ArbolBinario();
    }

    
    public void leerArchivo(String ruta) throws IOException {
        FileReader fr = new FileReader (ruta);
        BufferedReader br = new BufferedReader(fr);
        String linea = null;
        
        
        while((linea=br.readLine())!=null){
            String[] datosAeropuerto = linea.split(" ");

            Aeropuerto a1 = new Aeropuerto(datosAeropuerto[0], datosAeropuerto[1], datosAeropuerto[2], datosAeropuerto[3], Double.parseDouble(datosAeropuerto[4])
            , Integer.parseInt(datosAeropuerto[5]), Integer.parseInt(datosAeropuerto[6]), Integer.parseInt(datosAeropuerto[7]));

            Nodo n1 = new Nodo(a1);

            arbolBinario.agregarNodo(n1);
        }

    }

    public void imprimirAeropuestos(){
        arbolBinario.inOrden();
    }

    public void eliminarAeropuerto(String codigo) {
        arbolBinario.eliminarNodo(codigo);
    }

}
