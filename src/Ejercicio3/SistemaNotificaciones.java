package Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CorreoElectronico email = new CorreoElectronico("Juan Perez", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "juan.perez@mail.com");
        MensajeTexto msj = new MensajeTexto("Jhon Doe", "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "2616123456");

        notificaciones.agregarCanales(email);
        notificaciones.agregarCanales(msj);

        System.out.println("---------    MENSAJES SIN PERSONALIZAR    ---------");
        notificaciones.mostrarCanales();
        System.out.println("---------------------------------------------------");

        notificaciones.personalizarMensajes("Nueva actualización");

        System.out.println("----------    MENSAJES PERSONALIZADOS    ----------");
        notificaciones.mostrarCanales();
        System.out.println("---------------------------------------------------");

        System.out.println("-----------    ENVIAR NOTIFICACIONES    -----------");
        notificaciones.enviarNotificaciones();

    }
}
