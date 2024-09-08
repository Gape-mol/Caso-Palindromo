public class CasoPalindromos {
    public static boolean esPalindromo(String cadena){
        String resultado = "";
        String cadenaMinusculasSinEspacios = cadena.toLowerCase().replaceAll(" ", "");
        System.out.println(cadenaMinusculasSinEspacios);
        for (int letra = cadenaMinusculasSinEspacios.length()-1; letra >=0 ; letra--) {
            resultado += cadenaMinusculasSinEspacios.charAt(letra);
        }
        System.out.println(resultado);
        return resultado.equals(cadenaMinusculasSinEspacios);
    }
}
