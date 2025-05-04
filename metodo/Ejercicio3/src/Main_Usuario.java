import java.util.Scanner;
public class Main_Usuario {
    public static void main(String[] args) {
        //Se crea un objeto scanner para leer los datos ingresados por teclado
        Scanner sc=new Scanner(System.in);

        //Se crea un objeto de la clase Usuario
        Usuario saludo1=new Usuario();

        System.out.println("--------INICIO--------");
        System.out.println("Ingrese su nombre: ");

        String nombre=sc.nextLine();//Se lee el nombre del usuario por teclado
        System.out.println("\n-------SALUDO--------\n");

        //Se crea una nueva variable y se guarda la llamada al metodo saludarUsuario()
        String saludo=saludo1.saludarUsuario(nombre);

        //Se imprime la variable para que se muestre el contenido en consola
        System.out.println(saludo);
    }
}