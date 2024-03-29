package ru.den.roscosmostz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.den.roscosmostz.dto.PetDto;
import ru.den.roscosmostz.service.PetService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pets")
public class PetController {

    private final PetService service;

    @GetMapping("/1")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<PetDto> findAllPets() {
        return service.findAllPets();
    }

    @GetMapping("/2")
    @PreAuthorize("permitAll()")
    public List<PetDto> findAllPets2() {
        return service.findAllPets();
    }

    @PostMapping
    public PetDto savePet(@RequestBody PetDto dto) {
        return service.savePet(dto);
    }

    @GetMapping("/{id}")
    public PetDto getPetById(@RequestBody UUID id) {
        return service.getPetById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePetById(@PathVariable UUID id) {
        service.deletePetById(id);
    }

    @PutMapping("/{id}")
    public PetDto updatePet(@PathVariable UUID id, @RequestBody PetDto dto) {
        return service.updatePetById(id, dto);
    }

}
