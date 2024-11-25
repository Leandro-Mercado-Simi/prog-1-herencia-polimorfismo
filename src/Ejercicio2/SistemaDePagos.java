package Ejercicio2;

public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        MetodoPago tarjetaDeCredito = new TarjetaCredito("Juan Perez", 1205, "15/12/2024", 123456789);
        MetodoPago paypal = new PayPal("John doe", 12345, "john.doe@mail.com");

        pagos.agregarMetodo(tarjetaDeCredito);
        pagos.agregarMetodo(paypal);

        System.out.println("---------    Realizando pagos    ---------");
        pagos.realizarPagos(350.75);
        System.out.println("------------------------------------------");

        System.out.println("---------    Cancelando pagos    ---------");
        pagos.cancelarPagos();
        System.out.println("------------------------------------------");

        System.out.println("---------    Pagos Registrados   ---------");
        pagos.mostrarInfoPagos();
    }
}
