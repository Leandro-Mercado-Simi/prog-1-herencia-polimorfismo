package Ejercicio3;

public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electrónico a: " + direccionCorreo + "\n" +
                " Para el usuario: " + usuario + "\n" +
                " con el mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        setMensaje(nuevoMensaje + " (Enviado por correo electrónico)");
    }


    @Override
    public String toString() {
        System.out.println("---------------------------------------------------");
        return "Correo electronico" + "\n" +
                "Correo: " + direccionCorreo + "\n" +
                "Mensaje: " + mensaje;
    }

}
