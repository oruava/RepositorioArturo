package org.example;

import java.util.ArrayList;

public class Dados {

    private ArrayList caras;

    private int caraBocaArriba;

    public Dados(ArrayList caras, int caraBocaArriba){
        this.caras = caras;
        this.caraBocaArriba= caraBocaArriba;
    }

    public ArrayList getCaras() {
        return caras;
    }

    public void setCaras(ArrayList caras) {
        this.caras = caras;
    }
    public int getCaraBocaArriba() {
        return caraBocaArriba;
    }

    public void setCaraBocaArriba(int caraBocaArriba) {
        this.caraBocaArriba = caraBocaArriba;
    }




}
