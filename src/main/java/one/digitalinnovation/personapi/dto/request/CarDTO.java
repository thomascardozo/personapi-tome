package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.CarType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private CarType type;

    @NotEmpty
    private String marca;

    @NotEmpty
    private String modelo;

    @NotEmpty
    private String cor;

    @NotEmpty
    private String placa;

    @NotNull
    @Min(value = 1850, message = "ano invalido")
    @Max(value = 2020, message = "ano invalido")
    private Integer anoFabricacao;
}
