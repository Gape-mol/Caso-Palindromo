package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
    }
    public static boolean esPalindromo(String cadena){
        String resultado = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }
        imprimirPalindromo(cadena, resultado.equals(cadena));
        return resultado.equals(cadena);
    }
    public static void imprimirPalindromo(String cadena, boolean palindromo){
        if (palindromo){
            System.out.println(cadena + "Es palindromo");
        }
        else{
            System.out.println(cadena + "No es palindromo");
        }
    }

}