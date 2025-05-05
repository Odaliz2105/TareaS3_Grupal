public class Persona {
    //Atributos
    public int edad;

    //Constructor

    public Persona(int edad) {
        this.edad = edad;
    }

    //Método
    public boolean verificarEdad() {
        return edad >= 18;//Retorna True o False dependiendo de la edad
    }

}

