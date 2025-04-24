import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DibujoConSwing extends JPanel implements ActionListener {

    private Timer timer;
    private int x = 0;
    private boolean enMovimiento = true;
    private Color colorCirculo = Color.RED;

    public DibujoConSwing() {
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Fondo
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Dibujar círculo con color actual
        g2.setColor(colorCirculo);
        g2.fillOval(x, 100, 50, 50);

        // Texto
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("SansSerif", Font.BOLD, 18));
        g2.drawString("Círculo animado", 20, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (enMovimiento) {
            x += 3;
            if (x > getWidth()) x = -50;
            repaint();
        }
    }

    public void cambiarColor() {
        // Cambiar a un color aleatorio
        colorCirculo = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
        repaint();
    }

    public void alternarMovimiento() {
        enMovimiento = !enMovimiento;
    }

    // Clase principal con ventana y botones
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Java2D + Swing");
        DibujoConSwing panelDibujo = new DibujoConSwing();

        // Crear botones
        JButton btnColor = new JButton("Cambiar color");
        JButton btnToggle = new JButton("Iniciar/Pausar");

        // Asignar acciones
        btnColor.addActionListener(e -> panelDibujo.cambiarColor());
        btnToggle.addActionListener(e -> panelDibujo.alternarMovimiento());

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnColor);
        panelBotones.add(btnToggle);

        // Layout principal
        ventana.setLayout(new BorderLayout());
        ventana.add(panelDibujo, BorderLayout.CENTER);
        ventana.add(panelBotones, BorderLayout.SOUTH);

        ventana.setSize(500, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
