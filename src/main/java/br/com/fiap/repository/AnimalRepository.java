package br.com.fiap.repository;

import br.com.fiap.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalRepository {
    
    private List<Animal> animais = new ArrayList<>();
    
    public AnimalRepository() {
        // Adicionar alguns animais de exemplo
        animais.add(new Animal(1L, "Rex", "Cachorro", 3, "Golden Retriever", "Macho", "João Silva", "(11) 99999-9999"));
        animais.add(new Animal(2L, "Mimi", "Gato", 2, "Persa", "Fêmea", "Maria Santos", "(11) 88888-8888"));
        animais.add(new Animal(3L, "Buddy", "Cachorro", 1, "Labrador", "Macho", "Pedro Costa", "(11) 77777-7777"));
        animais.add(new Animal(4L, "Luna", "Gato", 4, "Siamês", "Fêmea", "Ana Oliveira", "(11) 66666-6666"));
        animais.add(new Animal(5L, "Thor", "Cachorro", 5, "Husky", "Macho", "Carlos Lima", "(11) 55555-5555"));
    }
    
    public List<Animal> findAll() {
        List<Animal> sortedList = new ArrayList<>(animais);
        sortedList.sort((a1, a2) -> a1.getId().compareTo(a2.getId()));
        return sortedList;
    }
    
    public Optional<Animal> findById(Long id) {
        return animais.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }
    
    public Animal save(Animal animal) {
        if (animal.getId() == null) {
            // New animal - generate ID and add
            animal.setId(generateId());
            animais.add(animal);
        } else {
            // Existing animal - find and replace
            Optional<Animal> existingAnimal = findById(animal.getId());
            if (existingAnimal.isPresent()) {
                // Remove old animal and add updated one
                animais.remove(existingAnimal.get());
                animais.add(animal);
            } else {
                // ID exists but animal not found - add as new
                animais.add(animal);
            }
        }
        return animal;
    }
    
    public Animal update(Long id, Animal animal) {
        Optional<Animal> existingAnimal = findById(id);
        if (existingAnimal.isPresent()) {
            // Remove old animal and add updated one
            animais.remove(existingAnimal.get());
            animal.setId(id);
            animais.add(animal);
            return animal;
        }
        return null; // Animal not found
    }
    
    public void deleteById(Long id) {
        animais.removeIf(a -> a.getId().equals(id));
    }
    
    private Long generateId() {
        return animais.stream()
                .mapToLong(Animal::getId)
                .max()
                .orElse(0) + 1;
    }
}
