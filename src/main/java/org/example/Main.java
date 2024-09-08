package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String entrada = scanner.nextLine();

        if (esPalindromo(entrada)) {
            System.out.println("'" +entrada + "' es un palíndromo.");
        } else {
            System.out.println("'" +entrada + "' no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaNueva = cadena.replaceAll("[^a-z]", "");
        String resultado = new StringBuilder(cadenaNueva).reverse().toString();
        return cadenaNueva.equals(resultado);
    }
}

