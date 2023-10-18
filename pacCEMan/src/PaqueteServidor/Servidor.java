package PaqueteServidor;

import PaqueteCliente.Cliente;

public class Servidor {
    private java.lang.Integer ClienteId; // Atributo para almacenar el ID del cliente

    public Servidor() {
        // Constructor
        ClienteId = 0; // Inicializamos el ID del cliente en 0 o según tus necesidades
    }

    public void UpdateClient(java.lang.Integer ClienteId) {
        // Implementa la lógica para actualizar un cliente específico por su ID
    }

    public void AnadirFantasmas(Cliente cliente, java.lang.Integer Cantidad) {
        // Implementa la lógica para añadir una cantidad de fantasmas al cliente
    }

    public void AnadirPastilla(Cliente cliente, java.lang.Integer PosicionX, java.lang.Integer PosicionY) {
        // Implementa la lógica para añadir una pastilla a un cliente en la posición especificada
    }

    public void CambiarVelocidadFantasma(Cliente cliente, java.lang.Integer Velocidad) {
        // Implementa la lógica para cambiar la velocidad de los fantasmas de un cliente
    }

    public void SetClienteId(java.lang.Integer ClienteId) {
        // Establece el ID del cliente
        this.ClienteId = ClienteId;
    }
}
