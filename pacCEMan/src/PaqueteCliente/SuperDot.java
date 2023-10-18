package PaqueteCliente;

public class SuperDot implements Resource, Super_Dot {
    private java.lang.Integer Valor;

    public SuperDot(java.lang.Integer Valor) {
        this.Valor = Valor;
    }

    public java.lang.Integer getValor() {
        return Valor;
    }

    public void setValor(java.lang.Integer Valor) {
        this.Valor = Valor;
    }

    // Implementación de métodos del interfaz Resource
    @Override
    public java.lang.Integer ObtenerValor() {
        return Valor;
    }

    @Override
    public void SetValor(java.lang.Integer Valor) {
        this.Valor = Valor;
    }
}

