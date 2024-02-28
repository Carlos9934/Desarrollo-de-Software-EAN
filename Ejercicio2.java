public class Ejercicio2 {
    public static int calcularBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        int sillasNecesarias = estudiantesGordos * 2 + estudiantesFlacos;

        int busesNecesarios = sillasNecesarias / sillasPorBus;
        
    
        if (sillasNecesarias % sillasPorBus != 0) {
            busesNecesarios++;
        }
        
        return busesNecesarios;
    }

    public static void main(String[] args) {
        int sillasPorBus = 50; 
        int estudiantesGordos = 40; 
        int estudiantesFlacos = 20;
        
        int busesNecesarios = calcularBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses.");
    }
}
