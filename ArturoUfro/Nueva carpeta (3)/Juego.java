package org.example;
import java.util.ArrayList;

public class Juego {
    public static void main(String[] args) {
        Calculadora.sumaNumeros(lanzarDado1(),lanzarDado2());
        }
    public static void reglasJuego(){
        lanzarDado1();
        lanzarDado2();
    }

    public static Dados crearDado(){
        ArrayList caras = new ArrayList();
        for (int i = 1; i <7 ; i++) {
                caras.add(i);
        }
        Dados dado = new Dados(caras,0);
        return dado;

    }

    public static int lanzarDado1(){
        int numero = (int)(Math.random()*6+1);
        Dados dado1 = crearDado();
        dado1.setCaraBocaArriba(numero);
        System.out.println("El valor del dado 1 es: "+ dado1.getCaraBocaArriba());
        return dado1.getCaraBocaArriba();
    }
    public static int lanzarDado2(){
        int numero = (int)(Math.random()*6+1);
        Dados dado2 = crearDado();
        dado2.setCaraBocaArriba(numero);
        System.out.println("El valor del dado 2 es: "+dado2.getCaraBocaArriba());
        return dado2.getCaraBocaArriba();
    }
    }
