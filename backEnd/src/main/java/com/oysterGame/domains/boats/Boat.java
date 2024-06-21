package com.oysterGame.domains.boats;

import com.oysterGame.domains.beds.Bed;
import com.oysterGame.domains.captain.Captain;
import com.oysterGame.domains.huts.Hut;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Boat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String model;
    private int capacity;
    private int speed;

    @OneToOne
    @JsonIgnoreProperties("boat")
    private Captain captain;

    @ManyToOne
    @JsonIgnoreProperties("boats")
    private Hut hut;

    @ManyToMany
    @JsonIgnoreProperties("boats")
    private List<Bed> beds;
}
