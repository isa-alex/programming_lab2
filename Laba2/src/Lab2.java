import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Porygon("Поригон", 1);
        Pokemon p2 = new Porygon2("Поригон2", 1);
        Pokemon p3 = new PorygonZ("ПоригонZ", 1);
        Pokemon p4 = new Blitzle("Близл", 1);
        Pokemon p5 = new Zebstrika("Зебстика", 1);
        Pokemon p6 = new Mewtwo("Миуту", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }
}
