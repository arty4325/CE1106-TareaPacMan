package PaqueteCliente;

public class PacMan {
    // Atributos
    private java.lang.Integer Posicion;
    private Cliente Jugador;

    // Constructor
    public PacMan(java.lang.Integer Posicion, Cliente Jugador) {
        this.Posicion = Posicion;
        this.Jugador = Jugador;
    }

    // Método para colisionar con un fantasma
    public void ColisionarConFantasma() {
        // Implementa la lógica para manejar la colisión con un fantasma
    }

    // Método para obtener la posición de PacMan
    public java.lang.Integer ObtenerPosicion() {
        return Posicion;
    }

    // Puedes agregar otros métodos según tus necesidades.
}

