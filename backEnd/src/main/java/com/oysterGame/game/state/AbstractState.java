package com.oysterGame.game.state;

import java.util.List;

public abstract class AbstractState<T> {

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    private List<T> entities;

    public AbstractState(List<T> entities) {
        this.entities = entities;
    }

    public abstract void update();
}
