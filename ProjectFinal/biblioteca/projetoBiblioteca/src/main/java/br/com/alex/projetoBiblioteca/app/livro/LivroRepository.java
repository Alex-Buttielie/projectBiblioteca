package br.com.alex.projetoBiblioteca.app.livro;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {


}