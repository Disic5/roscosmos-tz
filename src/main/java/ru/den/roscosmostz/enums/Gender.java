package ru.den.roscosmostz.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("Самец"),
    FEMALE("Самка");

    private final String value;
}
