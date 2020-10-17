package aeropuerto;

public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario(){
        this.raiz = null;
    }

    public void agregarNodo(Nodo nodo){
        if(this.raiz == null){
            this.raiz = nodo;
        }
        else{
            agregarNodo(nodo,this.raiz);
        }
    }

    public void agregarNodo(Nodo nodo, Nodo raiz){

        if(nodo.valor() < raiz.valor()){
            
            if(raiz.izquierdo() == null){
                raiz.izquierdo(nodo);
            }
            else{
                agregarNodo(nodo, raiz.izquierdo());
            }
            
        }
        else{
            if(raiz.derecho() == null){
                raiz.derecho(nodo);
            }
            else{
                agregarNodo(nodo, raiz.derecho());
            }
        }

    }

    public void eliminarNodo(String codigo){
        int valor = deCodigoIATAaInt.conversorDeStringAInt(codigo);
        eliminarNodo(valor, this.raiz);
    }

    public void eliminarNodo(int valor, Nodo nodo){
        if(valor < nodo.valor() && nodo.izquierdo() != null){
            if(nodo.izquierdo().valor() == valor) {
				reemplazarPredecesor(nodo, "izquierda");
			}
			else {
                eliminarNodo(valor, nodo.izquierdo());
            }
		}
		else {
			if(nodo.derecho().valor() == valor) {
				reemplazarPredecesor(nodo,"derecha");
			}
			else {
                eliminarNodo(valor, nodo.derecho());
            }
		}
    }

    public void reemplazarPredecesor(Nodo nodo, String lado){
        if(lado == "izquierda") {
			if(nodo.izquierdo().izquierdo() == null && nodo.izquierdo().derecho() == null) {
				nodo.izquierdo(null);
			}
			else if(nodo.izquierdo().izquierdo() !=null) {
				nodo.izquierdo(nodo.izquierdo().izquierdo());
			}
			else if (nodo.izquierdo().derecho() !=null) {
				nodo.izquierdo(nodo.izquierdo().derecho());
			}
			else {
				Nodo pred = predecesor (nodo.izquierdo());
				eliminarNodo (pred.valor(), nodo.izquierdo());
				pred.izquierdo(nodo.izquierdo().izquierdo());
				pred.derecho(nodo.izquierdo().derecho());
				nodo.izquierdo(pred);
			}
		}
		else if (lado == "derecha") {
			if(nodo.derecho().izquierdo() == null && nodo.derecho().derecho() == null) {
				nodo.derecho(null);
			}
			else if(nodo.derecho().izquierdo() != null) {
				nodo.derecho(nodo.derecho().izquierdo());
			}
			else if (nodo.derecho().derecho() != null) {
				nodo.derecho(nodo.derecho().derecho());
			}
			else {
				Nodo pred = predecesor (nodo.derecho());
				eliminarNodo (pred.valor(), nodo.derecho());
				pred.izquierdo(nodo.izquierdo().izquierdo());
				pred.izquierdo(nodo.derecho().derecho());
				nodo.izquierdo(pred);
			}
		}
		else {System.out.println("Wrong nodo");}
    }
    public int predecesor () {
        return predecesor(this.raiz).valor();
    }
    public Nodo predecesor (Nodo nodo) {
        return max(nodo.izquierdo());
    }
    public int max () {
        return max(this.raiz).valor();
    }

    public Nodo max (Nodo nodo) {
        if(nodo.izquierdo() == null) {
            return nodo;
        } else {
            return max(nodo.izquierdo());
        }
    }





   
    public void inOrden(){
        if(raiz.esHoja()){
            this.raiz.getAeropuerto().imprimirDatos();
        }
        else{
            if(this.raiz.izquierdo() != null){
                ArbolBinario arbolitoIzq = new ArbolBinario();
                arbolitoIzq.raiz = this.raiz.izquierdo();
                arbolitoIzq.inOrden();
            }

            this.raiz.getAeropuerto().imprimirDatos();

            if(this.raiz.derecho() != null){
                ArbolBinario arbolitoDer = new ArbolBinario();
                arbolitoDer.raiz = this.raiz.derecho();
                arbolitoDer.inOrden();
            }
        }
    }

}


