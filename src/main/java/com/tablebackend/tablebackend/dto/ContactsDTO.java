package com.tablebackend.tablebackend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactsDTO {

    @Schema(description = "Почта", example = "thekarenovich@yandex.ru")
    private String email;

    @Schema(description = "Телефон", example = "+79659091234")
    private String phone;
}
