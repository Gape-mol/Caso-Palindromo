public class CasoPalindromos {
    public static boolean esPalindromo(String cadena){
        String resultado = "";
        String cadenaMinusculasSinEspacios = cadena.toLowerCase().replaceAll(" ", "");
        for (int letra = cadenaMinusculasSinEspacios.length()-1; letra >=0 ; letra--) {
            resultado += cadenaMinusculasSinEspacios.charAt(letra);
        }

        return resultado.equals(cadenaMinusculasSinEspacios);
    }
}
