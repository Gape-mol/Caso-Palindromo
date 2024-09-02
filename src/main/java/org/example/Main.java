package org.example;

public class Main {
    public static void main(String[] args) {
        if (esPalindromo("")){
            System.out.println("Es palindromo");
        }
        else{
            System.out.println("No es palindromo");
        }
    }
    public static boolean esPalindromo(String cadena){
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        System.out.println(resultado);
        System.out.println(cadena);
        return resultado.equals(cadena);
    }
}