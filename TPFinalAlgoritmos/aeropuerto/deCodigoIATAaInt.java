package aeropuerto;

public class deCodigoIATAaInt {
    
    public static int conversorDeStringAInt(String codigo){
        char[] caracteres = codigo.toCharArray();

        String codigoEnString = String.valueOf((int) caracteres[0]) + String.valueOf((int) caracteres[1]) + String.valueOf((int) caracteres[2]); 
        return Integer.parseInt(codigoEnString);
    }
}
