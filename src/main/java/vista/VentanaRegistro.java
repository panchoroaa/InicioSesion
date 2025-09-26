package vista;

import modelo.Usuario;
import vista.VentanaMenu;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VentanaRegistro {
    public static final List<Usuario> USUARIOS = new ArrayList<>();

    // --- UI ---
    private final JFrame frame = new JFrame("Registro - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnRegistrar = new JButton("Registarse");
    /**
     * Constructor que inicializa la ventana de login.
     * Configura el tamaño, los componentes y los eventos.
     */
    public VentanaRegistro() {
// TODO: inicializar usuarios hardcodeados
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        lblUsuario.setBounds(50,30,150,25);
        txtUsuario.setBounds(50,55,150,25);
        lblClave.setBounds(50,80,150,25);
        txtClave.setBounds(50,105,150,25);
        btnRegistrar.setBounds(250,150,100,30);
    }

    /**
     * Muestra la ventana en pantalla.
     * Debe centrarla y hacerla visible.
     */
    public void mostrarVentana() {
        frame.add(lblClave);
        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(txtClave);
        frame.add(btnRegistrar);
        frame.setVisible(true);
        new VentanaRegistro();

        USUARIOS.add(new Usuario(txtUsuario.getText(), Arrays.toString(txtClave.getPassword()), txtUsuario.getText()));
    }
}
