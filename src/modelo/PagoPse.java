package modelo;

public class PagoPse extends Pago{

    private int codigoBanco;
    private String usuario;
    private String contrasenia;

    public PagoPse(Double valor, int documento, int cuentaOrigen, int cuentaDestino, int codigoBanco, String usuario,
                   String contrasenia) {
        super(valor, documento, cuentaOrigen, cuentaDestino);
        this.codigoBanco = codigoBanco;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
}
