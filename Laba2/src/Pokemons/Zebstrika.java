package Pokemons;

import Attacks.Special.Overheat;

public class Zebstrika extends Blitzle{
    public Zebstrika(String name, int lvl){
        super(name, lvl);
        setStats(75,100, 63, 80, 63, 116);
        addMove(new Overheat());
    }
}
