package Curso_Automation.practica_curso.Herencia;

public class Persona {

    protected String nombre;

    protected String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){return nombre;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){return apellido;}

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void saludar(){
        System.out.println("Hola como estan");
    }
}
