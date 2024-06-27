package com.oysterGame;

import com.oysterGame.databaseInit.DatabaseInit;
import com.oysterGame.domains.boats.Boat;
import com.oysterGame.domains.boats.BoatRepository;
import com.oysterGame.domains.boats.BoatService;
import com.oysterGame.game.Loop;
import com.oysterGame.game.state.AbstractState;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class GameLoopTest {

    @Mock
    private BoatRepository boatRepository;

    @InjectMocks
    private BoatService boatService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void TestLoop(){

        Boat boat1 = new Boat(1L, "Kappa", "Yamaha", 30, 2, null, null, null);
        Boat boat2 = new Boat(2L, "Tau", "mitsubishi", 10, 5, null, null, null);
        List<Boat> mockBoats = Arrays.asList(boat1, boat2);

        when(boatRepository.findAll()).thenReturn(mockBoats);

//        List<Boat> allBoats = boatService.getAll();
        // Creating the game states
//        List<AbstractState> gameStates = new ArrayList<>();
//        Moving moveState = new Moving(allBoats);
//        gameStates.add(moveState);


        Loop testLoop = new Loop(
                boatService
        );
        testLoop.doLoop();
        assertEquals("test","test");
    }
}
