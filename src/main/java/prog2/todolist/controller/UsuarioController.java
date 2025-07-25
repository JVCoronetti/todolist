/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.todolist.controller;

import java.util.ArrayList;
import prog2.todolist.model.Usuario;

/**
 *
 * @author Coronetti
 */
public class UsuarioController {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public static boolean addUsuario(Usuario user) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(user.getEmail())) {
                return false; // já existe
            }
        }
        listaUsuarios.add(user);
        return true;
    }

    public static Usuario autenticar(String email, String senha) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }
}
