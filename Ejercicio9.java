import java.util.Scanner;

public class Ejercicio9 {
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int mayor = encontrarMayor(num1, num2);

        System.out.println("El mayor de los dos números es: " + mayor);

        scanner.close();
    }
}