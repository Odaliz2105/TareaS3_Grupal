public class Main {
    public static void main(String[] args) {
        // Crear objeto
        Calificacion calificación1 = new Calificacion(70.55);

        // Obtener categoría
        char categoria = calificación1.categoriaDeCalificacion();

        // Mostrar resultado
        System.out.println("Su calificación es " + calificación1.calificacion +" y corresponde a la categoría: " + categoria);
    }
}