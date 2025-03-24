
package mainecuacion;

import java.util.Scanner;

public class MainEcuacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        System.out.println(ecuacion.getRaices());
        sc.close();
    }
    
}
