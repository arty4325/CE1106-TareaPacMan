package PaqueteCliente;

public class Cliente {
    // Atributos
    private java.lang.Integer Id;
    private java.lang.Integer TipoCliente;

    // Constructor
    public Cliente(java.lang.Integer Id, java.lang.Integer TipoCliente) {
        this.Id = Id;
        this.TipoCliente = TipoCliente;
    }

    // Métodos para obtener y establecer el Id
    public java.lang.Integer getId() {
        return Id;
    }

    public void setId(java.lang.Integer Id) {
        this.Id = Id;
    }

    // Métodos para obtener y establecer el TipoCliente
    public java.lang.Integer getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(java.lang.Integer TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    // Otros métodos (UpdateViewer y UpdateJugador) que mencionaste pueden ser agregados aquí si es necesario.
    public void UpdateViewer() {
        // Implementa la lógica para actualizar el viewer aquí
    }

    public void UpdateJugador() {
        // Implementa la lógica para actualizar el jugador aquí
    }

    public void RecibirMensaje(String mensaje) {
    }
}

