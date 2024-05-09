public class ConvTemp {
    // Variable para almacenar la temperatura en grados Celsius
    private double cel;

    // Constructor que recibe la temperatura en grados Celsius
    public ConvTemp(double cel) {
        this.cel = cel; // Inicializa la temperatura en grados Celsius con el valor proporcionado
    }

    // Método para convertir grados Celsius a Fahrenheit
    public double obFarenheit() {
        return (9 * cel + 160) / 5; // Fórmula de conversión de Celsius a Fahrenheit
    }

    // Método para obtener la temperatura en grados Celsius
    public double getCel() {
        return cel; // Devuelve el valor actual de la temperatura en grados Celsius
    }

    // Método para establecer la temperatura en grados Celsius
    public void setCel(double cel) {
        this.cel = cel; // Establece el valor de la temperatura en grados Celsius con el valor proporcionado
    }
}
