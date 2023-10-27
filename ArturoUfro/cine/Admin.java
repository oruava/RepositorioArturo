package org.example;

public class Admin {
    private String usuario;
    private String contrasena;
    private boolean privilegios;

    public Admin(String usuario, String contrasena, boolean privilegios) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.privilegios = privilegios;
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
    public boolean isPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(boolean privilegios) {
        this.privilegios = privilegios;
    }

}
