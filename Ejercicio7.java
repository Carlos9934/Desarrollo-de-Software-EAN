import java.util.Scanner;

public class Ejercicio7 {
  
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
        return distancia;
    }


    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        double pendiente = (y2 - y1) / (x2 - x1);
        return pendiente;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();


        double distancia = calcularDistancia(x1, y1, x2, y2);


        double pendiente = calcularPendiente(x1, y1, x2, y2);


        System.out.println("La distancia entre los puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los puntos es: " + pendiente);

        scanner.close();
    }
}