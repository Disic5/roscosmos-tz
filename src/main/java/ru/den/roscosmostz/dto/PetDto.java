package ru.den.roscosmostz.dto;

import ru.den.roscosmostz.enums.Gender;

import java.util.UUID;

public record PetDto(
        UUID id,
        String name,
        Integer age,
        Gender gender) {
}
