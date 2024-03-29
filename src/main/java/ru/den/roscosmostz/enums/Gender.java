package ru.den.roscosmostz.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("Кабель"),
    FEMALE("Сука");

    private final String value;
}
