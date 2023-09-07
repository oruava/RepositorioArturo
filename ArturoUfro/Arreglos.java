package org.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Arreglos {
    public static void main(String[] args) {
        listaDeNumeros(CantidadDeNumeros());
    }

    public static int CantidadDeNumeros() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int Cantidad = scan.nextInt();

        while (Cantidad < 4 || Cantidad % 2 != 0) {
            System.out.print("Cantidad minima de numeros es 4 y debe ser par, ingresela nuevamente: ");
            Cantidad = scan.nextInt();
        }
        return Cantidad;
    }
    public static List<Integer> listaDeNumeros(int n) {

        List<Integer> listaNumeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los numeros");
            int Numero = scan.nextInt();
            listaNumeros.add(Numero);
        }
        System.out.println("Tu lista de numeros es: ");
        System.out.print(listaNumeros);
        return listaNumeros;
    }



            }





