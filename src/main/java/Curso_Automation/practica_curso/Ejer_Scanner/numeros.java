package Curso_Automation.practica_curso.Ejer_Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numeros {


    // Ingresar por consola un número mientras sea menor o igual a 500 y almacenar el número en una lista.

    // Al finalizar el ingreso mostrar los datos y la cantidad ingresada por pantalla.

    // También, sí hubo menos de 10 ingresos mostrar “Se ingresaron pocos números”
    // de los contrario mostrar “Se excedió la cantidad de ingresos”

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero;

      

        Integer contador = 0;



        List<Integer> miLista = new ArrayList<>();




        System.out.println("Ingresar un numero menor o igual a 500");

        do {

            System.out.println("Ingresa un numero: ");
            numero = scanner.nextInt();
            if(numero <= 500)
            {
                miLista.add(numero);
                contador++;
            }else
                System.out.println("No se puede superar el 500");

        }while (contador < 10);


        System.out.println("cantidad de numeros ingresados: " + miLista.size());

        if (contador < 10) {
                System.out.println("Se ingresaron pocos numeros");
                //} else if (miLista.size()> 10) {
                //  System.out.println("Se exedio la cantidad de ingresos");
        } else {
                System.out.println("Se cargaron correctamente");
        }



    }


}
