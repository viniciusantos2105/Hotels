package com.hotel.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Type {

    STANDARD(1, "Standard"),
    PREMIUM(2, "Premium"),
    MAXIMUM(3, "Maximum");

    private Integer option;
    private String description;
}
