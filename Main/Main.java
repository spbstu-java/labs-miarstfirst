package Main;

import Hero.*;
import MovingType.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero();

        hero.setMoving(new OnFootMove());
        hero.move();
        hero.move();
        hero.move();

        hero.setMoving(new HorseMove());
        hero.move();
        hero.move();

        hero.setMoving(new FlightMove());
        hero.move();
        hero.move();
        hero.move();
        hero.move();

        hero.setMoving(new FlightMove());

    }
}
