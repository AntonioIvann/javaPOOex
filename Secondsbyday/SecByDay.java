public class SecByDay {
    // Variable para almacenar la cantidad de días
    private int days;

    // Constructor que recibe la cantidad de días
    public SecByDay(int days){
        this.days = days; // Asigna el valor de days al atributo days de la clase
    }

    // Método para calcular la cantidad de segundos en base a los días
    public int obSeconds(){
        return days * 86400; // Retorna la cantidad de segundos calculada multiplicando los días por 86400
                             // (ya que hay 86400 segundos en un día)
    }
}
