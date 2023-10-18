package PaqueteCliente;

public class FactoryFantasma implements FactoryElements {
    @Override
    public Fantasma CrearFantasma() {
        // Implementa la lógica para crear un fantasma
        return new Fantasma(); // Suponiendo que la clase Fantasma existe y es una subclase de Enemigo
    }

    @Override
    public Fruta CrearFruta() {
        return null;
    }

    @Override
    public Fantasma CrearEnemigo() {
        return null;
    }

    // Otros métodos de la clase FactoryFantasma si los hubiera
}

