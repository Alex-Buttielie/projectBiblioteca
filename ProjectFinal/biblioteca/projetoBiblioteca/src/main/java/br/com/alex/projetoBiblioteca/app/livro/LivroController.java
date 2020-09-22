package br.com.alex.projetoBiblioteca.app.livro;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("livro")
public class LivroController {



    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService)
    {
        this.livroService = livroService;
    }

    @PostMapping
    public void salvar(@RequestBody Livro livro)
    {
        livroService.salvar(livro);
    }
    @GetMapping("listarTodos")
    public List<Livro> livro()
    {
        return livroService.listar();
    }
    @GetMapping("listarTodos/{id}")
    public Livro findLivroById(@PathVariable Long id)
    {
        return livroService.getLivroById(id);
    }
    @PutMapping("/")
    public Livro updateLivro(@RequestBody Livro livro)
    {
        return livroService.updateLivro(livro);
    }
    @DeleteMapping("/{id}")
    public String deleteLivro(@PathVariable Long id)
    {
        return livroService.deleteLivro(id);
    }

}
