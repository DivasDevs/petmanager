package br.com.fiap.repository;

import br.com.fiap.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalRepository {

    private final List<Animal> animais = new ArrayList<>();
    private Long nextId = 3L; // controle de ID

    public AnimalRepository() {
        animais.add(new Animal(1L, "Rex", "Cachorro", 5, "Labrador", "Macho", "João", "99999-0000"));
        animais.add(new Animal(2L, "Mimi", "Gato", 3, "Persa", "Fêmea", "Maria", "98888-1111"));
    }

    public List<Animal> findAll() {
        return animais;
    }

    public Optional<Animal> findById(Long id) {
        return animais.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    public Animal save(Animal animal) {
        if (animal.getId() == null) {
            animal.setId(nextId++);
            animais.add(animal);
        } else {
            // Atualizar
            findById(animal.getId()).ifPresent(existing -> {
                int index = animais.indexOf(existing);
                animais.set(index, animal);
            });
        }
        return animal;
    }

    public boolean deleteById(Long id) {
        return animais.removeIf(a -> a.getId().equals(id));
    }
}
