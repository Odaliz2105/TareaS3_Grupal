public class Auto{
    //Se inicializan los atributos
    public double velocidadMaxima, velocidad, velocidadFrenado;

    //Se crea un constructor para inicializar los atributos
    public Auto(double velocidadMaxima, double velocidad, double velocidadFrenado){
        this.velocidadMaxima=velocidadMaxima;
        this.velocidad=velocidad;
        this.velocidadFrenado=velocidadFrenado;
    }

    //Se crea un metodo acelerar para controlar que la velocidad supere el limite permitido
    public void acelerar(){
        System.out.println("\nVelocidad actual: "+velocidad+" km/h");
        if(velocidad>velocidadMaxima){
            System.out.println("¡ALERTA!\n Reduzca la velocidad. Velocidad permitida: "+velocidadMaxima+" km/h");
        }
        else{
            System.out.println("La velocidad es segura, ¡SIGA ASI!");
        }
    }

    //Se crea el metodo frenar para verificar que la velocidad no sea menor que cero
    public void frenar(){
        System.out.println("\nVelocidad despues del frenado: "+velocidadFrenado+" km/h");
        if(velocidadFrenado<0){
            System.out.println("¡ALERTA!\n La velocidad después del frenado no puede ser negativa");
        }else if (velocidadFrenado==0) {
            System.out.println("El auto se ha detenido");
        } else{
            System.out.println("Ha disminuido la velocidad");
        }
    }
}
