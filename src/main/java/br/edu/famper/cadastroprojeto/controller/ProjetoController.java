package br.edu.famper.cadastroprojeto.controller;
import br.edu.famper.cadastroprojeto.model.Projeto;
import br.edu.famper.cadastroprojeto.service.ProjetoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public ResponseEntity<List<Projeto>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(projetoService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Projeto>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(projetoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Projeto> create(@RequestBody Projeto projeto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(projetoService.salvar(projeto));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Projeto> update(@RequestBody Projeto projeto) {
        return ResponseEntity.status(HttpStatus.OK).body(projetoService.update(projeto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        projetoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
