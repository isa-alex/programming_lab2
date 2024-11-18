package Attacks.Physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(){
        super(Type.NORMAL, 40, 100);
    }

    protected String describe(){
        return "использует физическую атаку Quick Attack";
    }
}
