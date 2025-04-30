
package appfigurascoloreadas;
import java.util.Random;

public class AppFigurasColoreadas {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; // 1: Cuadrado, 2: Círculo
            if (tipo == 1) {
                double lado = 1 + rand.nextDouble() * 9;
                Cuadrado c = new Cuadrado(lado);
                c.setColor("Azul");
                figuras[i] = c;
            } else {
                double radio = 1 + rand.nextDouble() * 9;
                Circulo c = new Circulo(radio);
                c.setColor("Rojo");
                figuras[i] = c;
            }
        }

        System.out.println("Resultados:\n");

        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.printf("Area: %.2f\n", f.area());
            System.out.printf("Perimetro: %.2f\n", f.perimetro());

            if (f instanceof Coloreado) {
                Coloreado obj = (Coloreado) f;
                System.out.println("-- " + obj.comoColorear());
            }

            System.out.println("---------------------------");
        }
    }
}

