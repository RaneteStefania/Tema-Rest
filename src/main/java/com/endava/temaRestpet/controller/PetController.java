package com.endava.temaRestpet.controller;

import com.endava.temaRestpet.model.Pet;
import com.endava.temaRestpet.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/pet")
public class PetController  {

    private final PetService petService;

    @GetMapping()
      public List<Pet> getPets() {
     return petService.getPets();

    }

    @PutMapping()
    public void updatePet(@RequestBody Pet pet) {
        petService.update(pet);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createPet(@Valid @RequestBody Pet pet) {
        petService.save(pet);
    }

    @GetMapping("findByStatus/{status}")
    public List<Pet> getPetsByStatus(@PathVariable String status) {
        return petService.getPetsByStatus(status);
    }
    @GetMapping("findByTags/{tag}")
    public List<Pet> getPetsByTag(@PathVariable String tag) {
        return petService.getPetsByTag(tag);
    }
    @GetMapping("/{id}")
    public Pet getById(@PathVariable int id){return petService.getById(id);}

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable int id) {
        petService.delete(id);
    }


}



