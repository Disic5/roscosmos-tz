package ru.den.roscosmostz.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.den.roscosmostz.dto.PetDto;
import ru.den.roscosmostz.entity.Pet;
import ru.den.roscosmostz.mapper.PetMapper;
import ru.den.roscosmostz.repository.PetRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PetService {

    private static final String ENTITY_NOT_FOUND = "Entity not found with: %s";

    private final PetRepository repository;

    private final PetMapper mapper;


    public List<PetDto> findAllPets() {
        log.info("Getting all Pets");
        return mapper.toDtoList(repository.findAll());
    }

    public PetDto savePet(PetDto dto) {
        log.info("Saving Pet");
        Pet savedPet = repository.save(mapper.toEntity(dto));
        return mapper.toDto(savedPet);
    }

    public PetDto getPetById(UUID id) {
        Pet pet = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND.formatted(id)));
        return mapper.toDto(pet);
    }

    public void deletePetById(UUID id) {
        repository.findById(id)
                .map(entity -> {
                    repository.deleteById(id);
                    return entity;
                }).orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND.formatted(id)));
    }

    public PetDto updatePetById(UUID id, PetDto dto) {
        return mapper.toDto(repository.findById(id)
                .map(entity -> mapper.update(dto, entity))
                .orElseThrow(() -> new EntityNotFoundException(ENTITY_NOT_FOUND.formatted(id))));
    }

}
