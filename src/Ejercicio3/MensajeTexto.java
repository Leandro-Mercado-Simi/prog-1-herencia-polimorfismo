package Ejercicio3;

public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto a: " + numeroTelefono + "\n" +
                " Para el usuario: " + usuario + "\n" +
                " con el mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        setMensaje(nuevoMensaje + " (Enviado por mensaje de texto)");
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------------------------");
        return "Mensaje de Texto: " + "\n" +
                "Número: " + numeroTelefono + "\n" +
                "Mensaje: " + mensaje;
    }

}
