package modelo;

public abstract class Pago {

    protected Double valor;
    protected int documento;
    protected int cuentaOrigen;
    protected int cuentaDestino;
    protected boolean aprobado;

    public Pago(Double valor, int documento, int cuentaOrigen, int cuentaDestino) {
        this.valor = valor;
        this.documento = documento;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.aprobado = false;
    }
}
