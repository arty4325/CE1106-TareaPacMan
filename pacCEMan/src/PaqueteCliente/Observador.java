package PaqueteCliente;

public class Observador {
    // Atributo para almacenar el Jugador observado
    private Cliente JugadorObservado;

    // Constructor
    public Observador(Cliente JugadorObservado) {
        this.JugadorObservado = JugadorObservado;
    }

    // Método para observar una partida
    public void ObservarPartida(Jugador jugador) {
        // Implementa la lógica para observar la partida del jugador aquí
        System.out.println("Observando la partida del jugador: " + jugador.getId());
    }

    // Método para mostrar las acciones del observador
    public void MostrarAcciones() {
        // Implementa la lógica para mostrar las acciones del observador aquí
        System.out.println("Acciones del observador para el cliente con ID: " + JugadorObservado.getId());
    }

    // Puedes agregar otros métodos según tus necesidades.
}

