import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainSecondsByDay { // Declara una clase pública llamada MainSecondsByDay
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        // Crear un objeto Scanner para leer la cantidad de días ingresada por el usuario
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc

        // Solicitar al usuario que ingrese la cantidad de días
        System.out.println("¿De cuántos días quieres obtener los segundos?");
        int days = sc.nextInt(); // Lee la cantidad de días proporcionada por el usuario y la almacena en la variable days

        // Crear un objeto de tipo SecondsByDay con la cantidad de días ingresada
        SecondsByDay sd = new SecondsByDay(days); // Crea un objeto de la clase SecondsByDay llamado sd, pasando days como argumento

        // Calcular la cantidad de segundos utilizando el método obSeconds() de la clase SecondsByDay
        int seconds = sd.obSeconds(); // Llama al método obSeconds() para obtener la cantidad de segundos y la almacena en la variable seconds

        // Imprimir el resultado
        System.out.println("La cantidad de segundos que tiene " + days + " días es: " + seconds); // Imprime el resultado de la cantidad de segundos

        // Cerrar el Scanner para liberar los recursos
        sc.close(); // Cierra el objeto Scanner
    }
}
