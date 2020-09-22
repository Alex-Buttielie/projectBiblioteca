package br.com.alex.projetoBiblioteca.app.livro;

import br.com.alex.projetoBiblioteca.app.amigo.Amigo;

import java.util.List;

public interface LivroService {

    Livro salvar(Livro livro);
    Livro updateLivro(Livro livro);
    Livro getLivroById(Long id);
    String deleteLivro(Long idLivro);
    List<Livro> listar();
}