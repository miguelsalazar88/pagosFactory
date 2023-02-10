package modelo;

import java.util.Scanner;

public class CreadorPagos implements IPagoFactory {

    @Override
    public Pago crearPago() {
        Pago pago;
        Double valor;
        int documento;
        int cuentaDestino;
        int tipo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el valor del Pago: $");
        valor = sc.nextDouble();
        System.out.println("Digite su Número de Documento: ");
        documento = sc.nextInt();
        System.out.println("Digite el número de Cuenta Destino: ");
        cuentaDestino = sc.nextInt();

        System.out.println("Cómo desea hacer el Pago?\n" +
                "1. Efectivo.\n" +
                "2. PSE. \n" +
                "3. Tajeta de Crédito.\n");

        tipo = sc.nextInt();

        if (tipo == 1){
            int codigoBarras = 123456789;
            pago = new PagoEfectivo(valor, documento, cuentaDestino, codigoBarras);
        }
        else if (tipo == 2) {
            String usuario;
            String contrasenia;
            System.out.println("Digite su nombre de Usuario: ");
            usuario = sc.next();
            System.out.println("Digite su Contraseña: ");
            contrasenia = sc.next();
            pago = new PagoPse(valor,documento,cuentaDestino,usuario, contrasenia);
        }
        else if (tipo == 3) {
            pago = new PagoTarjetaCredito();
        }
        else{
            pago = null;
        }
        return pago;
    }
}
