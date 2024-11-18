package Attacks.Special;

import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove {
    public ZapCannon(){
        super(Type.ELECTRIC, 120, 50);
    }
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.DEFENSE, 1);
        p.addEffect(e);
    }
}

