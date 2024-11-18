package Pokemons;

import Attacks.Physical.*;
import ru.ifmo.se.pokemon.*;
import Attacks.Special.*;
import Attacks.Status.*;

public class Blitzle extends Pokemon {
    public Blitzle(java.lang.String name, int lvl){
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(45, 60, 32, 50, 32, 76);
        this.addMove(new Thunderbolt());
        this.addMove(new Rest());
        this.addMove(new QuickAttack());
    }
}
