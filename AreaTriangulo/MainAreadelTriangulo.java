import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainAreadelTriangulo { // Declara una clase pública llamada MainAreaTriangulo

    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario

        // Solicitar al usuario la base del triángulo
        System.out.println("Ingresa la base del triángulo: ");
        double base = sc.nextDouble(); // Lee la base del triángulo proporcionada por el usuario

        // Solicitar al usuario la altura del triángulo
        System.out.println("Ingresa la altura del triángulo: ");
        double altura = sc.nextDouble(); // Lee la altura del triángulo proporcionada por el usuario

        // Calcular el área del triángulo llamando al método estático areaTriangulo de la clase AreaTriangulo
        double area = AreadelTriangulo.areaTriangulo(base, altura); // Llama al método estático areaTriangulo de la clase AreaTriangulo

        // Mostrar el resultado del área del triángulo
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el Scanner para liberar recursos
        sc.close();
    }
}
