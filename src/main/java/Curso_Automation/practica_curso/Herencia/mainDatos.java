package Curso_Automation.practica_curso.Herencia;

import java.util.ArrayList;
import java.util.List;

public class mainDatos {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Pablo", "Palacios", "1000", 7);

        Profesor profesor = new Profesor("Juan", "CaradeVerga");

        NoDocente noDocente = new NoDocente("Julian", "Pito");

        List<Persona> ListaDePersonas = new ArrayList<>();

        ListaDePersonas.add(alumno);
        ListaDePersonas.add(profesor);
        ListaDePersonas.add(noDocente);

        ListaDePersonas.forEach(persona -> persona.saludar());



    }
}
