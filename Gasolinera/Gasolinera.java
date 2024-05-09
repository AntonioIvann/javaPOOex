public class Gasolinera { // Definición de la clase Gasolinera

    // Variables de instancia para almacenar datos
    private double galón; // Cantidad de galones
    private double precio; // Precio por litro
    private double litros; // Cantidad de litros

    // Método para obtener el precio por litro
    public double getPrecio() {
        return precio;
    }

    // Método para establecer el precio por litro
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para obtener la cantidad de litros
    public double getLitros() {
        return litros;
    }

    // Método para establecer la cantidad de litros
    public void setLitros(double litros) {
        this.litros = litros;
    }

    // Constructor que recibe la cantidad de galones
    public Gasolinera(double galón) {
        this.galón = galón;
    }

    // Método para convertir galones a litros
    public double Alitros() {
        return galón * 3.785411784; // Fórmula de conversión de galones a litros
    }

    // Método para calcular el precio total
    public double calcularPrecio() {
        return Alitros() * precio; // Multiplica la cantidad de litros por el precio por litro
    }
}
