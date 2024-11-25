package Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void reaizarPago(double monto) {
        System.out.println("------------------------------------------");
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.printf("Titular: %s, Monto: %.2f\n", titular, monto);
        System.out.println("Pago realizado exitosamente");
    }

    @Override
    public boolean cancelarPago() {
        System.out.println("------------------------------------------");
        System.out.println("Intentando cancelar el pago realizado con Tarjeta de crédito");
        System.out.println("Pago cancelado con éxito");
        return true;
    }
}
