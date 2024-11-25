package Ejercicio1;

public class VueloCharter extends Vuelos implements Promocionable {
    private int precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        this.precioTotal -= this.precioTotal * descuento / 100;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "\n" +
                "Tipo vuelo: Chárter" + "\n" +
                "Precio: $" + precioTotal;
    }
}
