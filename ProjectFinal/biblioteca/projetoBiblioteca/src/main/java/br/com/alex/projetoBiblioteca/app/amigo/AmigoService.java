package br.com.alex.projetoBiblioteca.app.amigo;

import java.util.List;

public interface AmigoService {

    Amigo salvar(Amigo amigo);
    Amigo updateAmigo(Amigo amigo);
    Amigo getAmigoById(Long id);
    String deleteAmigo(Long id);
    List<Amigo> listar();
}