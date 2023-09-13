package org.example.out.production.ArturoUfro;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabra a verificar: ");
        String palabra = sc.nextLine();
        System.out.println(esPalindromo(validarPalabra(palabra)));
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("\s", "").toLowerCase();
        return cadena.contentEquals(new StringBuilder(cadena).reverse());
    }
    public static String validarPalabra(String palabra){
        Scanner sc = new Scanner(System.in);
        while ( palabra == "" || palabra.length()<2) {
            System.out.println("El palindromo no puede ser vacio, y el palindromo tiene que tener mas de 1 caracter, ingreselo nuevamente: ");
            palabra = sc.nextLine();
        }
        return palabra;
    }

}