package com.example.cooldesktopapp.user;

import com.example.cooldesktopapp.workplace.Workplace;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User {
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
    @Length(min = 5, max = 64)
    @Column(name = "username", unique = true)
    private String username;

    @NotBlank
    @Column(name = "first_name", updatable = true)
    @EqualsAndHashCode.Exclude
    private String name;

    @NotBlank
    @Column(name = "last_name", updatable = true)
    @EqualsAndHashCode.Exclude
    private String lastName;

    @NotBlank
    @Column(name = "email", updatable = true)
    @EqualsAndHashCode.Exclude
    private String email;

    @NotBlank
    @Column(name = "employment_start", updatable = true)
    @EqualsAndHashCode.Exclude
    private LocalDate employmentStart;

    @NotBlank
    @Column(name = "employment_end", updatable = true)
    @EqualsAndHashCode.Exclude
    private LocalDate employmentEnd;

    @ManyToOne
    @Column(name = "preferrred_workplace_id", updatable = false)
    @EqualsAndHashCode.Exclude
    private Workplace preferredWorkPlaceId;

}
