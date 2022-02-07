package com.example.cooldesktopapp.map;

import com.example.cooldesktopapp.office.Office;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@Entity
@Table(name = "map")
public class Map {
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
    @Column(name = "office_id", updatable = false)
    @EqualsAndHashCode.Exclude
    private Office officeId;

    @NotBlank
    @Column(name = "floor", updatable = true)
    @EqualsAndHashCode.Exclude
    private String floor;

    @NotBlank
    @Column(name = "kitchen", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean kitchen;

    @NotBlank
    @Column(name = "confRooms", updatable = true)
    @EqualsAndHashCode.Exclude
    private String confRooms;
}