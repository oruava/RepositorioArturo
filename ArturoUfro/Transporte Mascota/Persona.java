package org.example;

public class Persona {
    private String nombre;
    private Mascota perro;

    private Mascota gato;

    private Vehiculo tipoDeVehiculo;


    public Persona(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Mascota getPerro() {
        return perro;
    }

    public void setPerro(Mascota perro) {
        this.perro = perro;
    }
    public Mascota getGato() {
        return gato;
    }

    public void setGato(Mascota gato) {
        this.gato = gato;
    }
    public Vehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(Vehiculo tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
}