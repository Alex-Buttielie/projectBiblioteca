package br.com.alex.projetoBiblioteca.app.livro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository repository;


    @Autowired
    public LivroServiceImpl(LivroRepository repository) {

        this.repository = repository;
    }

    @Override
    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    @Override
    public List<Livro> listar() {
        return repository.findAll();
    }

    @Override
    public Livro getLivroById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteLivro(Long idLivro){
        repository.deleteById(idLivro);
        return null;
    }


    public Livro updateLivro(Livro livro)
    {
        Livro existingLivro=repository.findById(livro.getId()).orElse(null);
        existingLivro.setTitulo(livro.getTitulo());
        existingLivro.setAutores(livro.getAutores());
        existingLivro.setEditores(livro.getEditores());
        existingLivro.setAnoDePublicacao(livro.getAnoDePublicacao());
        existingLivro.setEdicaoDoLivro(livro.getEdicaoDoLivro());
        existingLivro.setData(livro.getData());
        existingLivro.setOpiniao(livro.getOpiniao());
        return repository.save(existingLivro);
    }


}