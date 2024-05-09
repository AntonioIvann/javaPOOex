import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainConvnTemp { // Declara una clase pública llamada MainConversionTemp
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario

        System.out.println("Ingresa la temperatura en grados Celsius:"); // Solicita al usuario que ingrese la temperatura en grados Celsius
        double cel = sc.nextDouble(); // Lee la temperatura en grados Celsius proporcionada por el usuario

        ConvTemp temp = new ConvTemp(cel); // Crea un objeto de tipo ConversionTemp con la temperatura ingresada

        double fahrenheit = temp.obFarenheit(); // Llama al método obFarenheit() para convertir la temperatura a grados Fahrenheit

        // Imprime la temperatura en grados Celsius y grados Fahrenheit
        System.out.println("Los grados en Celsius son: " + cel + "°C");
        System.out.println("Los grados en Fahrenheit son: " + fahrenheit + "°F");

        sc.close(); // Cierra el Scanner para evitar fugas de recursos
    }
}
