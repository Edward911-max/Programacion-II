
package amain;
import java.awt.*;
import javax.swing.*;
class Linea {
    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Linea de " + p1 + " a " + p2;
    }

    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine((int) p1.x + 200, (int) -p1.y + 200, (int) p2.x + 200, (int) -p2.y + 200);
            }
        });
        frame.setVisible(true);
    }
}
