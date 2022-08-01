package ro.esolutions.testing.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ClientModel {

    private Long id;

    @NotBlank
    private String name;
}
