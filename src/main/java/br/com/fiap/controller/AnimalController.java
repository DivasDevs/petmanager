package br.com.fiap.controller;

import br.com.fiap.model.Animal;
import br.com.fiap.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService service;

    @Autowired
    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Animal criar(@RequestBody Animal animal) {
        return service.criarOuAtualizar(animal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> atualizar(@PathVariable Long id, @RequestBody Animal animal) {
        Animal animalAtualizado = service.atualizar(id, animal);
        if (animalAtualizado != null) {
            return ResponseEntity.ok(animalAtualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (service.deletar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
