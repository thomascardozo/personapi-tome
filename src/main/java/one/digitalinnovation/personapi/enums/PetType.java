package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PetType {

    VIRALATA("Viralatas"),
    BULLDOG("Bulldog"),
    POODLE("Poodle"),
    GOLDEN("Golden"),
    LABRADOR("Labrador"),
    BOXER("Boxer");

    private final String description;
}
