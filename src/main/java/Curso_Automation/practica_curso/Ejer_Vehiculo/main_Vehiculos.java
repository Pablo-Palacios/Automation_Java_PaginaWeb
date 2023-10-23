package Curso_Automation.practica_curso.Ejer_Vehiculo;

public class main_Vehiculos {

    public static void main(String[] args) {

        Vehiculos auto1 = new Vehiculos("Toyota", "Corolla", 2020);

        Coche coche1 = new Coche("Ford", "Mustang", 2021, 5000);

        System.out.println("Auto 1");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Año: " + auto1.getAno());
        System.out.println(auto1.acelerar());

        System.out.println(" ");

        System.out.println("Coche 1");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Año: " + coche1.getAno());
        System.out.println("Cilindrada: " + coche1.getCilindrada());
        System.out.println(coche1.acelear());





        









    }



}
