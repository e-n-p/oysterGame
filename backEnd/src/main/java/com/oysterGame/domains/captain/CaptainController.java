package com.oysterGame.domains.captain;

import com.oysterGame.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/captain")
@RequiredArgsConstructor
public class CaptainController extends AbstractController<Captain> {

    @Autowired
    private CaptainService captainService;
}
