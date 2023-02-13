package modelo;

public class Main {
    public static void main(String[] args) {
        CreadorPagos factory = new CreadorPagos();
        Pago pago = factory.crearPago();
        if (pago == null){
            System.out.println("Error en la creación de Pago.");
        }
        else{
            System.out.println("PAgo creado exitosamente.");
        }
    }
}
