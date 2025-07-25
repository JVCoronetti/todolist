/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.todolist.model;

import java.util.Date;

/**
 *
 * @author Coronetti
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;
    private Date data;

    public Tarefa(String titulo, String descricao, boolean concluida, Date data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    

}
