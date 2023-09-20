package org.example;
import java.util.Scanner;

public class casoAdyacentes{
    public static void main(String[] args) {

        System.out.println(productoAdyacentes(entradaArray(entradaLargoArray())));

    }
    public static int entradaLargoArray() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el largo del array: ");
        return entrada.nextInt();
    }
    public static int[] entradaArray(int largo) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[largo];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor de la posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }
        return arreglo;
    }

    public static double productoAdyacentes(int[] lista){
        int resultadoMultiplicacion;
        int resultadoAComparar=lista[0]*lista[1];
        for (int i = 0; i <lista.length-1; i++) {
            resultadoMultiplicacion=lista[i]*lista[i+1];
            if (resultadoMultiplicacion>resultadoAComparar){
                resultadoAComparar=resultadoMultiplicacion;
            }
        }
        return resultadoAComparar;
    }










}