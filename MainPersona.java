import java.util.Scanner;
public class MainPersona{
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = p1.next();
        System.out.println("Ingresa tu apellido: ");
        String apellido = p1.next();
        System.out.println("Cual es tu edad: ");
        int edad = p1.nextInt();
        System.out.println("Cuanto mides: ");
        double altura = p1.nextDouble();
        Persona p2 = new Persona();
        p2.nombre=nombre;
        p2.apellido=apellido;
        p2.edad=edad;
        p2.altura=altura;
        nombre=p2.mostrarNombre();
        apellido=p2.mostrarApellido();
        edad=p2.mostrarEdad();
        altura=p2.mostrarAltura();
    }
}