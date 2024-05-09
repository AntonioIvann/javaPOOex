import java.util.Random; // Importa la clase Random del paquete java.util

class Password { // Declara una clase llamada Password
    private int longitud; // Declara una variable de instancia privada para la longitud de la contraseña
    private String contraseña; // Declara una variable de instancia privada para la contraseña

    // Constructor sin parámetros que genera una contraseña con longitud predeterminada
    public Password() {
        this.longitud = 8; // Establece la longitud predeterminada de la contraseña
        generarPassword(); // Genera una contraseña aleatoria
    }

    // Constructor que permite especificar la longitud de la contraseña
    public Password(int longitud) {
        this.longitud = longitud; // Establece la longitud de la contraseña según el valor proporcionado
        generarPassword(); // Genera una contraseña aleatoria
    }

    // Método que verifica si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0; // Variables para contar mayúsculas, minúsculas y números
        for (char c : contraseña.toCharArray()) { // Itera sobre cada carácter de la contraseña
            if (Character.isUpperCase(c)) mayusculas++; // Si es mayúscula, incrementa el contador de mayúsculas
            else if (Character.isLowerCase(c)) minusculas++; // Si es minúscula, incrementa el contador de minúsculas
            else if (Character.isDigit(c)) numeros++; // Si es un dígito, incrementa el contador de números
        }
        // La contraseña se considera fuerte si tiene al menos 3 mayúsculas, 2 minúsculas y 6 números
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    // Método que genera una contraseña aleatoria
    public void generarPassword() {
        Random rnd = new Random(); // Crea un objeto Random para generar números aleatorios
        StringBuilder sb = new StringBuilder(); // Crea un StringBuilder para construir la contraseña
        for (int i = 0; i < longitud; i++) { // Itera para generar cada carácter de la contraseña
            int tipo = rnd.nextInt(3); // Genera un número aleatorio entre 0 y 2 para determinar el tipo de carácter
            switch (tipo) {
                case 0: // Mayúscula
                    sb.append((char) (rnd.nextInt(26) + 'A')); // Genera un carácter mayúscula aleatorio y lo añade al StringBuilder
                    break;
                case 1: // Minúscula
                    sb.append((char) (rnd.nextInt(26) + 'a')); // Genera un carácter minúscula aleatorio y lo añade al StringBuilder
                    break;
                case 2: // Número
                    sb.append((char) (rnd.nextInt(10) + '0')); // Genera un dígito aleatorio y lo añade al StringBuilder
                    break;
            }
        }
        contraseña = sb.toString(); // Convierte el StringBuilder a String y establece la contraseña
    }

    // Método getter para obtener la longitud de la contraseña
    public int getLongitud() {
        return longitud; // Retorna la longitud de la contraseña
    }

    // Método setter para establecer la longitud de la contraseña
    public void setLongitud(int longitud) {
        this.longitud = longitud; // Establece la longitud de la contraseña según el valor proporcionado
        generarPassword(); // Al cambiar la longitud, se genera una nueva contraseña
    }

    // Método getter para obtener la contraseña
    public String getContraseña() {
        return contraseña; // Retorna la contraseña
    }
}
