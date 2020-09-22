package br.com.alex.projetoBiblioteca.app.amigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("amigo")
public class AmigoController {

    private final AmigoService amigoService;

    @Autowired
    public AmigoController(AmigoService amigoService)
    {
        this.amigoService = amigoService;
    }

    @PostMapping
    public void salvar(@RequestBody Amigo amigo)
    {
        amigoService.salvar(amigo);
    }
    @GetMapping("listarTodos")
    public List<Amigo> amigo()
    {
        return amigoService.listar();
    }
    @GetMapping("listarTodos/{id}")
    public Amigo findAmigoById(@PathVariable Long id)
    {
        return amigoService.getAmigoById(id);
    }
    @PutMapping("/")
    public Amigo updateAmigo(@RequestBody Amigo amigo)
    {
        return amigoService.updateAmigo(amigo);
    }
    @DeleteMapping("/{id}")
    public String deleteAmigo(@PathVariable Long id)
    {
        return amigoService.deleteAmigo(id);
    }

}