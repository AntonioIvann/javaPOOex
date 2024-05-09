import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainGasolinera { // Declara una clase pública llamada MainGasolinera
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario

        // Solicita al usuario que ingrese la cantidad de galones necesarios
        System.out.println("Ingresa cuántos galones necesitas:");
        double galones = sc.nextDouble(); // Lee la cantidad de galones ingresada por el usuario

        // Crea un objeto de tipo Gasolinera con la cantidad de galones ingresada
        Gasolinera gs = new Gasolinera(galones);
        // Calcula la cantidad de litros equivalente a los galones ingresados
        double litros = gs.Alitros();
        // Calcula el precio total
        double precio = gs.calcularPrecio();
        
        // Imprime el resultado formateado
        System.out.printf("%.2f galones equivalen a %.2f litros, por lo tanto, serían $%.2f\n", galones, litros, precio);
        
        // Cierra el Scanner para liberar los recursos
        sc.close();
    }
}
