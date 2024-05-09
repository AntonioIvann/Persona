import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainPersona {
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner p1 = new Scanner(System.in); // Crea un objeto Scanner llamado p1 para leer la entrada del usuario

        System.out.println("Ingresa tu nombre: "); // Solicita al usuario que ingrese su nombre
        String nombre = p1.next(); // Lee el nombre proporcionado por el usuario

        System.out.println("Ingresa tu apellido: "); // Solicita al usuario que ingrese su apellido
        String apellido = p1.next(); // Lee el apellido proporcionado por el usuario

        System.out.println("Cual es tu edad: "); // Solicita al usuario que ingrese su edad
        int edad = p1.nextInt(); // Lee la edad proporcionada por el usuario

        System.out.println("Cuanto mides: "); // Solicita al usuario que ingrese su altura
        double altura = p1.nextDouble(); // Lee la altura proporcionada por el usuario

        Persona p2 = new Persona(); // Crea un objeto de la clase Persona llamado p2

        // Asigna los valores proporcionados por el usuario al objeto p2
        p2.nombre = nombre;
        p2.apellido = apellido;
        p2.edad = edad;
        p2.altura = altura;

        // Llama a los métodos mostrarNombre(), mostrarApellido(), mostrarEdad() y mostrarAltura()
        // de p2 para obtener los valores actualizados y asignarlos a las variables correspondientes
        nombre = p2.mostrarNombre();
        apellido = p2.mostrarApellido();
        edad = p2.mostrarEdad();
        altura = p2.mostrarAltura();
    }
}
