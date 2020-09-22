package br.com.alex.projetoBiblioteca.app.amigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmigoServiceImpl implements AmigoService {

    private final AmigoRepository repository;

    @Autowired
    public AmigoServiceImpl(AmigoRepository repository) {

        this.repository = repository;
    }
    public Amigo salvar(Amigo amigo) {

        return repository.save(amigo);
    }
    @Override
    public List<Amigo> listar() {

        return repository.findAll();
    }

    public Amigo getAmigoById(Long id){

        return repository.findById(id).orElse(null);
    }


    public String deleteAmigo(Long id){

        repository.deleteById(id); return null;
    }
    public Amigo updateAmigo(Amigo amigo)
    {
        Amigo existingAmigo=repository.findById(amigo.getId()).orElse(null);
        existingAmigo.setNome(amigo.getNome());
        existingAmigo.setTelefoneFixo(amigo.getTelefoneFixo());
        existingAmigo.setTelefoneCelular(amigo.getTelefoneCelular());
        existingAmigo.setEmail(amigo.getEmail());
        existingAmigo.setApelido(amigo.getApelido());

        return repository.save(existingAmigo);
    }
}