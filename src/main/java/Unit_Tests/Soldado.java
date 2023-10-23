package Unit_Tests;

public class Soldado {



    // Crear la clase Soldado con las siguientes características:
    // tiene el atributo salud y los métodos pelear, descansar y estaMuerto.
    // Cuando un Soldado pelea pierde de salud la mitad del ataque que recibe. Y cuando descansa recupera 10 de salud.
    // El soldado está muerto si la salud es menor o igual a 0

    // Implementar tests sobre la clase Soldado.


    private int salud;

    public Soldado(int salud){
        this.salud = salud;
    }

    public int getSalud(){
        return salud;
    }

    public void pelear(int ataque){
        this.salud = this.salud - ( ataque / 2);
    }

    public void descansar(){
        this.salud = this.salud + 10;
    }

    public boolean estaMuerto(){
        return this.salud <= 0;
    }





}
