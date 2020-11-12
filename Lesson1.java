package RU.GeekBrains.gb;

import java.util.Arrays;

public class Lesson1 {
// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().

    public static void main (String[] args) {

       /* // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения.

        //Целочисленные:
        byte qwe = 2;
        short asd = 6;
        int zxc = 11;
        long qaz = 15;

        //С плавающей точкой:
        float wer = 1.25f;
        double sdf = 3.16;

        //Символы:
        char xcv = 'f';

        //Логический:
        boolean asx = false; */

        float z;
        float s;

        z = definitionSumMet(2f, 22f, 10f, 3f);
        s = definitionSumMet(4f, 5f, 9f, 3f);

        System.out.println("1. Результат " + z + "\n2. Резуьтат " + s);

        definitionLogicMet(24, 3);
        definitionLogicMet(1, 18);

        definitionPositiveMet(156);
        definitionPositiveMet(-55);
        definitionPositiveMet(0);

        definitionNegativeMet(56);
        definitionNegativeMet(-11);

        helloMyNameMet("Ростислав!»");

        definitionLeapMet(2020);
        definitionLeapMet(1990);
        definitionLeapMet(1666);
        definitionLeapMet(2000);
    }

    /* 3. Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат, где a, b, c, d – входные параметры этого метода; */

    public static float definitionSumMet(float a, float b, float c, float d) {
        return  a * (b + (c / d));
    }
    /* 4. Написать метод, принимающий на вход два числа, и проверяющий что их
    сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true,
    в противном случае – false. */ //...ИСПРАВЛЕННАЯ...//

    public static void definitionLogicMet (int a, int b) {

    int g = (a + b);
        if (g >= 10 && g <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /* 5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом. */

    public static void definitionPositiveMet (int p) {

        if( p >= 0 ) {
            System.out.println("Положительное число " + p);
        } else {
            System.out.println("Отрицательное число " + p);
        }
    }

    /* 6. Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true, если число отрицательное; */

    public static  void definitionNegativeMet (int i) {

        if ( i < 0 ) {
            System.out.println("true");
        }
    }

    /* 7. Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;  */

    public static void helloMyNameMet(String hello) {
        System.out.println("«Привет, " + hello);
    }

    /* 8. * Написать метод, который определяет является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный. */

    public static void definitionLeapMet(int year ) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Високосный");
        }
    }
}

