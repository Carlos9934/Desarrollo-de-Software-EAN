import java.util.Scanner;

public class Ejercicio4 {
   
    public static double calcularGastoArriendo(double sueldo) {
        double porcentajeArriendo = 0.4; // 40%
        double gastoArriendo = sueldo * porcentajeArriendo;
        return gastoArriendo;
    }

    
    public static double calcularGastoComida(double sueldo) {
        double porcentajeComida = 0.15; // 15%
        double gastoComida = sueldo * porcentajeComida;
        return gastoComida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

     
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);

        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);

      
        scanner.close();
    }
}