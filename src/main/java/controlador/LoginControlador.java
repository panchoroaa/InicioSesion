package controlador;

import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRegistro;


import javax.swing.*;

public class LoginControlador {
    public static Usuario autenticar(String usuario, String clave) {
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
}