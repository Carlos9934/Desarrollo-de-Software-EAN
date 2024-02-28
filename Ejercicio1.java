public class Ejercicio1 {
    // Función para calcular el valor de f(x, y) = x^2 + 2xy + y^2
    public static double calcularFuncion(double x, double y) {
        return Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);
    }

    public static void main(String[] args) {
        double x = 3; // valor de x
        double y = 4; // valor de y
        double resultado = calcularFuncion(x, y);
        System.out.println("El resultado de f(" + x + ", " + y + ") es: " + resultado);
    }
}
