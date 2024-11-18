package Attacks.Special;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    protected String describe() {
        return "использует специальную атаку Thunderbolt";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().chance(0.1).condition(Status.PARALYZE));
    }
}
