package Attacks.Status;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    public Amnesia(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, 2);
        p.addEffect(e);
    }
}
