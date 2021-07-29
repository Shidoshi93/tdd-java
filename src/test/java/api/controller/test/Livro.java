package api.controller.test;

import api.controller.ControllerLivro;
import org.junit.Test;

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
}
