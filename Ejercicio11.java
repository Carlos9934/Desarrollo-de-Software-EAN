import java.util.Scanner;

public class Ejercicio11 {

    public static int obtenerDecenas(int numero) {
        return (numero / 10) % 10;
    }

    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    public static String convertirDigito(int digito) {
        switch (digito) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }

    public static String convertirDecenas(int decenas) {
        switch (decenas) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Número inválido. Debe estar entre 1 y 99.");
        } else {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            String numeroRomano = convertirDecenas(decenas) + convertirDigito(unidades);
            System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
        }

        scanner.close();
    }
}