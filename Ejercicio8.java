import java.util.Scanner;

public class Ejercicio8 {

    public static int calcularNumeroSalones(int numEstudiantes, int capacidadSalon) {
        int numSalones = (int) Math.ceil((double) numEstudiantes / capacidadSalon);
        return numSalones;
    }

    public static int calcularNumeroPisos(int numSalonesTotal, int numSalonesPorPiso) {
        int numPisos = (int) Math.ceil((double) numSalonesTotal / numSalonesPorPiso);
        return numPisos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes que tiene la universidad: ");
        int numEstudiantes = scanner.nextInt();

        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        System.out.print("Ingrese el número de salones que tendrá un piso del edificio: ");
        int numSalonesPorPiso = scanner.nextInt();


        int numSalonesTotal = calcularNumeroSalones(numEstudiantes, capacidadSalon);


        int numPisos = calcularNumeroPisos(numSalonesTotal, numSalonesPorPiso);

        System.out.println("El número total de salones necesarios es: " + numSalonesTotal);
        System.out.println("El número de pisos del nuevo edificio será: " + numPisos);

 
        scanner.close();
    }
}