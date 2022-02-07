package com.example.cooldesktopapp.workplace;


import com.example.cooldesktopapp.map.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@Entity
@Table(name = "workplace")
public class Workplace {
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
    @Column(name = "map_id", updatable = false)
    @EqualsAndHashCode.Exclude
    private Map map;

    @NotBlank
    @Column(name = "workplace_number", updatable = true)
    @EqualsAndHashCode.Exclude
    private Integer workplaceNumber;

    @NotBlank
    @Column(name = "type", updatable = true)
    @EqualsAndHashCode.Exclude
    private String type;

    @NotBlank
    @Column(name = "next_to_window", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean nextToWindow;

    @NotBlank
    @Column(name = "has_pc", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean hasPc;

    @NotBlank
    @Column(name = "has_monitor", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean hasMonitor;

    @NotBlank
    @Column(name = "has_keyboard", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean hasKeyboard;

    @NotBlank
    @Column(name = "has_mouse", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean hasMouse;

    @NotBlank
    @Column(name = "has_headset", updatable = true)
    @EqualsAndHashCode.Exclude
    private Boolean hasHeadset;
}
