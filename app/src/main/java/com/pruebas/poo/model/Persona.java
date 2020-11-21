package com.pruebas.poo.model;

public class Persona {

    private String Nombre;
    private String Usuario;
    private String Password;

    public Persona(String id, String usuario, String password) {
        this.Nombre = id;
        Usuario = usuario;
        Password = password;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + Nombre + '\'' +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
