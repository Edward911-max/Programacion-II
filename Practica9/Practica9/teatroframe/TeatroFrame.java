
package teatroframe;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class TeatroFrame extends JFrame {
    private JRadioButton rbPalco, rbPlatea, rbGaleria;
    private JTextField tfNumero, tfDias;
    private JTextArea infoArea;
    private ButtonGroup grupoTipo;

    public TeatroFrame() {
        setTitle("Teatro Municipal");
        setSize(480, 360);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
        getContentPane().setBackground(Color.white);

        // ----- Panel Superior (Título + Imagen)
        JLabel titulo = new JLabel("Teatro Municipal", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(new Color(0, 51, 153)); // Azul fuerte

        ImageIcon icon = new ImageIcon("teatro.jpg"); // Cambia ruta si es necesario
        JLabel imagen = new JLabel(icon);
        imagen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JPanel top = new JPanel(new BorderLayout());
        top.setBackground(Color.white);
        top.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray));
        top.add(titulo, BorderLayout.CENTER);
        top.add(imagen, BorderLayout.EAST);
        add(top, BorderLayout.NORTH);

        // ----- Panel Central (Formulario)
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(0, 51, 153)), "Datos del Boleto",
            TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.PLAIN, 12), new Color(0, 51, 153)
        ));
        panelFormulario.setBackground(Color.white);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.fill = GridBagConstraints.HORIZONTAL;

        // Tipo de boleto
        rbPalco = new JRadioButton("Palco", true);
        rbPlatea = new JRadioButton("Platea");
        rbGaleria = new JRadioButton("Galeria");
        grupoTipo = new ButtonGroup();
        grupoTipo.add(rbPalco);
        grupoTipo.add(rbPlatea);
        grupoTipo.add(rbGaleria);

        JPanel panelRadios = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelRadios.setBackground(Color.white);
        panelRadios.add(rbPalco);
        panelRadios.add(rbPlatea);
        panelRadios.add(rbGaleria);

        c.gridx = 0; c.gridy = 0; c.gridwidth = 2;
        panelFormulario.add(panelRadios, c);

        // Número
        c.gridy = 1; c.gridwidth = 1;
        panelFormulario.add(new JLabel("Número:"), c);
        tfNumero = new JTextField("1");
        c.gridx = 1;
        panelFormulario.add(tfNumero, c);

        // Días
        c.gridx = 0; c.gridy = 2;
        panelFormulario.add(new JLabel("Cant. Días para el Evento:"), c);
        tfDias = new JTextField();
        c.gridx = 1;
        panelFormulario.add(tfDias, c);

        // Botones
        JButton btnVender = new JButton("Vende");
        JButton btnSalir = new JButton("Salir");
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.white);
        panelBotones.add(btnVender);
        panelBotones.add(btnSalir);

        c.gridx = 0; c.gridy = 3; c.gridwidth = 2;
        panelFormulario.add(panelBotones, c);

        add(panelFormulario, BorderLayout.CENTER);

        // ----- Panel Inferior (Resultado)
        infoArea = new JTextArea(2, 30);
        infoArea.setEditable(false);
        infoArea.setFont(new Font("Arial", Font.PLAIN, 12));
        infoArea.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.lightGray), "Información"));

        add(infoArea, BorderLayout.SOUTH);

        // Acciones
        btnVender.addActionListener(e -> procesarVenta());
        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void procesarVenta() {
        try {
            int numero = Integer.parseInt(tfNumero.getText().trim());
            int dias = tfDias.getText().isEmpty() ? 0 : Integer.parseInt(tfDias.getText().trim());

            Boleto boleto;
            if (rbPalco.isSelected()) {
                boleto = new Palco(numero);
            } else if (rbPlatea.isSelected()) {
                boleto = new Platea(numero, dias);
            } else {
                boleto = new Galeria(numero, dias);
            }

            infoArea.setText("Número: " + boleto.numero + ", Precio: " + boleto.precio);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TeatroFrame::new);
    }
}


