package Curso_Automation.practica_curso.Herencia;

public class Alumno extends Persona{

    private String matricula;

    private Integer nota;


    public Alumno(String nombre, String apellido, String matricula, Integer nota){
        super(nombre, apellido);
        this.matricula = matricula;
        this.nota = nota;
    }

    public Integer getNota() {
        return nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public void saludar(){
        System.out.println("Que ondaaaa");
    }

}
