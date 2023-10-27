package org.example;
import java.util.Scanner;


public class Login {
    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static Admin crearUsuarioAdmin(){
        Admin perfilAdmin = new Admin("admin","1234",true);
        return perfilAdmin;
    }

    public static boolean iniciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVIENIDO!!");
        System.out.println("A continuacion inicie sesion");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese su clave: ");
        String clave = sc.next();
        System.out.println(crearUsuarioAdmin().getUsuario());
        System.out.println(nombre);
        if (nombre.equals(crearUsuarioAdmin().getUsuario()) && clave.equals(crearUsuarioAdmin().getContrasena())){
            return true;
        }
        else{
            Usuario perfilComun = new Usuario(nombre,clave,false);
            return false;
        }


    }

}