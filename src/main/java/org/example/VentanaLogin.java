package org.example;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import org.example.Usuario;


/**
 * Clase que representa la ventana de Login del Casino Black Cat.
 * Permite ingresar credenciales para acceder al sistema.
 */
public class VentanaLogin {
    // --- Lista dinámica de usuarios ---
    public static final List<Usuario> USUARIOS = new ArrayList<>();
    // --- UI ---
    private final JFrame frame = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnIngresar = new JButton("Ingresar");
    /**
     * Constructor que inicializa la ventana de login.
     * Configura el tamaño, los componentes y los eventos.
     */
    public VentanaLogin() {
// TODO: inicializar usuarios hardcodeados
// TODO: inicializar y configurar la ventana
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        lblUsuario.setBounds(50,30,150,25);
        txtUsuario.setBounds(50,55,150,25);
        lblClave.setBounds(50,80,150,25);
        txtClave.setBounds(50,105,150,25);
        btnIngresar.setBounds(250,150,100,30);
    }

    /**
     * Muestra la ventana en pantalla.
     * Debe centrarla y hacerla visible.
     */
    public void mostrarVentana() {
// TODO: mostrar ventana
        frame.add(lblClave);
        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(txtClave);
        frame.add(btnIngresar);
        frame.setVisible(true);
    new VentanaLogin();
    }
    /**
     * Maneja el evento de login al presionar el botón.
     * Debe validar credenciales y abrir la siguiente ventana o mostrar error.
     */
    private void login() {
// TODO: implementar lógica de login

    }
    /**
     * Valida las credenciales del usuario contra el arreglo hardcoded.
     *
     * @param u nombre de usuario ingresado
     * @param p clave ingresada
     * @return el nombre del usuario si es válido, o cadena vacía si no coincide
     */
    private String validarCredenciales(String u, String p) {
// TODO: recorrer arreglo y validar credenciales
        return "";
    }
/**
 * Abre la ventana de registro para crear un nuevo usuario.
 * Debe cerrar la ventana actual e invocar a VentanaRegistro.
 */
    void abrirRegistro() {
// TODO: abrir ventana de registro y cerrar login
    }

}