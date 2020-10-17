package aeropuerto;

public class Aeropuerto {
    private String codigoIata;
    private String nombre;
    private String ciudad;
    private String pais;
    private double superficie;
    private int cantidadTerminales;
    private int destinosNacionales;
    private int destinosInternacionales;

    public Aeropuerto(String codigoIata, String nombre, String ciudad, String pais, double superficie, int cantidadTerminales, int destinosNacionales, int destinosInternacionales){
        this.codigoIata = codigoIata;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.superficie = superficie;
        this.cantidadTerminales = cantidadTerminales;
        this.destinosNacionales = destinosNacionales;
        this.destinosInternacionales = destinosInternacionales;
        
    }

    public String getCodigoIata(){
        return codigoIata;
    }
    
    public void imprimirDatos(){
        System.out.println(this.codigoIata + " " + this.nombre + " " + this.ciudad + " " + this.pais + " " + this.superficie + " " +this.cantidadTerminales + " " + this.destinosNacionales +
        " " + this.destinosInternacionales);
    }
}
