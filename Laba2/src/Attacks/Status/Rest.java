package Attacks.Status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setCondition(new Effect().condition(Status.SLEEP).turns(2));
    }
}
