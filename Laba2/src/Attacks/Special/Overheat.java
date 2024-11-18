package Attacks.Special;

import ru.ifmo.se.pokemon.*;


public class Overheat extends SpecialMove {
    public Overheat() {
        super(Type.FIRE, 130,90);
    }
    protected void applySelfEffects(Pokemon pokemon){
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        pokemon.addEffect(e);
    }
}
