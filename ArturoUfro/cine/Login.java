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
    public static Usuario crearUsuarioComun(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su clave");
        String clave = sc.next();
        Usuario perfilComun = new Usuario(nombre,clave,false);
        return perfilComun;
    }

    public static boolean iniciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su clave");
        String clave = sc.next();
        if (nombre=="admin"&& clave=="1234"){
            return true;
        }
        else{
            return false;
        }


    }

}
