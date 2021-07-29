package api.controller.test;

import api.controller.ControllerLivro;
import api.model.ModelLivraria;
import api.model.ModelLivro;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Livro {

    @Test
    public void cadastraLivro() throws Exception {
        String nome = "Auto da compadecida";
        int id = 1;

        ControllerLivro controllerLivro = new ControllerLivro();
        String addLivro = controllerLivro.addLivro(nome, 1);

        assertEquals("Livro adicionado com sucesso", addLivro);
    }

    @Test
    public void getLivros() throws Exception{
        ModelLivraria livraria = new ModelLivraria();
        List<ModelLivro> livros = livraria.getLivros();

        ControllerLivro controllerLivro = new ControllerLivro();
        List<ModelLivro> resLivro = controllerLivro.getLivro();

        assertEquals(livros, resLivro);
    }
}
