package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CarType {

    SEDAN("Sedan"),
    COUPE("Coupe"),
    SPORT("Sport"),
    PICKUP("Pickup"),
    HATCH("Hatch"),
    SUV("Suv");

    private final String description;
}
