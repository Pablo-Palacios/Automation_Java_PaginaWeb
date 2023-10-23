package Curso_Automation.practica_curso.Ejercicios;

public class Main_Estudiante {

    public static void main(String[] args) {

        Estudiante pablo = new Estudiante(100, "Pablo", "Palacios", 7.02f);

        System.out.println("Nombre: " + pablo.getNombre());
        System.out.println("Apellido: " + pablo.getApellido());
        System.out.println("ID: " + pablo.getId());
        System.out.println("Promedio: " + pablo.getPromedio());

        pablo.setId(200);

        System.out.println("ID: " + pablo.getId());




    }
}
