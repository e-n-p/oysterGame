package com.oysterGame.domains.boats;

import com.oysterGame.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boat")
@RequiredArgsConstructor
public class BoatController extends AbstractController<Boat> {

    @Autowired
    private BoatService boatService;
}
