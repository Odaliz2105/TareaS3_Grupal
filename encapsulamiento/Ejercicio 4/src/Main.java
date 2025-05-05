public class Main {
    public static void main(String[] args) {
        // Crear objeto
        Usuario usuario = new Usuario("Inglés", true);

        // Validar idioma inicial
        if (usuario.validarIdioma()) {
            System.out.println("Idioma válido.");
        } else {
            System.out.println("Idioma no válido.");
        }

        // Validar notificaciones iniciales
        if (usuario.validarNotificaciones()) {
            System.out.println("Estado de notificaciones correcto.");
        } else {
            System.out.println("Estado de notificaciones incorrecto.");
        }

        // Cambiar idioma a uno válido
        usuario.cambiarIdioma("Francés");

        // Cambiar idioma a uno no válido
        usuario.cambiarIdioma("Alemán");

        // Cambiar estado de notificaciones
        usuario.activarNotificaciones(false);
    }
}
