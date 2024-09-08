package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        if (esPalindromo(palabra)) {
            System.out.println("La palabra "+palabra+" es palindromo");
        } else {
            System.out.println("La palabra "+palabra+" no es palindromo");
        }
    }
    public static boolean esPalindromo(String palabra) {
        return palabra.equals(new StringBuilder(palabra).reverse().toString());
    }
}