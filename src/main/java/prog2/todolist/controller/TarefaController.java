/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.todolist.controller;

import java.util.ArrayList;
import prog2.todolist.model.Tarefa;

/**
 *
 * @author Coronetti
 */
public class TarefaController {
    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static void addTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public static void editarTarefa(int index, Tarefa tarefa) {
        listaTarefas.set(index, tarefa);
    }

    public static void excluirTarefa(int index) {
        listaTarefas.remove(index);
    }

    public static ArrayList<Tarefa> getListaDeTarefas() {
        return listaTarefas;
    }
}
