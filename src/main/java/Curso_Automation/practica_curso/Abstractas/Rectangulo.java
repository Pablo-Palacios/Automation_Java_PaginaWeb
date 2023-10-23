package Curso_Automation.practica_curso.Abstractas;

public class Rectangulo extends Figura{

    private Integer base;
    private Integer altura;


    @Override
    public double calcularArea() {
        return base * altura;
    }
}
