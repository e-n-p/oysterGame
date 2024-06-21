package com.oysterGame.domains.beds;

import com.oysterGame.domains.boats.Boat;
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
public class Bed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private int age;
    private int basketCount;


    @ManyToMany
    @JsonIgnoreProperties("beds")
    private List<Boat> boats;
}
