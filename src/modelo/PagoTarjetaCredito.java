package modelo;

import java.util.Date;

public class PagoTarjetaCredito extends Pago {

    private int numeroTarjeta;
    private Date fechaVencimiento;
    private int cvv;


    public PagoTarjetaCredito(Double valor, int documento, int cuentaDestino, int numeroTarjeta,
                              Date fechaVencimiento, int cvv) {
        super(valor, documento, cuentaDestino);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }
}
