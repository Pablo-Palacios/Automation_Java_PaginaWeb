package Curso_Automation.practica_curso.Abstractas;

public class Cuadrado extends Figura{


    private Integer lado;
    @Override
    public double calcularArea() {
        return lado + lado;
    }
}
