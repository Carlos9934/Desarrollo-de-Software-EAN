import java.util.Scanner;

public class Ejercicio14 {
    public static String encontrarHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        String hermanoMayor = "";

        if (edad1 > edad2 && edad1 > edad3) {
            hermanoMayor = nombre1;
        } else if (edad2 > edad1 && edad2 > edad3) {
            hermanoMayor = nombre2;
        } else if (edad3 > edad1 && edad3 > edad2) {
            hermanoMayor = nombre3;
        } else {
            // Si hay empate de edades o algún error
            hermanoMayor = "No se puede determinar el hermano mayor";
        }

        return hermanoMayor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del primer hermano: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la edad del primer hermano: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre del segundo hermano: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la edad del segundo hermano: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre del tercer hermano: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese la edad del tercer hermano: ");
        int edad3 = scanner.nextInt();

        String hermanoMayor = encontrarHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

        System.out.println("El hermano mayor es: " + hermanoMayor);

        scanner.close();
    }
}