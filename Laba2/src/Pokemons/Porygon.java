package Pokemons;

import Attacks.Physical.*;
import ru.ifmo.se.pokemon.*;
import Attacks.Status.*;


public class Porygon extends Pokemon {
    public Porygon(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(65, 60, 70, 40, 85, 75);
        super.addMove(new Facade());
        super.addMove(new Rest());
    }
}
