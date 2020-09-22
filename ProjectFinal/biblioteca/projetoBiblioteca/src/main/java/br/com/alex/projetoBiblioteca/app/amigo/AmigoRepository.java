package br.com.alex.projetoBiblioteca.app.amigo;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AmigoRepository extends JpaRepository<Amigo, Long> {
}