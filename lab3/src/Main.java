import Dictionary.Dictionary;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary("src/resources/d1.txt");
//        new Dictionary("src/resources/d2.doc"); // упадет с исключением InvalidFileFormatException

        System.out.println("Введите текст:");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        System.out.println(
                Objects.equals(line, "") ?
                    "Ничего не введено!" :
                    "Перевод: " + d1.translate(line)
            );

    }
}
