package Curso_Automation.practica_curso.Herencia;

public class NoDocente extends Persona{


    public NoDocente(String nombre, String apellido){
        super(nombre, apellido);
    }

    public void saludar(){
        System.out.println("Buen dia");
    }


}
