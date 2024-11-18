package Pokemons;

import Attacks.Special.ZapCannon;

public class PorygonZ extends Porygon2{
    public PorygonZ(String name, int lvl) {
        super(name, lvl);
        setStats(85, 80, 70, 135, 75, 90);
        addMove(new ZapCannon());
    }
}
