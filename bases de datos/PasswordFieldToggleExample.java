import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldToggleExample {
    public static void main(String[] args) {
        // Crear un marco (ventana)
        JFrame frame = new JFrame("Campo de Contraseña");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPasswordField
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setEchoChar('*');  // Al principio, se mostrarán asteriscos

        // Crear un botón para alternar entre mostrar asteriscos y mostrar el texto
        JButton toggleButton = new JButton("Mostrar/Ocultar Contraseña");
        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el carácter actual de "eco"
                char currentEchoChar = passwordField.getEchoChar();

                // Si está mostrando asteriscos, cambiar a texto normal (0)
                if (currentEchoChar == '*') {
                    passwordField.setEchoChar((char) 0);  // Mostrar texto normal
                    toggleButton.setText("Ocultar Contraseña");
                } else {
                    passwordField.setEchoChar('*');  // Volver a mostrar asteriscos
                    toggleButton.setText("Mostrar Contraseña");
                }
            }
        });

        // Crear un panel para organizar los elementos
        JPanel panel = new JPanel();
        panel.add(new JLabel("Introduce tu contraseña:"));
        panel.add(passwordField);
        panel.add(toggleButton);

        // Agregar el panel al marco y mostrar la ventana
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
