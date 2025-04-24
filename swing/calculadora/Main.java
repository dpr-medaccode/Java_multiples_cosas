import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JFrame");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel resultado = new JPanel(new GridLayout(1, 1, 6, 6));

        JPanel botones = new JPanel(new GridLayout(4, 6, 6, 6));

        TextField pantalla = new TextField();

        pantalla.setPreferredSize(new Dimension(400, 100));

        pantalla.setFont(new Font("SansSerif", Font.PLAIN, 30));

        pantalla.setEditable(false);

        resultado.add(pantalla);

        String iconos[] = { "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "X",
                "0", "Del", "=", "÷" };

        for (int i = 0; i < 16; i++) {

            String texto = iconos[i];

            JButton boton = new JButton(texto);

            boton.setFont(new Font("SansSerif", Font.PLAIN, 30));

            switch (texto) {

                case "Del" -> {
                    boton.addActionListener(e -> {
                        pantalla.setText(pantalla.getText().substring(pantalla.getText().length()));
                    });
                }

                case "=" -> {

                    boton.addActionListener(e -> {

                        try {

                            Expression expression = new ExpressionBuilder(pantalla.getText()).build();
                            double result = expression.evaluate();
                            pantalla.setText(Double.toString(result));

                        } catch (Exception ex) {

                            pantalla.setText("Error");

                        }
                    });

                }

                case "X" -> {
                    boton.addActionListener(e -> {
                        pantalla.setText(pantalla.getText() + "*");
                    });
                }

                case "÷" -> {
                    boton.addActionListener(e -> {
                        pantalla.setText(pantalla.getText() + "/");
                    });
                }

                default -> {
                    boton.addActionListener(e -> {
                        pantalla.setText(pantalla.getText() + texto);
                    });
                }

            }

            // boton.addActionListener( );

            botones.add(boton);

        }

        mainPanel.add(resultado, BorderLayout.NORTH);
        mainPanel.add(botones, BorderLayout.CENTER);

        frame.add(mainPanel);

        frame.setVisible(true);

    }

}
