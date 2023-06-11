package com.tablebackend.tablebackend.dto;

import jakarta.persistence.*;
import lombok.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "person")
public class PersonDTO {

    @Schema(description = "Имя", example = "Эрик")
    private String firstName;

    @Schema(description = "Фамилия", example = "Хачатрян")
    private String lastName;

    @Embedded
    private ContactsDTO contacts;

}
