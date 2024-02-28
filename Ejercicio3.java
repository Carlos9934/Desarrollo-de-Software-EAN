public class Ejercicio3 {
    public static double calcularLongitudEscalera(double altura, double angulo) {
    
        double anguloRadianes = Math.toRadians(angulo);

 
        double longitudEscalera = altura / Math.cos(anguloRadianes);

        return longitudEscalera;
    }

    public static void main(String[] args) {
        double altura = 5.0; 
        double angulo = 30.0; 

        double longitud = calcularLongitudEscalera(altura, angulo);

        System.out.println("La longitud de la escalera es: " + longitud);
    }
}