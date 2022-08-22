package com.endava.temaRestpet.repository;

import com.endava.temaRestpet.model.Pet;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class PetRepository {
    private Map<Integer, Pet> pets = new HashMap<>();


    @PostConstruct
    private void init() {
        createPets();
    }

    private void createPets() {
        Pet pet = new Pet();
        pet.setId(1);
        pet.setName("Max");
        pet.setCategory("Dog");
        pet.setPhotoUrl("url1");
        pet.setTag("tag1");
        pet.setStatus("available");

        pets.put(pet.getId(), pet);

        pet = new Pet();
        pet.setId(2);
        pet.setName("Luna");
        pet.setCategory("cat");
        pet.setPhotoUrl("url2");
        pet.setTag("tag2");
        pet.setStatus("pending");

        pets.put(pet.getId(), pet);

        pet = new Pet();
        pet.setId(3);
        pet.setName("Thor");
        pet.setCategory("dog");
        pet.setPhotoUrl("url3");
        pet.setTag("tag3");
        pet.setStatus("sold");

        pets.put(pet.getId(), pet);

    }
    public List<Pet> findAll() {
        return new ArrayList<>(pets.values());
    }

    public List<Pet> findByStatus(String status) {
        List<Pet> lista = new ArrayList<>();
        for( Pet value : pets.values())
            if(value.getStatus().equals(status))
                lista.add(value);
            return lista;
    }

    public List<Pet> findByTag(String tag) {
        List<Pet> lista = new ArrayList<>();
        for (Pet value : pets.values())
            if (value.getTag().equals(tag))
                lista.add(value);
        return lista;
    }

    public Pet findById(int id){return pets.get(id);}

    public void save(Pet pet) {
        pets.compute(pet.getId(), (key, value) -> pet);
    }

    public void delete(int id) {
        pets.remove(id);
    }

    public void update(Pet pet) {
        pets.replace(pet.getId(), pet);
    }
}
