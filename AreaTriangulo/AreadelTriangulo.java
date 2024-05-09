public class AreadelTriangulo { // Declaración de una clase pública llamada AreaTriangulo

    // Método para calcular el área de un triángulo
    public static double areaTriangulo(double altura, double base) {
        // Verificar si la base o la altura son no positivas
        if (base <= 0 || altura <= 0) { // Comprobación de si alguno de los valores es no positivo
            return 0; // Retornar 0 si alguno de los valores es no positivo, ya que el área no puede ser negativa o cero
        } else {
            // Calcular el área del triángulo
            double area = (base * altura) / 2; // Fórmula para calcular el área de un triángulo
            return area; // Retornar el área calculada
        }
    }
}
