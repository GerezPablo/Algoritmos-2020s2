public class EjerciciosRecursivos {

    //1
    public static void imprimir20ConsecutivosDe(int[] lista, int indice ){
        if(lista.length -1 == indice) { System.out.println(lista[indice]); }
        else {
            System.out.println(lista[indice]);
            imprimir20ConsecutivosDe(lista, indice + 1);
        }
    }
    //2
    public static int multiplicacion(int a, int b) {
    if(a == 0 || b == 0) { return 0;}
    else if(a == 1) { return b;}
    else if(b == 1) { return a;}
    else { return a + multiplicacion(a, b -1);}
    }

    //3
    public static boolean esPrimo(int n, int divisor) {
        if(n/2 < divisor){ return true; }
        else { return n%divisor == 0 ? false : esPrimo(n, divisor+1); }
    }

    //4
    public static int tailMulptiplicacion(int a, int b) {
        return multiplicacion(a,b) ;
    }

    //5
    public static int trazaDeUnaMatriz(int [][] matriz, int a, int b){
        return matriz.length == a ? 0 : matriz[a][b] + trazaDeUnaMatriz(matriz, a+1, b+1);
    }

    //6
    public static boolean esMatrizIdentidad(int [][] matriz){
        return esMatrizIdentidadAux(matriz, 0,0);
    }
    public static boolean esMatrizIdentidadAux(int [][] matriz, int a, int b){
        if(matriz.length - 1 == a && matriz[a][b] == 1) { return true; }
        else if(matriz[a][b] != 1){ return false; }
        else { return esMatrizIdentidadAux(matriz, a+1, b+1); }
    }
}
