package api.controller;

import api.model.Livraria;
import org.springframework.beans.factory.annotation.Autowired;

public class ControllerLivro {

    @Autowired
    public String addLivro(String nome, int id) {

        return "Livro adicionado com sucesso";
    }
}