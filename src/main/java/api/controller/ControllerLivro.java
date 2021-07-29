package api.controller;

import api.model.ModelLivraria;
import api.model.ModelLivro;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ControllerLivro {


    public String addLivro(String nome, int id) {

        return "Livro adicionado com sucesso";
    }

    public List<ModelLivro> getLivro() {
        ModelLivraria livraria = new ModelLivraria();

        return livraria.getLivros();
    }
}