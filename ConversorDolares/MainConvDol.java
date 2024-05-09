import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainConvDol { // Define una clase pública llamada MainConversorDolares
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario

        // Solicita al usuario que ingrese la cantidad de pesos a convertir
        System.out.println("Ingresa cuántos pesos quieres convertir a dólares:");
        double pesos = sc.nextDouble(); // Lee la cantidad de pesos proporcionada por el usuario

        // Crea un objeto de tipo ConversorDolares con la cantidad de pesos ingresada
        ConvDol cd = new ConvDol(pesos);

        // Llama al método aDolares() del objeto ConversorDolares para convertir la cantidad de pesos a dólares
        double dolares = cd.aDolares();

        // Imprime la cantidad de pesos y su equivalente en dólares
        System.out.println("La cantidad de " + pesos + " pesos equivale a: " + dolares + " dólares");

        // Cierra el Scanner para liberar recursos
        sc.close();
    }
}
