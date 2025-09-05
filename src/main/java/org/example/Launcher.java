package org.example;
import org.example.VentanaLogin;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        // Aseguramos que la GUI se ejecute en el Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaLogin().mostrarVentana();
            }
        });
    }
}
