import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainCostoAuto { // Declara una clase pública llamada MainCostoAuto
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        // Crear un objeto Scanner para leer el costo del automóvil
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner llamado sc para leer la entrada del usuario
        System.out.println("Ingresa el costo del automóvil:"); // Solicita al usuario que ingrese el costo del automóvil
        double costoa = sc.nextDouble(); // Lee el costo del automóvil proporcionado por el usuario
        
        // Crear un objeto de tipo CostoAuto con el costo inicial del automóvil
        CostoAuto costoAuto = new CostoAuto(); // Crea un objeto de la clase CostoAuto llamado costoAuto
        costoAuto.setCostoa(costoa); // Establece el costo inicial del automóvil en el objeto costoAuto
        
        // Calcular el pago del vendedor (pgv) y los impuestos
        costoAuto.setPgv(costoa); // Establece el pago del vendedor en el objeto costoAuto
        costoAuto.setImpuestos(costoa); // Establece los impuestos en el objeto costoAuto
        
        // Calcular el costo final del automóvil
        costoAuto.setCostof(costoa); // Establece el costo final del automóvil en el objeto costoAuto
        double costof = costoAuto.calcularCosto(); // Calcula el costo final del automóvil
        
        // Imprimir el costo inicial del automóvil y su costo final
        System.out.println("El costo del automóvil es: " + costoa + " y su costo final sería: " + costof);
        
        // Imprimir la información del costo del automóvil utilizando el método toString
        System.out.println(costoAuto.toString());
        
        // Cerrar el Scanner
        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
