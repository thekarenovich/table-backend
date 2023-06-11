package com.tablebackend.tablebackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="phone", nullable = false)
    private String phone;
}
