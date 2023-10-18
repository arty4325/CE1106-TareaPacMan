package PaqueteCliente;

public class Pastilla implements Resource, Pill {
    @Override
    public java.lang.Integer ObtenerValor() {
        // Implementa la lógica para obtener el valor de la pastilla
        return 0; // Cambia esto según tus necesidades
    }

    @Override
    public void SetValor(java.lang.Integer Valor) {
        // Implementa la lógica para establecer el valor de la pastilla
        // Puedes almacenar el valor en algún atributo de la clase Pastilla
    }



    // Método específico de la clase Pastilla
    public void TriggerEvento() {
        // Implementa la lógica para el evento de la pastilla
    }
}

