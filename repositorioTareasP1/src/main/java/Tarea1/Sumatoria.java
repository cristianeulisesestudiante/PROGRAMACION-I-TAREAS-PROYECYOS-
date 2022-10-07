package Tarea1;

/**
 * @author Cristian Sanchez - 20211899 
 * 4. Realizar un programa que imprima la sumatoria 
 *    De los números del 1 al 20 utilizando ciclos.
 */
public class Sumatoria {

    public static void main( String[] args ) {
        int sumador = 0;
        int number = 1;

        do {
            sumador += number;
            number++;
        } while (number < 20);

        System.out.println("LA SUMATORIA DE LOS NUMEROS DEL 1 A 20 ES: " + sumador);
    }
}
