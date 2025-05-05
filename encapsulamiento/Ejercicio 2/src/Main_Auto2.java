import java.util.Scanner;

public class Main_Auto2 {
    public static void main(String[] args) {
        //Se crea un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc=new Scanner(System.in);

        System.out.println("-----------ESTADO DEL AUTO-----------");
        System.out.println("Ingrese los datos\n");
        System.out.println("Velocidad Maxima: ");
        double vmaxima=sc.nextDouble();//Se lee la velocidad maxima
        System.out.println("Velocidad (Actual): ");
        double velocidad=sc.nextDouble();//Se lee la velocidad
        System.out.println("Velocidad (después del frenado): ");
        double vfrenado=sc.nextDouble();//Se lee la velocidad despues del frenado

        //Se crea un objeto con los datos ingresados
        Auto2 auto1=new Auto2(vmaxima,vfrenado);

        System.out.println("\n----------VELOCIDAD ACTUAL----------");
        System.out.print("Estado: ");
        //Se establece la velocidad actual del auto
        auto1.setVelocidad(velocidad);
        //Se obtiene y se muestra la velocidad actual del auto
        System.out.println(auto1.getVelocidad());

        //Se llama a los metodos para mostrar los resultados
        System.out.println("\n-------------RESULTADOS-------------");
        System.out.println("Al acelerar: ");
        auto1.acelerar();
        System.out.println("Al frenar: ");
        auto1.frenar();
    }
}