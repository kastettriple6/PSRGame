package com.example.PSRGame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private PSRService service;

    @GetMapping("/{unit}")
    public GameUnit playGame(@PathVariable GameUnit unit) {
        return service.play(unit);
    }
}
