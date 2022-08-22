package com.endava.temaRestpet.service;

import com.endava.temaRestpet.model.Pet;
import com.endava.temaRestpet.repository.PetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PetServiceImpl implements PetService{

    private final PetRepository petRepository;

    @Override
    public List<Pet> getPets() {
        return petRepository.findAll();
    }

    @Override
    public List<Pet> getPetsByStatus(String status) {
        return petRepository.findByStatus(status);
    }

    @Override
    public List<Pet> getPetsByTag(String tag) {
        return petRepository.findByTag(tag);
    }

    @Override
    public Pet getById(int id) {
        return petRepository.findById(id);
    }


    @Override
    public void save(Pet pet) {
        petRepository.save(pet);

    }

    @Override
    public void delete(int id) {
        petRepository.delete(id);

    }

    @Override
    public void update(Pet pet) {
        petRepository.update(pet);

    }
}
