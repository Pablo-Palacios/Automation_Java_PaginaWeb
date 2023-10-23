package Curso_Automation.practica_curso.Ejercicios;

public class Estudiante {

    private Integer id;

    private String nombre;

    private String apellido;

    private Float promedio;

    public Estudiante(Integer id, String nombre, String apellido, Float promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

     public void setApellido(String apellido){
        this.apellido = apellido;
     }

     public Float getPromedio(){
        return promedio;
     }

     public void setPromedio(Float promedio){
        this.promedio = promedio;
     }
}
