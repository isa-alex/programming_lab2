import ru.ifmo.se.pokemon.*;
import Pokemons.Porygon;


public class FightsSimulator {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Porygon("Porygon", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
