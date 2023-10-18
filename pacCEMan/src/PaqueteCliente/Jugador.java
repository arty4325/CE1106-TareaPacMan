package PaqueteCliente;

public class Jugador {
    // Atributos
    private java.lang.Integer Identificador;
    private java.lang.Integer Posicion;
    private String Direccion;

    // Constructor
    public Jugador(java.lang.Integer Identificador, java.lang.Integer Posicion, String Direccion) {
        this.Identificador = Identificador;
        this.Posicion = Posicion;
        this.Direccion = Direccion;
    }

    // Método para comer un punto
    public void ComerPunto() {
        // Implementa la lógica para comer un punto aquí
        System.out.println("El jugador " + Identificador + " ha comido un punto.");
    }

    // Método para comer un fantasma
    public void ComerFantasma() {
        // Implementa la lógica para comer un fantasma aquí
        System.out.println("El jugador " + Identificador + " ha comido un fantasma.");
    }

    // Método para obtener el identificador
    public java.lang.Integer ObtenerIdentificador() {
        return Identificador;
    }

    // Métodos para moverse en diferentes direcciones
    public void MoverArriba() {
        // Implementa la lógica para mover hacia arriba aquí
        Direccion = "Arriba";
    }

    public void MoverAbajo() {
        // Implementa la lógica para mover hacia abajo aquí
        Direccion = "Abajo";
    }

    public void MoverIzquierda() {
        // Implementa la lógica para mover hacia la izquierda aquí
        Direccion = "Izquierda";
    }

    public void MoverDerecha() {
        // Implementa la lógica para mover hacia la derecha aquí
        Direccion = "Derecha";
    }

    public String getId() {
        return null;
    }

    // Puedes agregar otros métodos según tus necesidades.
}

