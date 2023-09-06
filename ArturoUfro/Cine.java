package org.example;

public class Cine {
    public static void main(String[] args) {


        }
    public static int[][]crearMatriz(){
        int[][]Butacas = new int [5][5];
        return Butacas;

    }
    public static int[][]llenarMatriz(int[][]MatrizCreada){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <5; j++) {
                MatrizCreada[i][j]=i+j;
            }
        }
    return MatrizCreada;
    }
    }

