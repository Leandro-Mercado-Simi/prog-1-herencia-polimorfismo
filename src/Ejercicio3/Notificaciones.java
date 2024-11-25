package Ejercicio3;

import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanales(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        System.out.println("---------------------------------------------------");
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
        System.out.println("---------------------------------------------------");
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            System.out.println(canal);
        }
    }
}
