package Main;

import Hero.*;
import MovingType.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        play();
    }

    static void play() {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();

        int userInput;

        System.out.println("Введите что-нибудь (для выхода введите 0):");

        while (true) {
            userInput = scanner.nextInt();

            if (userInput == 0) {
                System.out.println("Герой дошел.");
                break;
            } else if (userInput == 1){
                hero.setMoving(new OnFootMove());
            } else if (userInput == 2){
                hero.setMoving(new HorseMove());
            } else if (userInput == 3){
                hero.setMoving(new FlightMove());
            } else {
                System.out.println("Герой так не умеет!");
                continue;
            }

            hero.move();
        }
        scanner.close();
    }
}
