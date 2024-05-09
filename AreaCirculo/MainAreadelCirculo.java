import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainAreadelCirculo { // Declara una clase pública llamada MainAreaCirculo
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario

        System.out.println("Ingresa el radio del círculo:"); // Solicita al usuario que ingrese el radio del círculo
        double radio = sc.nextDouble(); // Lee el radio proporcionado por el usuario y lo guarda como un valor de tipo double

        // Llama al método estático calcularArea(radio) de la clase AreaCirculo para calcular el área del círculo
        double area = AreadelCirculo.calcularArea(radio);

        // Imprime el resultado del cálculo del área del círculo
        System.out.println("El área del círculo es: " + area);

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
