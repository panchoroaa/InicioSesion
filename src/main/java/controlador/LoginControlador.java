package controlador;

import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRegistro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LoginControlador {
    public static Usuario autenticar(String usuario, String clave, String nombre) {
        for (Usuario u : VentanaLogin.USUARIOS) {
            if (u.getNombre().equals(usuario) && u.getPassword().equals(clave)) {
                return u;
            }
        }
        return (null); }

    private String validarCredenciales(String u, String p) {
        // TODO: recorrer arreglo y validar credenciales
        return "";
    }

    public static void abrirRegistro() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaRegistro().mostrarVentana();
            }
        });
    }

    private void registrarUsuario(){
        final List<Usuario> USUARIOS = new ArrayList<>();
        USUARIOS.add(new Usuario(VentanaRegistro.getDatos()));
    }
}

//     public static final List<Usuario> USUARIOS = new ArrayList<>();
//     USUARIOS.add(new Usuario(txtUsuario.getText(), Arrays.toString(txtClave.getPassword()), txtUsuario.getText()));