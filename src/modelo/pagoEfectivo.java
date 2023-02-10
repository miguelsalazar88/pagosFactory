package modelo;

public class pagoEfectivo extends Pago{

    private int codigoBarras;
    public pagoEfectivo(Double valor, int documento, int cuentaOrigen, int cuentaDestino, int codigoBarras) {
        super(valor, documento, cuentaOrigen, cuentaDestino);
        this.codigoBarras = codigoBarras;
    }
}
