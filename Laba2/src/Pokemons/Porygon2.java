package Pokemons;

import Attacks.Status.DefenceCurl;

public class Porygon2 extends Porygon{
    public Porygon2(String name, int lvl){
        super(name, lvl);
        setStats(85, 80, 90, 105, 95, 60);
        addMove(new DefenceCurl());
    }
}
