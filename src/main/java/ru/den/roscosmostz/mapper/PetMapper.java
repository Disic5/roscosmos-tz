package ru.den.roscosmostz.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import ru.den.roscosmostz.dto.PetDto;
import ru.den.roscosmostz.entity.Pet;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetMapper {

    PetDto toDto(Pet entity);

    Pet toEntity(PetDto dto);

    List<PetDto> toDtoList(List<Pet> petList);

    Pet update(PetDto dto, @MappingTarget Pet entity);

}
