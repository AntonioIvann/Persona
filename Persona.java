public class Persona {

    // Declaramos variables para almacenar información personal
    String nombre; // Nombre de la persona
    String apellido; // Apellido de la persona
    int edad; // Edad de la persona
    double altura; // Altura de la persona
    
    // Método para mostrar el nombre de la persona
    public String mostrarNombre(){
        System.out.println("Hola me llamo: "+this.nombre); // Imprime el nombre de la persona
        return nombre; // Devuelve el nombre
    }
    
    // Método para mostrar el apellido de la persona
    public String mostrarApellido(){
        System.out.println("Y mi apellido es: "+this.apellido); // Imprime el apellido de la persona
        return apellido; // Devuelve el apellido
    }         
    
    // Método para mostrar la edad de la persona
    public int mostrarEdad(){
        System.out.println("Mi edad es: "+this.edad); // Imprime la edad de la persona
        return edad; // Devuelve la edad
    }     
    
    // Método para mostrar la altura de la persona
    public double mostrarAltura(){
        System.out.println("Y mi altura es : "+this.altura); // Imprime la altura de la persona
        return altura; // Devuelve la altura
    }

    // Métodos getter y setter para acceder y modificar el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para acceder y modificar el apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para acceder y modificar la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos getter y setter para acceder y modificar la altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString que devuelve una representación de cadena de la información de la persona
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }

}
