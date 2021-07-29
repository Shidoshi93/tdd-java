package api.model;

import java.util.List;

public class Livraria {
    private List<Livro> Livros;

    public List<Livro> getLivros() {
        return Livros;
    }

    public void setLivros(List<Livro> Livros) {
        this.Livros = Livros;
    }
}
