package br.com.fiap.service;

import br.com.fiap.model.Animal;
import br.com.fiap.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    
    private final AnimalRepository repository;
    
    @Autowired
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
    
    public Animal atualizar(Long id, Animal animal) {
        return repository.update(id, animal);
    }
    
    public boolean deletar(Long id) {
        Optional<Animal> animal = repository.findById(id);
        if (animal.isPresent()) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
