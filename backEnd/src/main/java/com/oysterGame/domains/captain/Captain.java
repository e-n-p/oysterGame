package com.oysterGame.domains.captain;

import com.oysterGame.domains.boats.Boat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Captain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String licence;
    private String name;
    private int experience;

    @OneToOne
    @JsonIgnoreProperties("captain")
    private Boat boat;

}
