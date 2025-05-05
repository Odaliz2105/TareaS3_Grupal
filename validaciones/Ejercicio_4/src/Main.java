public class Main {
    public static void main(String[] args) {
        // Crear objeto Usuario
        Usuario usuario = new Usuario("Español", true);
        // Validar idioma
        if (usuario.validarIdioma()) {
            System.out.println("Idioma válido.");
        } else {
            System.out.println("Idioma no válido.");
        }

        // Validar notificaciones
        if (usuario.validarNotificaciones()) {
            System.out.println("Estado de notificaciones correcto.");
        } else {
            System.out.println("Estado de notificaciones incorrecto.");
        }
    }
}
