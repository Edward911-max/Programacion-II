
package aplicacion2;

public class Juego {
    public int numeroDeVidas;
    public int record;

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo record! Total: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Vidas restantes: " + numeroDeVidas);
        return numeroDeVidas > 0;
    }
}
