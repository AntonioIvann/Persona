public class Persona {

    String nombre;
    String apellido;
    int edad;
    double altura;
    
    public String mostrarNombre(){
        System.out.println("Hola me llamo: "+this.nombre);
        return nombre;
    }
    public String mostrarApellido(){
        System.out.println("Y mi apellido es: "+this.apellido);
        return apellido;
    }         
    public int mostrarEdad(){
        System.out.println("Mi edad es: "+this.edad);
        return edad;
    }     
    public double mostrarAltura(){
        System.out.println("Y mi altura es : "+this.altura);
        return altura;
    }

}