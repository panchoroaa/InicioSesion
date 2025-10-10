package vista;

import modelo.Usuario;
import controlador.LoginControlador;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase que representa la ventana de Login del Casino Black Cat.
 * Permite ingresar credenciales para acceder al sistema.
 */
public class VentanaLogin {
    // --- Lista dinámica de usuarios ---
    public static final List<Usuario> USUARIOS = new ArrayList<>();
    private String usuario;
    private String clave;
    private String nombre;
    // --- UI ---
    private final JFrame frame = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnIngresar = new JButton("Ingresar");
    private final JButton btnRegistrar = new JButton("Registarse");
    /**
     * Constructor que inicializa la ventana de login.
     * Configura el tamaño, los componentes y los eventos.
     */
    public VentanaLogin() {
// TODO: inicializar usuarios hardcodeados
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        lblUsuario.setBounds(50,30,150,25);
        txtUsuario.setBounds(50,55,150,25);
        lblClave.setBounds(50,80,150,25);
        txtClave.setBounds(50,105,150,25);
        btnIngresar.setBounds(250,150,100,30);
        btnRegistrar.setBounds(100,150,100,30);
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
        frame.add(btnIngresar);
        frame.add(btnRegistrar);
        frame.setVisible(true);
        btnIngresar.addActionListener(e-> getDatos());
        btnRegistrar.addActionListener(e->abrirRegistro());
        btnRegistrar.addActionListener(e-> frame.dispose());
    new VentanaLogin();
    }

    private void abrirRegistro() {
        LoginControlador.abrirRegistro();
    }

    public void getDatos() {
        this.usuario = txtUsuario.getText();
        this.clave = Arrays.toString(txtClave.getPassword());
        this.nombre = txtUsuario.getText();
    }
    public void autenticarDatos() {
        getDatos();
        LoginControlador.autenticar(usuario, clave, nombre);
    }
}