package com.example.cooldesktopapp.office;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@Entity
@Table(name = "office")
public class Office {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false)
    @EqualsAndHashCode.Exclude
    private UUID id;

    @NotBlank
    @Column(name = "country", updatable = true)
    @EqualsAndHashCode.Exclude
    private String country;

    @NotBlank
    @Column(name = "city", updatable = true)
    @EqualsAndHashCode.Exclude
    private String city;

    @NotBlank
    @Column(name = "name", updatable = true)
    @EqualsAndHashCode.Exclude
    private String name;

    @NotBlank
    @Column(name = "address", updatable = true)
    @EqualsAndHashCode.Exclude
    private String address;

    @NotBlank
    @Column(name = "parking", updatable = true)
    @EqualsAndHashCode.Exclude
    private String parking;
}
