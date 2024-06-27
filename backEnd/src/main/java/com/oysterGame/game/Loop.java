package com.oysterGame.game;

import com.oysterGame.domains.boats.Boat;
import com.oysterGame.domains.boats.BoatRepository;
import com.oysterGame.domains.boats.BoatService;
import com.oysterGame.game.state.AbstractState;
import com.oysterGame.game.state.Moving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Loop {

//    @Autowired
    private BoatService boatService;

    public Loop(BoatService boatService) {
        this.boatService = boatService;
    }


    public void doLoop(){

        List<AbstractState> gameStates = new ArrayList<>();
        BoatRepository boatRepository;

        List<Boat> allBoats = this.boatService.getAll();
        System.out.println(allBoats);
        Moving moveState = new Moving(allBoats);
        gameStates.add(moveState);

        Game game = new Game(gameStates);
        game.run();
        System.out.println(game.toString());
    }
}
