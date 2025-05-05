public class Calificacion {
        //Atributos
        public double calificacion;

        //Constructor
        public Calificacion(double calificacion){
            this.calificacion=calificacion;
        }

        //Método
        public char categoriaDeCalificacion() {
            if (calificacion >= 90) {
                return 'A';
            } else if (calificacion >= 80) {
                return 'B';
            } else if (calificacion >= 70) {
                return 'C';
            } else if (calificacion >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        }//Devuelve un char
    }


