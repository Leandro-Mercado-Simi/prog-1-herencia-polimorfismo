package Ejercicio1;

public class VueloRegular extends Vuelos implements Promocionable {
    private int numeroAsientos;
    private double precioAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioAsiento = precioAsiento;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getPrecioAsiento() {
        return precioAsiento;
    }

    public void setPrecioAsiento(double precioAsiento) {
        this.precioAsiento = precioAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioAsiento;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        this.precioAsiento -= this.precioAsiento * descuento / 100;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "\n" +
                "Tipo vuelo: Regular" + "\n" +
                "Precio por asiento: $" + precioAsiento + "\n" +
                "Cantidad asientos: " + numeroAsientos;
    }
}
