package PaqueteCliente;

public class Fantasma {
    private String Nombre;
    private java.lang.Integer Velocidad;

    public Fantasma(String Nombre, java.lang.Integer Velocidad) {
        this.Nombre = Nombre;
        this.Velocidad = Velocidad;
    }

    public Fantasma() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public java.lang.Integer getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(java.lang.Integer Velocidad) {
        this.Velocidad = Velocidad;
    }
}

