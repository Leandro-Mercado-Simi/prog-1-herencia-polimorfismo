package Ejercicio2;

import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodos;

    public Pagos() {
        this.metodos = new ArrayList<>();
    }

    public ArrayList<MetodoPago> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<MetodoPago> metodos) {
        this.metodos = metodos;
    }

    public void agregarMetodo(MetodoPago metodo) {
        metodos.add(metodo);
        System.out.println("Método de pago agregado: " + metodo.getClass().getSimpleName());
    }

    public void realizarPagos(double monto) {
        for (MetodoPago metodo : metodos) {
            metodo.reaizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodos) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            } else {
                System.out.println("El método" + metodo.getClass().getSimpleName() + " no puede ser cancelado, ya fue acreditado");
            }
        }
    }

    public void mostrarInfoPagos() {
        System.out.println("------------------------------------------");
        System.out.println("Pagos reaizados: ");
        for (MetodoPago metodo : metodos) {
            System.out.println("- " + metodo.getClass().getSimpleName() + ": " + metodo.getTitular());
        }
        System.out.println("------------------------------------------");
    }
}
