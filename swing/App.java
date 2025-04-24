import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Componentes Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null); // Centrada

        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new GridLayout(6,4,5,5));

        p2.add(new Button("%"));
        p2.add(new Button("CE"));
        p2.add(new Button("C"));
        p2.add(new Button("⌫"));

        p2.add(new Button(" 1/x"));
        p2.add(new Button("x²"));
        p2.add(new Button("√x"));
        p2.add(new Button("÷"));

        p2.add(new Button("7"));
        p2.add(new Button("8"));
        p2.add(new Button("9"));
        p2.add(new Button("x"));

        p2.add(new Button("4"));
        p2.add(new Button("5"));
        p2.add(new Button("6"));
        p2.add(new Button("-"));

        p2.add(new Button("1"));
        p2.add(new Button("2"));
        p2.add(new Button("3"));
        p2.add(new Button("+"));

        p2.add(new Button("+/-"));
        p2.add(new Button("0"));
        p2.add(new Button(","));
        p2.add(new Button("="));

        p1.add(new TextArea(), BorderLayout.NORTH);
        p1.add(p2, BorderLayout.CENTER);
        frame.add(p1);
     

        frame.setVisible(true);
    }
}