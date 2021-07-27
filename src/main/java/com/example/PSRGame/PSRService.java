package com.example.PSRGame;

import org.springframework.stereotype.Service;

@Service
public class PSRService {

    private GameUnit answer;

    public GameUnit play(GameUnit unit) {

        switch (unit) {
            case ROCK:
                answer = GameUnit.PAPER;
                break;

            case PAPER:
                answer = GameUnit.SCISSORS;
                break;

            case SCISSORS:
                answer = GameUnit.ROCK;
                break;
        }
        return answer;
    }
}
