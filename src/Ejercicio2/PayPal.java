package Ejercicio2;

public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void reaizarPago(double monto) {
        System.out.println("------------------------------------------");
        System.out.println("Procesando pago a través de PayPal...");
        System.out.printf("Titular: %s, Monto: %.2f, Correo: %s\n", titular, monto, correoElectronico);
        System.out.println("Pago realizado exitosamente");
    }

    @Override
    public boolean cancelarPago() {
        System.out.println("------------------------------------------");
        System.out.println("Cancelando pago realizado a través de Paypal...");
        System.out.println("Pago cancelado con éxito");
        return true;
    }
}
