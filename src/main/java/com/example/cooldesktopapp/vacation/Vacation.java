package com.example.cooldesktopapp.vacation;


import com.example.cooldesktopapp.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class Vacation {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false)
    @EqualsAndHashCode.Exclude
    private UUID id;

    @OneToMany
    @Column(name = "user_id", updatable = true)
    @EqualsAndHashCode.Exclude
    private Set<User> preferredWorkPlaceIds;

    @NotBlank
    @Column(name = "vacation_start", updatable = true)
    @EqualsAndHashCode.Exclude
    private LocalDate vacationStart;

    @NotBlank
    @Column(name = "vacation_end", updatable = true)
    @EqualsAndHashCode.Exclude
    private LocalDate vacation_end;
}
