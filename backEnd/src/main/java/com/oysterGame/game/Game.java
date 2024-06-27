package com.oysterGame.game;

import com.oysterGame.game.state.AbstractState;

import java.util.List;

public class Game {

    private boolean isRunning = false;
    private AbstractState currentState;
    private List<AbstractState> states;

    public Game(List<AbstractState> states) {
        this.currentState = currentState;
        this.states = states;
    }

    public void run() {
        boolean gameOver = false;
        while (!gameOver) {
            for (AbstractState gameState : this.states) {
                gameState.update();
            }
            gameOver = this.stoppingCondition();
        }
    }

    public boolean stoppingCondition() {
        return false;
    }


}
