package com.company.entity;

import java.util.Arrays;

public enum TreeType {
    DECIDUOUS("deciduous"),
    CONIFEROUS("coniferous");

    private String name;

    TreeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static TreeType ofName(String name) {
        return Arrays.stream(TreeType.values())
            .filter(type -> type.getName().equals(name))
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException(String.format("No tree type with name %s", name)));
    }
}
