import java.util.Scanner;



public class Ejercicio5 {

    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double calcularAreaCorona(double radioGrande, double radioPequeno) {
        double areaGrande = calcularAreaCirculo(radioGrande);
        double areaPequeno = calcularAreaCirculo(radioPequeno);
        double areaCorona = areaGrande - areaPequeno;
        return areaCorona;
    }

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

    
        double areaCorona = calcularAreaCorona(radioGrande, radioPequeno);

        System.out.println("El área de la corona circular es: " + areaCorona);

       
        scanner.close();
    }
}