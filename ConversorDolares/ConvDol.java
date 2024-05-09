public class ConvDol { // Define una clase pública llamada ConversorDolares

    // Variable para almacenar la cantidad de pesos a convertir
    double pesos;

    // Constructor que recibe la cantidad de pesos a convertir
    public ConvDol(double pesos) {
        this.pesos = pesos; // Inicializa la variable 'pesos' con el valor proporcionado
    }

    // Método para convertir pesos a dólares
    public double aDolares() {
        return 0.059 * pesos; // Realiza la conversión de pesos a dólares y devuelve el resultado
    }

    // Método para obtener la cantidad de pesos
    public double getPesos() {
        return pesos; // Devuelve la cantidad de pesos almacenada en la variable 'pesos'
    }

    // Método para establecer la cantidad de pesos
    public void setPesos(double pesos) {
        this.pesos = pesos; // Establece el valor de la variable 'pesos' con el valor proporcionado
    }
}
