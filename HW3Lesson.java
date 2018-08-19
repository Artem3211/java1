/**
 * Java. Level 1. Lesson 2. Example of homework
 *
 * @author Artem Ershov
 * @version dated august 19, 2018
 */
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число.");
        

        for(int a = 0; a <= 3; a ++) {
            playLevel(a);
        }


        scanner.close();
    }

    private static void playLevel(int main) {
        int range = 9;
        int number = (int)(Math.random() * range);
        int a = 0;
        while(a < 3) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы выиграли!");
                break;
            }

            if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            a = a + 1;
        }
        if (a == 3)
            System.out.println("Вы проиграли!");
        System.out.print("Продолжить игру?\n[1 - да / 0 - нет]: ");
        int i = scanner.nextInt();
        if (i == 0) {
            System.out.println("Спасибо за игру!");
            System.exit(0);
        }
        else {
        }


    }

    static {
        scanner = new Scanner(System.in);
    }
}
