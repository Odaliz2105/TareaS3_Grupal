public class Usuario {
    //Atributos
    public String idioma;
    public boolean notificacionesActivadas;

    // Constructor
    public Usuario(String idioma, boolean notificacionesActivadas) {
        this.idioma = idioma;
        this.notificacionesActivadas = notificacionesActivadas;
    }

    // Método para validar el idioma
    public boolean validarIdioma() {
        if (idioma.equals("Español") || idioma.equals("Inglés") || idioma.equals("Francés")) {
            return true;
        } else {
            return false;
        }
    }

    // Método para validar notificaciones
    public boolean validarNotificaciones() {
        return notificacionesActivadas || !notificacionesActivadas;
    }

    public boolean isNotificacionesActivadas() {
        return notificacionesActivadas;
    }
}
