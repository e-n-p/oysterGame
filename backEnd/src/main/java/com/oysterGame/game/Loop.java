package com.oysterGame.game;

import com.oysterGame.domains.beds.Bed;
import com.oysterGame.domains.beds.BedService;
import com.oysterGame.domains.boats.Boat;
import com.oysterGame.domains.boats.BoatRepository;
import com.oysterGame.domains.boats.BoatService;
import com.oysterGame.domains.captain.Captain;
import com.oysterGame.domains.captain.CaptainService;
import com.oysterGame.domains.huts.Hut;
import com.oysterGame.domains.huts.HutService;
import com.oysterGame.game.state.AbstractState;
import com.oysterGame.game.state.Collecting;
import com.oysterGame.game.state.Moving;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Loop {

    private BoatService boatService;
    private HutService hutService;
    private CaptainService captainService;
    private BedService bedService;

    public Loop(BoatService boatService, HutService hutService, CaptainService captainService, BedService bedService) {
        this.boatService = boatService;
        this.hutService = hutService;
        this.captainService = captainService;
        this.bedService = bedService;
    }


    public void doLoop(){

        List<AbstractState> gameStates = new ArrayList<>();

        List<Boat> allBoats = this.boatService.getAll();
        List<Hut> allHuts = this.hutService.getAll();
        List<Captain> allCaptains = this.captainService.getAll();
        List<Bed> allBeds = this.bedService.getAll();

        Moving moveState = new Moving(allBoats); //return positions here
        Collecting collectingState = new Collecting(allBeds); 

        gameStates.add(moveState);
        gameStates.add(collectingState);

        Game game = new Game(gameStates);
        game.run();
    }


    private Map<String, String> getAllLocations(){
        Map<String, String> positions = new HashMap<String, String>();
        return positions;
    }


}
