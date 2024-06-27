package com.oysterGame;

import com.oysterGame.domains.beds.Bed;
import com.oysterGame.domains.beds.BedRepository;
import com.oysterGame.domains.beds.BedService;
import com.oysterGame.domains.boats.Boat;
import com.oysterGame.domains.boats.BoatRepository;
import com.oysterGame.domains.boats.BoatService;
import com.oysterGame.domains.captain.Captain;
import com.oysterGame.domains.captain.CaptainRepository;
import com.oysterGame.domains.captain.CaptainService;
import com.oysterGame.domains.huts.Hut;
import com.oysterGame.domains.huts.HutRepository;
import com.oysterGame.domains.huts.HutService;
import com.oysterGame.game.Loop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class GameLoopTest {

    @Mock
    private BoatRepository boatRepository;
    @Mock
    private HutRepository hutRepository;
    @Mock
    private CaptainRepository captainRepository;
    @Mock
    private BedRepository bedRepository;

    @InjectMocks
    private BoatService boatService;
    @InjectMocks
    private HutService hutService;
    @InjectMocks
    private CaptainService captainService;
    @InjectMocks
    private BedService bedService;

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

        Hut hut1 = new Hut(1L, "hutOne", 3.5f, "22,11", Arrays.asList(boat1));
        Hut hut2 = new Hut(2L, "hutTwo", 2.5f, "11,2", Arrays.asList(boat2));
        List<Hut> mockHuts = Arrays.asList(hut1, hut2);
        when(hutRepository.findAll()).thenReturn(mockHuts);

        Captain captain1 = new Captain(1L, "", "", 5, boat1);
        Captain captain2 = new Captain(2L, "", "", 10, boat2);
        List<Captain> mockCaptains = Arrays.asList(captain1, captain2);
        when(captainRepository.findAll()).thenReturn(mockCaptains);

        Bed bed1 = new Bed(1L, "", 30, 2, Arrays.asList(boat1));
        Bed bed2 = new Bed(2L, "", 10, 5, Arrays.asList(boat2));
        List<Bed> mockBeds = Arrays.asList(bed1, bed2);
        when(bedRepository.findAll()).thenReturn(mockBeds);

        Loop testLoop = new Loop(
                boatService,
                hutService,
                captainService,
                bedService
        );
        testLoop.doLoop();
        assertEquals("test","test");
    }
}
