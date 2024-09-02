package org.example;

import java.util.Scanner;


public class Main {
    public static boolean esPalindromo(String cadena){
        cadena= cadena.replaceAll(" ", "").toLowerCase();
        String reverso = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(reverso);
    }
    public static void main(String[] args){
        System.out.println( "ingresa una palabra para ver si es un palindromo o no:");
        Scanner scanner = new Scanner(System.in);
        String palabrau= scanner.nextLine();

        if (esPalindromo(palabrau)){
            System.out.println(" es un palindromo");
        }else{
            System.out.println(" no es un palindromo");
        }
    }
}
