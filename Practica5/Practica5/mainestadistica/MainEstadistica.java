
package mainestadistica;

import java.util.Scanner;

public class MainEstadistica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadisticas stats = new Estadisticas(numeros);

        System.out.printf("El promedio es %.2f\n", stats.getPromedio());
        System.out.printf("La desviacion estandar es %.5f\n", stats.getDesviacionEstandar());

        sc.close();
    }
    
}
