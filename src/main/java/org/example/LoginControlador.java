package org.example;

import javax.swing.*;

public class LoginControlador {
    public Usuario autenticar(String usuario, String clave) {
        for (Usuario u : VentanaLogin.USUARIOS) {
            if (u.getNombre().equals(usuario) && u.getPassword().equals(clave)) {
                return u;
            }
        }
        Usuario Usuario = null;
        return (Usuario); }

    private String validarCredenciales(String u, String p) {
        // TODO: recorrer arreglo y validar credenciales
        return "";
    }

    public void abrirRegistro() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaRegistro().mostrarVentana();
            }
        });
    }
}