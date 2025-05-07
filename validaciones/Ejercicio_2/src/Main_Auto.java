import java.util.Scanner;

public class Main_Auto {
    public static void main(String[] args) {
        //Se crea un objeto scanner para leer la infromacion ingresada por el usuario
        Scanner sc=new Scanner(System.in);

        //Se solicitan los datos
        System.out.println("--------------ESTADO DEL AUTO--------------");
        System.out.println("Ingrese los datos\n");
        System.out.println("Velocidad Maxima: ");
        double velocidadMaxima=sc.nextDouble();//Se lee la velocidad maxima
        System.out.println("Velocidad (Actual): ");
        double velocidad=sc.nextDouble();//Se lee la velocidad
        System.out.println("Velocidad (después del frenado): ");
        double velocidadFrenado=sc.nextDouble();//Se lee la velocidad del frenado

        //Se crea un objeto Auto
        Auto auto1=new Auto(velocidadMaxima, velocidad, velocidadFrenado);

        //Se llama a los metodos para mostrar los resultados
        System.out.println("------------------RESULTADOS---------------");
        auto1.acelerar();
        auto1.frenar();
    }
}
