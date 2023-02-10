package modelo;

public abstract class Pago {

    protected Double valor;
    protected int documento;
    protected int cuentaDestino;
    protected boolean aprobado;

    public Pago(Double valor, int documento, int cuentaDestino) {
        this.valor = valor;
        this.documento = documento;
        this.cuentaDestino = cuentaDestino;
        this.aprobado = false;
    }
}
