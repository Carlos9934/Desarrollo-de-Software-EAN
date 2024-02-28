import java.util.Scanner;

public class Ejercicio6 {
    
    public static double calcularAreaRectangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        double perimetro = ladoA + ladoB + hipotenusa;
        return perimetro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C: ");
        double ladoC = scanner.nextDouble();

        double areaTerreno = calcularAreaRectangulo(ladoA, ladoB);

        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        System.out.println("El área del terreno es: " + areaTerreno);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);

        scanner.close();
    }
}