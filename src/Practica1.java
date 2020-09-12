import java.util.Scanner;

/***
 * PRACTICA 1 - ESTRUCTURA DE DATOS - RENE SEBASTIAN CONDORI ESCOBAR
 */

public class Practica1 {
    //aqui definimos el vector notas
    int []notas;

    Scanner scanner;

    //Este es el metodo constructor
    public Practica1() {
        notas = new int[5];

        scanner = new Scanner(System.in);
    }

    //Este es el metodo ejecutar
    public void ejecutar(){
        //ingresando por teclado notas (0-10)
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("notas [" + i + "]: ");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }

        //aqui es donde mostramos el contenido de las notas
        double suma = 0;
        double promedio;

        int minimo = 10;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "]: " + notas[i]);

            suma = suma + notas[i];

            if(notas[i] < minimo) {
                minimo = notas[i];
            }

            if(notas[i] > maximo) {
                maximo = notas[i];
            }
        }

        promedio = suma / notas.length;

        System.out.println("Promedio:" + promedio);
        System.out.println("Maximo:" + maximo);
        System.out.println("Minimo:" + minimo);

    }
}
