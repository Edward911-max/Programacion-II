
package amain;
import java.awt.*;
import javax.swing.*;
class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio;
    }

    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval((int) (centro.x + 200 - radio), (int) (-centro.y + 200 - radio), (int) (radio * 2), (int) (radio * 2));
            }
        });
        frame.setVisible(true);
    }
}
