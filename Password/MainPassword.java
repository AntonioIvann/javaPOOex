public class MainPassword {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt(); // Leer la longitud de la contraseña proporcionada por el usuario

        System.out.print("Ingrese el número de contraseñas a generar: ");
        int tamañoArray = scanner.nextInt(); // Leer el número de contraseñas a generar proporcionado por el usuario

        Password[] passwords = new Password[tamañoArray]; // Crear un arreglo para almacenar las contraseñas generadas
        boolean[] esFuerteArray = new boolean[tamañoArray]; // Crear un arreglo para almacenar si cada contraseña es fuerte o no

        // Generar y evaluar cada contraseña
        for (int i = 0; i < tamañoArray; i++) {
            passwords[i] = new Password(longitud); // Crear una nueva contraseña de la longitud especificada
            esFuerteArray[i] = passwords[i].esFuerte(); // Evaluar si la contraseña es fuerte y almacenar el resultado
        }

        // Imprimir las contraseñas generadas y si son consideradas "fuertes" o no
        System.out.println("Contraseñas generadas:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + passwords[i].getContraseña() + " (" + (esFuerteArray[i] ? "Fuerte" : "Débil") + ")");
        }
    }
}
