public class AreadelCirculo { // Define una clase pública llamada AreadelCirculo

    // Método estático para calcular el área de un círculo
    public static double calcularArea(double radio) { // El método recibe el radio del círculo como parámetro
        if (radio <= 0) { // Verifica si el radio es menor o igual a cero
            return 0; // Retorna 0 si el radio es no positivo
        } else {
            // Si el radio es positivo, calcula el área del círculo utilizando la fórmula: π * radio^2
            return Math.PI * radio * radio; // Calcula y retorna el área del círculo
        }
    }
}
