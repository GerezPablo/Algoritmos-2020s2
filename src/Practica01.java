public class Practica01 {
    public static int sumatoria(int n) {
        return n <= 1 ? n: n + sumatoria(n-1);
    }

    public static int cantidadVocales(String s) {
        if(s.isEmpty()) {return 0;}
        else if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' ) {
            return 1 + cantidadVocales(s.substring(1));
        }
        else { return cantidadVocales(s.substring(1)); }
    }

    public static boolean esCapicua(String s) {
        if(s.length() == 0 || s.length() == 1) { return true; }
        else if (s.charAt(0) == s.charAt(s.length()-1)) { return esCapicua(s.substring(1, s.length()-1)); }
        else { return false; }
    }

    public static boolean esSinRepetido(String s) {
        if(s.length() <= 1) { return true; }
        else if ( s.indexOf(s.charAt(0), 1) >= 0) { return false;}
        else { return esSinRepetido(s.substring(1)); }
    }

    public static int fibrec(int n) {
        return n <= 1 ? n : fibrec(n - 1) + fibrec(n - 2);
    }
    public static int fibiter(int n) {
        int siguiente = 1, actual = 0, aux = 0;
        for (long i = 1; i <= n; i++) {
            aux = actual;
            actual = siguiente;
            siguiente = siguiente + aux;
        }
        return actual;
    /*
    a) En la recursiva hasta el 47 y en la iterativa probé hasta 999999999 que es el largo maximo para un int
        y sigue dando una respuesta rápida.
    b)  -1323752223
     */
    }

    public int mcd(int a, int b) {
        return  b == 0 ? a: mcd(b, (a % b));
    }


    public static void main(String [] args) {

        System.out.println("Resultado: " + sumatoria(15));

        System.out.println("Resultado: " + cantidadVocales("Banana"));

        System.out.println("Resultado: " + esCapicua("neuquen"));

        System.out.println("Falso: " + esSinRepetido("anana"));
        System.out.println("Verdadero: " + esSinRepetido("aeiou"));

        System.out.println("Fibonacci Recursivo: " + fibrec(46));
        System.out.println("Fibonacci Iterativo: " + fibiter(46));

    }
}
