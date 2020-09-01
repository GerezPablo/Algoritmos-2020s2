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
        if(s.length() == 0 || s.length() == 1) { return true; }
        else if (s.charAt(0) != s.charAt(0)+1) { return esSinRepetido(s.substring(1));}
        else {return false;}
    }





    public static void main(String [] args) {
        System.out.println("Resultado: " + sumatoria(15));
        System.out.println("Resultado: " + cantidadVocales("Banana"));
        System.out.println("Resultado: " + esCapicua("neuquen"));
        System.out.println("Falso: " + esSinRepetido("Banana"));
        System.out.println("Verdadero: " + esSinRepetido("piedra"));
    }
}
