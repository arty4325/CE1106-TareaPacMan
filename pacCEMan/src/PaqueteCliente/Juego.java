package PaqueteCliente;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    // Atributos
    private List<Cliente> Jugadores;
    private List<Observador> Observadores;
    private List<Fruta> Frutas;
    private List<Fantasma> Fantasmas;
    private java.lang.Integer Puntuacion;
    private java.lang.Integer Nivel;
    private String Mensaje;
    private java.lang.Integer VelocidadFantasmas;
    private java.lang.Integer PuntosPorFruta;

    // Constructor
    public Juego() {
        Jugadores = new ArrayList<>();
        Observadores = new ArrayList<>();
        Frutas = new ArrayList<>();
        Fantasmas = new ArrayList<>();
        Puntuacion = 0;
        Nivel = 1;
        Mensaje = "";
        VelocidadFantasmas = 1;
        PuntosPorFruta = 10;
    }

    // Métodos

    public void IniciarNivel(java.lang.Integer NivelActual, java.lang.Integer Puntuacion, java.lang.Integer VelocidadFantasmas, java.lang.Integer PuntosPorFruta) {
        this.Nivel = NivelActual;
        this.Puntuacion = Puntuacion;
        this.VelocidadFantasmas = VelocidadFantasmas;
        this.PuntosPorFruta = PuntosPorFruta;
        // Lógica para iniciar el nivel
    }

    public void CrearJugador(Cliente jugador) {
        Jugadores.add(jugador);
        // Lógica para crear un jugador
    }

    public void CrearObservador(Observador observador) {
        Observadores.add(observador);
        // Lógica para crear un observador
    }

    public void AsignarFruta(Fruta fruta) {
        Frutas.add(fruta);
        // Lógica para asignar una fruta
    }

    public void AsignarFantasma(Fantasma fantasma) {
        Fantasmas.add(fantasma);
        // Lógica para asignar un fantasma
    }

    public void IncrementarVelocidadFantasmas() {
        VelocidadFantasmas++;
        // Lógica para incrementar la velocidad de los fantasmas
    }

    public void ControlarNiveles() {
        // Lógica para controlar el avance de niveles
    }

    public void ControlarPuntuacion() {
        // Lógica para controlar la puntuación del juego
    }

    public void EnviarMensaje(Cliente cliente, String mensaje) {
        cliente.RecibirMensaje(mensaje);
        // Lógica para enviar un mensaje a un cliente
    }

    public void VerificarAvanceNivel() {
        // Lógica para verificar si se avanza de nivel basado en la puntuación
    }

    public void ModificarVelocidadFantasmas(java.lang.Integer NuevaVelocidad) {
        VelocidadFantasmas = NuevaVelocidad;
        // Lógica para modificar la velocidad de los fantasmas
    }

    public void ActualizarPuntosPorFruta(java.lang.Integer NuevosPuntos) {
        PuntosPorFruta = NuevosPuntos;
        // Lógica para actualizar la puntuación obtenida por comer frutas
    }

    public void ReiniciarJuego() {
        Jugadores.clear();
        Observadores.clear();
        Frutas.clear();
        Fantasmas.clear();
        Puntuacion = 0;
        Nivel = 1;
        Mensaje = "";
        VelocidadFantasmas = 1;
        PuntosPorFruta = 10;
        // Lógica para reiniciar el juego
    }
}

