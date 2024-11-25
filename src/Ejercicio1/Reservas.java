package Ejercicio1;

import java.util.ArrayList;

public class Reservas {
    private ArrayList<Vuelos> vuelos;

    public Reservas() {
        this.vuelos = new ArrayList<>();
    }

    public ArrayList<Vuelos> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelos> vuelos) {
        this.vuelos = vuelos;
    }

    public void agregarVuelo(Vuelos vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        return vuelos.stream().mapToDouble(vuelo -> vuelo.calcularPrecio()).sum();
    }

    public void aplicarPromociones(double descuento) {
        for (Vuelos vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(descuento);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelos vuelo : vuelos) {
            System.out.println("........................");
            System.out.println(vuelo.mostrarInfo());
            System.out.println("........................");
        }
    }

}
