public class Usuario {
    private String idioma;
    private boolean notificacionesActivadas;

    // Constructor
    public Usuario(String idioma, boolean notificacionesActivadas) {
        this.idioma = idioma;
        this.notificacionesActivadas = notificacionesActivadas;
    }

    // Método para validar el idioma actual
    public boolean validarIdioma() {
        return idioma.equals("Español") || idioma.equals("Inglés") || idioma.equals("Francés");
    }

    // Método para validar notificaciones
    public boolean validarNotificaciones() {
        return notificacionesActivadas || !notificacionesActivadas;
    }

    // Método para cambiar el idioma, solo si es válido
    public void cambiarIdioma(String nuevoIdioma) {
        if (nuevoIdioma.equals("Español") || nuevoIdioma.equals("Inglés") || nuevoIdioma.equals("Francés")) {
            this.idioma = nuevoIdioma;
            System.out.println("Idioma cambiado correctamente.");
        } else {
            System.out.println("Idioma no válido. No se realizó el cambio.");
        }
    }

    // Método para activar o desactivar notificaciones
    public void activarNotificaciones(boolean activar) {
        this.notificacionesActivadas = activar;
        System.out.println("Estado de notificaciones actualizado.");
    }


    public boolean isNotificacionesActivadas() {
        return notificacionesActivadas;
    }
}
