package com.oysterGame.domains.beds;

import com.oysterGame.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bed")
@RequiredArgsConstructor
public class BedController extends AbstractController<Bed> {

    @Autowired
    private BedService bedService;
}
