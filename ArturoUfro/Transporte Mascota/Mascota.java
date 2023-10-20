package org.example;

public class Mascota {

    private String tipoDeAnimal;

    private String nombre;

    private Persona dueno;

    public Mascota(String tipoDeAnimal, String nombre){
        this.tipoDeAnimal = tipoDeAnimal;
        this.nombre = nombre;

    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }
}
