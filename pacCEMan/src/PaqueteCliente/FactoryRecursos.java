package PaqueteCliente;

public class FactoryRecursos implements FactoryElements {
    @Override
    public Fantasma CrearFantasma() {
        return null;
    }

    @Override
    public Fruta CrearFruta() {
        // Implementa la lógica para crear una fruta personalizada
        return new Fruta();
    }

    @Override
    public Fantasma CrearEnemigo() {
        // Implementa la lógica para crear un enemigo personalizado
        return new Fantasma();
    }

    // Método para crear una Pastilla
    public Pastilla CrearPastilla() {
        // Implementa la lógica para crear una Pastilla personalizada
        return new Pastilla();
    }
}

