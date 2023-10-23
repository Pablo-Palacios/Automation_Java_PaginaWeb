package Curso_Automation.practica_curso.Ejer_Vehiculo;

public class Coche extends Vehiculos{

    private Integer cilindrada;

    public Coche(String marca, String modelo, Integer ano, Integer cilindrada){
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada){
        this.cilindrada = cilindrada;
    }


    public String acelear(){
        return "El auto esta en movimiento";
    }
}
