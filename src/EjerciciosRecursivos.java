public class EjerciciosRecursivos {
    public static int imprimir20ConsecutivosDe(int n) {
        return n+20; //TODO
    }

    public static int multiplicacion(int a, int b) {
    if(a == 0 || b == 0) { return 0;}
    else if(a == 1) { return b;}
    else if(b == 1) { return a;}
    else { return a + multiplicacion(a, b -1);}
}
    public static boolean esPrimo(int n, int divisor) {
        if(n/2 < divisor){ return true; }
        else { return n%divisor == 0 ? false : esPrimo(n, divisor+1); }
    }

    public static void main(String[] args) {
        System.out.println(imprimir20ConsecutivosDe(5));
    }

}
