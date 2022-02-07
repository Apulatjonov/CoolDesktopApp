package com.example.cooldesktopapp.booking;


import com.example.cooldesktopapp.office.Office;
import com.example.cooldesktopapp.user.User;
import com.example.cooldesktopapp.workplace.Workplace;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class Booking {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false)
    @EqualsAndHashCode.Exclude
    private UUID id;

    @ManyToOne
    @Column(name = "workplace_id", updatable = false)
    @EqualsAndHashCode.Exclude
    private Workplace workplaceId;

    @ManyToOne
    @Column(name = "user_id", updatable = false)
    @EqualsAndHashCode.Exclude
    private User userId;

    @NotBlank
    @Column(name = "start_date", updatable = true)
    @EqualsAndHashCode.Exclude
    private LocalDate startDate;

    @NotBlank
    @Column(name = "end_date", updatable = true)
    @EqualsAndHashCode.Exclude
    private LocalDate endDate;

    @NotBlank
    @Column(name = "is_recurring", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean isRecurring;

    @NotBlank
    @Column(name = "frequency", updatable = true)
    @EqualsAndHashCode.Exclude
    private Integer frequency;
}
