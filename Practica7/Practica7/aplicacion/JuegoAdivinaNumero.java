
package aplicacion;
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    public int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas, int numeroFijado) {
        this.numeroDeVidas = vidas;
        this.record = 0;
        this.numeroAAdivinar = numeroFijado;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // número entre 0 y 10

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número entre 0 y 10:");

        while (true) {
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                boolean sigue = quitaVida();
                if (!sigue) {
                    System.out.println("¡Perdiste! El número era: " + numeroAAdivinar);
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es mayor. Intenta de nuevo:");
                    } else {
                        System.out.println("El número es menor. Intenta de nuevo:");
                    }
                }
            }
        }
    }
}
