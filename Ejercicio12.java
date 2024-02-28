import java.util.Scanner;

public class Ejercicio12 {
    public static String obtenerDiaSiguiente(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return "Martes";
            case "martes":
                return "Miércoles";
            case "miércoles":
                return "Jueves";
            case "jueves":
                return "Viernes";
            case "viernes":
                return "Sábado";
            case "sábado":
                return "Domingo";
            case "domingo":
                return "Lunes";
            default:
                return "Día no válido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(dia);

        System.out.println("El día siguiente a " + dia + " es " + diaSiguiente);

        scanner.close();
    }
}