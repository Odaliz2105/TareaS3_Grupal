public class Main {
    public static void main(String[] args) {
        //Crear el objeto persona
        Persona persona1 = new Persona(19);

        //Llamo al metodo

        if (persona1.verificarEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}

