package ru.den.roscosmostz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.den.roscosmostz.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
