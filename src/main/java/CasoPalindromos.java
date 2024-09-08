import java.util.Scanner;


public class CasoPalindromos {
    public static boolean esPalindromo(String cadena){
        String resultado = "";
        for (int letra = cadena.length()-1; letra >=0 ; letra--) {
            resultado += cadena.charAt(letra);
        }
        return resultado.equals(cadena);
    }
}
