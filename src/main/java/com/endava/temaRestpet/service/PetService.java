package com.endava.temaRestpet.service;

import com.endava.temaRestpet.model.Pet;

import java.util.List;
import java.util.Optional;

public interface PetService {
    List<Pet> getPets();

    List<Pet> getPetsByStatus(String status);

    List<Pet> getPetsByTag(String tag);

    Pet getById(int id);

    void save(Pet pet);

    void delete(int id);

    void update(Pet pet);


}
