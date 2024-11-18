package Attacks.Status;

import ru.ifmo.se.pokemon.*;

public class DefenceCurl extends StatusMove {
    public DefenceCurl(){
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect e = new Effect().stat(Stat.DEFENSE, 1);
        pokemon.addEffect(e);
    }
}
