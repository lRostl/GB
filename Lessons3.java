package RU.GeekBrains.gb;

import java.util.Random;
import java.util.Scanner;

/** Делать только одну задачу
 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю
 дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше
 ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
 выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

 2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
 "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
 "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
 При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
 сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
 компьютер показывает буквы которые стоят на своих местах.
 apple – загаданное
 apricot - ответ игрока
 ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 Для сравнения двух слов посимвольно, можно пользоваться:
 String str = "apple";
 str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
 Играем до тех пор, пока игрок не отгадает слово
 Используем только маленькие буквы **/


public class Lessons3 {

    public static void main(String[] args) {

        /** Выполненное только первое задание **/

        System.out.println("Игра угадай число от 0 до 9.");
        checkRandomUserNumber();

    }

    static void checkRandomUserNumber() {
        Random random = new Random();
        int userNumber;
        int yes = 1;
        int no = 0;
        int repeat;
        do {
            int maxTryCount = 3;
            int tryCount = 0;
            int thoughtNumber = random.nextInt(10);

            do {
                System.out.println("Попыток сейчас у Вас: " + maxTryCount);
                userNumber = scannerNumberUser();
                if (userNumber == thoughtNumber) {
                    System.out.println("Вы угадали!");
                    break;
                }
                else if (userNumber > thoughtNumber) {
                    maxTryCount--;
                    System.out.println("Ваше число больше загаданного.");// \nПопыток осталось: " + maxTryCount);

                } else if (userNumber < thoughtNumber) {
                    maxTryCount--;
                    System.out.println("Ваше число меньше загаданного."); // \nПопыток осталось: " + maxTryCount);
                }
                if (tryCount == maxTryCount) {
                    System.out.println("Вы проиграли! \nПравильный ответ был: " + thoughtNumber);
                    break;
                }

            } while (tryCount == maxTryCount || userNumber != thoughtNumber);

            System.out.println("Сыграем еще раз? \n1 - ДА. 0 - НЕТ.");
            repeat = scannerNumberUser();

            if(repeat == yes) {
                System.out.println("Отлично! Продолжаем...");
            } else if (repeat == no) {
                System.out.println("Досвидания!");
            }

        } while (repeat != no);
    }

    static int scannerNumberUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число...");

        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Введите целое число!");
                scanner.nextLine();
            }
        } while (true);
    }
}
