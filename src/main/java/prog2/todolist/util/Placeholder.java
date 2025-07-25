/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.todolist.util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Coronetti
 */
public class Placeholder {
    public static void add(JTextField campo, String texto) {
        campo.setText(texto);
        campo.setForeground(Color.GRAY);
        campo.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(texto)) {
                    campo.setText("");
                    campo.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setText(texto);
                    campo.setForeground(Color.GRAY);
                }
            }
        });
    }
    
    public static void add(JTextArea area, String texto) {
        area.setText(texto);
        area.setForeground(Color.GRAY);
        area.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (area.getText().equals(texto)) {
                    area.setText("");
                    area.setForeground(Color.BLACK);
                }
            }
            public void focusLost(FocusEvent e) {
                if (area.getText().isEmpty()) {
                    area.setText(texto);
                    area.setForeground(Color.GRAY);
                }
            }
        });
    }
}
