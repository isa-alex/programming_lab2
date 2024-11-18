package Pokemons;

import Attacks.Special.*;
import Attacks.Status.*;
import ru.ifmo.se.pokemon.*;

public class Mewtwo extends Pokemon {
    public Mewtwo(String name, int lvl){
        super(name, lvl);
        setStats(106,110,90,154,90,130);
        addMove(new Swift());
        addMove(new Flamethrower());
        addMove(new ShadowBall());
        addMove(new Amnesia());
    }
}
