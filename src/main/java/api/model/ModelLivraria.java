package api.model;

import java.util.List;

public class ModelLivraria {
    private List<ModelLivro> Livros;

    public List<ModelLivro> getLivros() {
        return Livros;
    }

    public void setLivros(List<ModelLivro> Livros) {
        this.Livros = Livros;
    }
}
