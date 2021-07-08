package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PetType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PetType type;

    @NotEmpty
    private String name;

    @NotEmpty
    private String color;

    @NotNull
    @Min(value = 1, message = "idade minima canina")
    @Max(value = 50, message = "idade maxima canina")
    private Integer age;
}
