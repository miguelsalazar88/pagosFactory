package modelo;

public class PagoEfectivo extends Pago{

    private int codigoBarras;
    public PagoEfectivo(Double valor, int documento, int cuentaDestino, int codigoBarras) {
        super(valor, documento, cuentaDestino);
        this.codigoBarras = codigoBarras;
    }
}
