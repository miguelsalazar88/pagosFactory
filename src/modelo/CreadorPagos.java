package modelo;
import java.util.Date;
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
            int numeroTarjeta;
            int diaV;
            int mesV;
            int anioV;
            int cvv;
            System.out.println("Digite su numero de tarjeta: ");
            numeroTarjeta = sc.nextInt();
            System.out.println("Digite el dia de vencimiento: ");
            diaV = sc.nextInt();
            System.out.println("Digite el mes de vencimiento: ");
            mesV = sc.nextInt();
            System.out.println("Digite el año de vencimiento: ");
            anioV = sc.nextInt();
            System.out.println("Digite el cvv de la tarjeta: ");
            cvv = sc.nextInt();
            Date fechaVencimiento = new Date(anioV, mesV, diaV);
            pago = new PagoTarjetaCredito(valor, documento, cuentaDestino, numeroTarjeta, fechaVencimiento, cvv);
        }
        else{
            pago = null;
        }
        return pago;
    }


    private Pago darPago(int tipo){
        Pago[] p={new PagoPse(null)};

        return p[tipo];
    }
}
