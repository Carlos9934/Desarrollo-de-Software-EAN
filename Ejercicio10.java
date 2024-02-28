import java.util.Scanner;

public class Ejercicio10 {
    public static int operacionAritmetica(int num1, int num2, String operador) {
        int resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: división por cero.");
                }
                break;
            case "%":
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: división por cero.");
                }
                break;
            case "**":
                resultado = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operador no válido.");
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();

        int resultado = operacionAritmetica(num1, num2, operador);
        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}