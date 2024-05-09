import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainEstudiante { // Declara una clase pública llamada MainEstudiante
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario

        // Solicita al usuario que ingrese el nombre del estudiante
        System.out.println("Ingrese el nombre del estudiante:");
        String name = sc.nextLine(); // Lee el nombre proporcionado por el usuario

        // Solicita al usuario que ingrese la edad del estudiante
        System.out.println("Ingrese la edad del estudiante:");
        int age = sc.nextInt(); // Lee la edad proporcionada por el usuario

        // Solicita al usuario que ingrese la calificación del estudiante
        System.out.println("Ingrese la calificación del estudiante:");
        int score = sc.nextInt(); // Lee la calificación proporcionada por el usuario

        // Crea un objeto de tipo Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(name, age, score); // Crea un objeto Estudiante con el constructor que recibe nombre, edad y calificación

        // Imprime los datos del estudiante
        estudiante.imprimirDatos(); // Llama al método imprimirDatos() del objeto estudiante para imprimir los datos

        // Cierra el Scanner para liberar recursos
        sc.close(); // Cierra el objeto Scanner
    }
}
