package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Anashei();


    }
    public static Persona crearPersona(String nombre) {
        Persona persona1 = new Persona(nombre);
        return persona1;
    }
    public static Mascota crearGato(String nombrePerro) {
        Mascota mascota = new Mascota("gato",nombrePerro);
        return mascota;
    }
    public static Mascota crearPerro(String nombreGato) {
        Mascota mascota = new Mascota("perro",nombreGato);
        return mascota;
    }
    public static Vehiculo crearVehiculo(String tipoDeVehiculo){
        Vehiculo vehiculo = new Vehiculo(tipoDeVehiculo);
        return vehiculo;
    }
    public static void Anashei (){
        Persona persona1 = crearPersona("Arturo");
        Mascota gato1= crearGato("Rengar");
        Mascota perro1 = crearPerro("Nasus");
        Vehiculo moto = crearVehiculo("Moto");
        Vehiculo auto = crearVehiculo("auto");
        Vehiculo bici = crearVehiculo("bici");

        persona1.setGato(gato1);
        persona1.setPerro(perro1);
        persona1.setTipoDeVehiculo(moto);
        gato1.setDueno(persona1);
        perro1.setDueno(persona1);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getGato().getNombre());


    }

}