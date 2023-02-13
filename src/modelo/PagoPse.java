package modelo;

public class PagoPse extends Pago{
    private String usuario;
    private String contrasenia;

    public PagoPse(Double valor, int documento, int cuentaDestino, String usuario,
                   String contrasenia) {
        super(valor, documento, cuentaDestino);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
}
