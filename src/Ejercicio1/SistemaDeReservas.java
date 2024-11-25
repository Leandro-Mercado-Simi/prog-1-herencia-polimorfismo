package Ejercicio1;

public class SistemaDeReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular regular = new VueloRegular(1205, "Mendoza", "Medellín", "18/12/2024", 100, 120);
        VueloCharter charter = new VueloCharter(18481, "Mendoza", "Barcelona", "18/12/2024", 600);

        reservas.agregarVuelo(regular);
        reservas.agregarVuelo(charter);

        System.out.println("----------- vuelos sin promoción -----------");
        reservas.mostrarVuelos();
        System.out.println("--------------------------------------------");

        reservas.aplicarPromociones(15);

        System.out.println("----------- vuelos en promoción -----------");
        reservas.mostrarVuelos();
        System.out.println("--------------------------------------------");

        System.out.println("Precio total de todas las reservas: " + reservas.calcularPrecioTotal());


    }
}
