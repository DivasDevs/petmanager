package br.com.fiap.service;

import br.com.fiap.model.Animal;
import br.com.fiap.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> listarTodos() {
        return repository.findAll();
    }

    public Optional<Animal> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Animal criarOuAtualizar(Animal animal) {
        return repository.save(animal);
    }

    public boolean deletar(Long id) {
        return repository.deleteById(id);
    }
}
