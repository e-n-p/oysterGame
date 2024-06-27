package com.oysterGame.game.state;

import com.oysterGame.domains.boats.Boat;

import java.util.List;

public class Moving extends AbstractState<Boat>{


    public Moving(List<Boat> entities) {
        super(entities);
    }

    @Override
    public void update() {
        System.out.println("moving");
    }
}
