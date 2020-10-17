package aeropuerto;

public class Nodo {
    private Nodo derecho;
    private Nodo izquierdo;
    private int valor;
    private Aeropuerto aeropuerto;

    public Nodo(Aeropuerto aeropuerto){

        this.valor = deCodigoIATAaInt.conversorDeStringAInt(aeropuerto.getCodigoIata());
        this.aeropuerto = aeropuerto;
    }

    public boolean esHoja(){
        return derecho == null && izquierdo == null;
    }

    public int valor(){ return valor; }

    public Nodo derecho(){ return derecho; }

    public Nodo izquierdo(){ return izquierdo; }

    public void izquierdo(Nodo nodo){ this.izquierdo = nodo; }

    public void derecho(Nodo nodo){ this.derecho = nodo; }

    public Aeropuerto getAeropuerto(){ return aeropuerto; }

    
}
