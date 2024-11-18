package Attacks.Special;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setCondition(new Effect().chance(0.1).condition(Status.BURN));
    }
}
