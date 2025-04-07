
package aplicacion2;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaParImpar extends Juego {

    public JuegoAdivinaParImpar(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void juega() {
        reiniciaPartida();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Adivina si el numero aleatorio es par o impar. Escribe 'par' o 'impar':");

        while (true) {
            int numeroAleatorio = rand.nextInt(100); // número entre 0 y 99
            System.out.print("Par o impar?: ");
            String respuesta = sc.next().toLowerCase();

            boolean esPar = numeroAleatorio % 2 == 0;
            boolean acertaste = (esPar && respuesta.equals("par")) || (!esPar && respuesta.equals("impar"));

            if (acertaste) {
                System.out.println("Correcto! Era " + numeroAleatorio);
                actualizaRecord();
            } else {
                System.out.println("Incorrecto. Era " + numeroAleatorio + (esPar ? " (par)" : " (impar)"));
                boolean sigue = quitaVida();
                if (!sigue) {
                    System.out.println("Has perdido!");
                    break;
                }
            }
        }
    }
}
