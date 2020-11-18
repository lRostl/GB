package RU.GeekBrains.gb;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    static char[][] map;
    static final int VALUE = 3; // можно сделать вариант универсальный, с вводом значения usera

    static final char FILL_NULL = '.';
    static final char FILL_X = 'X';
    static final char FILL_O = 'O';

    /** 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
     2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
     например, с использованием циклов.
     3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5
     и победного ряда 4 (по вертикали/горизонтали/диагонали).
     Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
     4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
     **/

    public static void main (String[] args) {

        // Инициализация поля игры
        initMap();
        // Вывод полян на экран
        outputMap();
        // Цикл
    while (true) {
        // Ход человека
        humanStep();
        // Вывод куда сходил
        outputMap();
        // Проверка победы
        if(checkWin(FILL_X)) {
            System.out.println("Победил человек");
            break;
        }
        // Проверка ничьи
        if (checkDraw()) {
            System.out.println("Ничья");
            break;
        }

        // Ход ИИ
        machineStep();
        // Вывод куда сходил
        outputMap();
        // Проверка победы
        if (checkWin(FILL_O)){
            System.out.println("Победила машина");
            break;
        }
        // Проверка ничьи
        if (checkDraw()) {
            System.out.println("Ничья");
            break;
        }
    }

    }
    /** Инициализация поля **/
    static void initMap(){
        map = new char[VALUE][VALUE];
        for (int сap = 0; сap < VALUE; сap++){
            for (int сolumns = 0; сolumns < VALUE; сolumns++){
                map[сap][сolumns] = FILL_NULL;
            }
        }
    }

    /** Вывод поля **/
    public static void outputMap(){
        for(int q = 0; q <= VALUE; q++){
            System.out.print(q + " ");
        }
        System.out.println();

        for(int cap = 0; cap < VALUE; cap++){
            System.out.print((cap + 1) + " ");

            for(int сolumns = 0; сolumns < VALUE; сolumns++) {
                System.out.print(map[cap][сolumns] + " ");
            }
            System.out.println();
        }

    }

/** Ход игрока **/

    public static void humanStep(){

        int x;
        int y;

        do {
            System.out.println("Введите координаты X и Y в формате целых чисел от 1 до 3.");
            int userSC = scannerUser();
            x = userSC - 1;
            y = userSC - 1;
            /** Не понимаю почему выводит не правильно значения на поле. И сразу выйграл человек. Дальше программа не идет. **/
        } while (!inputChek(x, y));
        map[x][y] = FILL_X;
    }

/** Проверка на целое число **/

    static int scannerUser() {
        Scanner scanner = new Scanner(System.in);

        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ввели не верный формат. Пробуем еще раз.");
                scanner.nextLine();
            }
        } while (true);
    }

/** Проверка ввода ячейки **/

    public static boolean inputChek(int x, int y){
//попробуй вариант с x<= 0 & x > value
        if(x < 0 || x >= VALUE || y < 0 || y >= VALUE) {
            return false;
        }
        if(map[x][y] == FILL_NULL){
            return true;
        }
        return false;
    }

    /** Ход ИИ **/

    public static void machineStep(){

        Random rm = new Random();
        int x;
        int y;

        do {
            System.out.println("Ход машины");
            x = rm.nextInt(VALUE);
            y = rm.nextInt(VALUE);
        } while (!inputChekMachine(x,y));
        map[x][y] = FILL_O;
        //System.out.println(outputMap()); Нужно как то вывести результат хода машины
    }

    /** Проверка ввода ячейки **/

    public static boolean inputChekMachine(int x, int y){
//попробуй вариант с x<= 0 & x > value
        if(x < 0 || x >= VALUE || y < 0 || y >= VALUE) {
            return false;
        }
        if(map[x][y] == FILL_NULL){
            return true;
        }
        return false;
    }

/** Проверка на победу **/

    static boolean checkWin(char number){

        for(int i = 0; i < VALUE; i++){

            if((map[i][0] == number || map[i][1] == number || map[i][2] == number) ||
            (map[0][i] == number || map[1][i] == number || map[2][i] == number))
            return true;

            if((map[0][0] == number || map[1][1] == number|| map[2][2] == number) ||
            (map[2][0] == number || map[1][1] == number || map[0][2] == number))
            return true;
        }
        return false;
    }

/** Проверка на ничью **/

    static boolean checkDraw(){

        for(int x = 0; x < VALUE; x++){
            for(int y = 0; y < VALUE; y++) {
                map[x][y] = FILL_NULL;
                System.out.println("Ничья!");
                return false;
            }
        }
        return true;

    }

}
