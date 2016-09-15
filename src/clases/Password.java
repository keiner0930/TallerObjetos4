/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sony
 */
public class Password {

    private int longitud;
    private String contrasena;

    public Password(int longitud, String contrasena) {
        this.longitud = longitud;
        this.contrasena = contrasena;

    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String seguridad() {
        String seguridad;

        if (this.longitud >= 6) {
            seguridad = "Su contraseña es fuerte";
        } else {
            seguridad = "Su contraseña es debil";
        }
        return seguridad;
    }

    public Password cambiar() {
        int lon;
        String clave;
        Password nueva;

        lon = this.longitud;
        clave = this.contrasena;

        nueva = new Password(lon, clave);
        return nueva;
    }

    public Password ver() {
        Password pass;
        String clave;
        int longitu;
        clave = this.contrasena;
        longitu = this.longitud;
        pass = new Password(longitu, clave);
        return pass;
    }
}
