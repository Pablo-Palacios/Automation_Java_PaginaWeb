package Curso_Automation.practica_curso.Herencia;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{

    private List <Alumno> alumnos;

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();

    }

    public List<Alumno> getAlumnos(){
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos){
        this.alumnos.add(alumnos);
    }


    public void saludar(){
        System.out.println("Hola a TODOS");
    }


//    En Profesor se debe implementar un método calificar() sobrecargado


  //  Si calificar recibe un Alumno y la nota, agrega a ese alumno la nota

    public void calificar(Alumno alumno, Integer nota){
        alumno.setNota(nota);
    }



    // Si calificar solo recibe una nota, agrega a todos sus alumnos la misma nota
    public void calificar(Integer nota){

        // FOR TRADICIONAL

        //for (int i = 0; i < alumnos.size(); i++){
          //  alumnos.get(i).setNota(nota);

        // FOR EACH

        //for (Alumno alumno: alumnos
          //   ) {
           // alumno.setNota(nota);
        //}

        // FOR EACH ACTUALIZADO

        alumnos.forEach(alumno -> alumno.setNota(nota) );


    }
}

