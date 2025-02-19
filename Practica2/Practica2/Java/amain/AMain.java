
package amain;

import java.util.Scanner;

public class AMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos para la línea
        System.out.println("Ingrese las coordenadas del primer punto de la línea (x1 y1): ");
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();

        System.out.println("Ingrese las coordenadas del segundo punto de la línea (x2 y2): ");
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        Linea linea = new Linea(new Punto(x1, y1), new Punto(x2, y2));
        System.out.println(linea);
        linea.dibujaLinea();

        // Entrada de datos para el círculo
        System.out.println("Ingrese las coordenadas del centro del círculo (x y): ");
        float xc = scanner.nextFloat();
        float yc = scanner.nextFloat();

        System.out.println("Ingrese el radio del círculo: ");
        float radio = scanner.nextFloat();

        Circulo circulo = new Circulo(new Punto(xc, yc), radio);
        System.out.println(circulo);
        circulo.dibujaCirculo();

        scanner.close();
    }
}
