package PaqueteCliente;

public class Fruta implements Resource, Fruit {
    private java.lang.Integer Valor;
    private java.lang.Integer Tipo;

    public Fruta(java.lang.Integer Valor, java.lang.Integer Tipo) {
        this.Valor = Valor;
        this.Tipo = Tipo;
    }

    public Fruta() {

    }

    public java.lang.Integer getValor() {
        return Valor;
    }

    public void setValor(java.lang.Integer Valor) {
        this.Valor = Valor;
    }

    public java.lang.Integer getTipo() {
        return Tipo;
    }

    public void setTipo(java.lang.Integer Tipo) {
        this.Tipo = Tipo;
    }

    // Implementación de métodos del interfaz Resource
    @Override
    public java.lang.Integer ObtenerValor() {
        return Valor;
    }

    @Override
    public void SetValor(Integer Valor) {

    }

    @Override
    public void SetValor(int Valor) {

    }

}

