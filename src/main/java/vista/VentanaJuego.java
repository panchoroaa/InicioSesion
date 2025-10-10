package vista;

import javax.swing.*;

public class VentanaJuego {
    private final JFrame frame = new JFrame("Ruleta - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JLabel lblClave = new JLabel("Clave:");
    private final JLabel lblPregunta = new JLabel("Desea apostar a un número específico? ingreselo aquí:");
    private final JButton btnRojo = new JButton("Apostar al rojo");
    private final JButton btnNegro = new JButton("Apostar al negro");
    private final JTextField txtNumeroApuesta = new JTextField();
}
