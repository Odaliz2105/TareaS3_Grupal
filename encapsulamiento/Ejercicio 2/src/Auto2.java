public class Auto2{
    //Se crean los atributos y se determinan como privados
    private double velocidad;
    private final double vmaxima;
    private final double vfrenado;
    private final double vminima=0;

    //Se crea un constructor que inicializa los atributos
    public Auto2(double vmaxima, double vfrenado){
        this.vmaxima=vmaxima;
        this.vfrenado=vfrenado;
    }

    //Metodo que usa el set para establecer la velocidad actual
    public void setVelocidad(double velocidad){
        if (velocidad< vminima){
            System.out.println("Encienda el auto");
        } else if (velocidad>vmaxima) {
            System.out.println("La velocidad no puede ser mayor que "+vmaxima+"km/h");
        } else {
            this.velocidad=velocidad;
            System.out.println("Puede acelerar un poco mas");
        }
    }

    //Metodo que usa el get para devolver la velocidad actual
    public double getVelocidad(){
        return velocidad;
    }

    //Se crea un metodo acelerar() para verificar que la velocidad no supere la permitida
    public void acelerar(){
        if (velocidad>vmaxima){
            System.out.println("¡ALERTA!\n Reduzca la velocidad. Velocidad permitida: "+vmaxima+" km/h");
        }
        else{
            System.out.println("La velocidad es segura, ¡SIGA ASI!\n");
        }
    }

    //Se crea el metodo frenar para verificar que la velocidad no sea negativa
    public void frenar(){
        if(vfrenado<0){
            System.out.println("¡ALERTA!\n La velocidad después del frenado no puede ser negativa");
        } else if (vfrenado==vminima) {
            System.out.println("El auto se ha detenido");
        } else{
            System.out.println("Ha disminuido la velocidad");
        }
    }
}