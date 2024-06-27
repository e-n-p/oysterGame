package com.oysterGame.game.state;

import com.oysterGame.domains.beds.Bed;

import java.util.List;

public class Collecting extends AbstractState {

    private List<Bed> beds;

    public Collecting(List<Bed> beds){
        super(beds);
        this.beds = beds;
    }

    @Override
    public void update() {

    }
}
