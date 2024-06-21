package com.oysterGame.domains.huts;

import com.oysterGame.domains.boats.Boat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private float price;
    private String location;

    @OneToMany
    @JsonIgnoreProperties("hut")
    private List<Boat> boats;
}
