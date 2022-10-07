package Tarea1;

/**
 * @author Cristian Sanchez - 20211899 
 * 5. Realizar un programa que imprima las tablas de multiplicar del 2 al 10 
 *    utilizando ciclos anidados.
 */
public class Tablas {
    public static void main( String[] args ) {
        int multiplicador = 2;
        
        while (multiplicador <= 10) {            
            
                 System.out.println("|----------------------|");
                 System.out.println("| TABLA DEL " + multiplicador);
            for (int i = 1; i <= 10; i++) {
                 int resultado = multiplicador * i;
                 System.out.println("| " + multiplicador + " x " + i + " = " + resultado);   
            }
                 System.out.println("|----------------------|");
                 multiplicador++;
        }
    }
}
