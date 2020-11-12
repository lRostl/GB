package RU.GeekBrains.gb;

import java.util.Arrays;

public class Lesson2 {

    public static class Main {

        public static void main(String[] args) {

            /** 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
             Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; **/

            System.out.println("Задание №1: ");
            int[] binMas = {0, 1, 1, 0, 0, 1, 0, 1, 1, 0};
            numberBinMas(binMas);
            System.out.println(Arrays.toString(binMas));

            /** 2. Задать пустой целочисленный массив размером 8.
             С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; **/

            System.out.println("Задание №2: ");
            int[] completionMas = new int[8];
            fullCompletionMasMultiplication3(completionMas);
            System.out.println(Arrays.toString(completionMas));

            /**3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
             пройти по нему циклом, и числа меньшие 6 умножить на 2; **/

            System.out.println("Задание №3: ");
            int[] search6Mion2Mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            choice6Multiplication2Mas(search6Mion2Mas);
            System.out.println(Arrays.toString(search6Mion2Mas));

            /** 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
             и с помощью цикла(-ов) заполнить его диагональные элементы единицами; **/
            //Сразу скажу, окончательно не понял что это, зачем и как это. Подглядел, но так и не разобрался.
            System.out.println("Задание №4: ");
            int[][] cvadr2MerMas = new int[3][3];
            cvadrMasDiagonalEqually1(cvadr2MerMas);
            System.out.println('\n');


            /** 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета); **/

            System.out.println("Задание №5: ");
            int[] searchMinMax = {0, 11, 22, 5, 6, 4};
            oneMasSearchMinMax(searchMinMax);
            System.out.println(Arrays.toString(searchMinMax));

            /** 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
             *  если в массиве есть место, в котором сумма левой и правой части массива равны.
             *  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
             *  граница показана символами ||, эти символы в массив не входят. **/

            /* Не понимаю как он определяет начало левой и правой части массива. Хотел в начале метода написать
             * sum1 = fullWholeMasBalanse[0 + 1 + 2 + 3] и sum2 = fullWholeMasBalanse[4 + 5]. Но как просмотрел пример решения
             * окончательно запутался. Мы проходим все значения, и вторым for снова пробегаемся, но с значением +1...
             * В методе первый for идет слева на право, а второй for справа на лево, так получается? */

            System.out.println("Задание №6");
            int[] fullWholeMasBalance = {5, 3, 2, 10, 15, 5};
            boolean balance = hasresultСhecksInBalance(fullWholeMasBalance);
            System.out.println("Верно ли, что правая и левая части равны? " + balance);

            /** 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
             * или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи
             * нельзя пользоваться вспомогательными массивами. **/
            System.out.println("Задание № 7: ");
            int [] fullOneDimensionalMas = {2, 4, 7, 9};
            offsetElementsMasN(fullOneDimensionalMas);

        }

        /**
         * Задание №1
         **/

        public static void numberBinMas(int[] binMas) {

            for (int i = 0; i < binMas.length; i++) {

                if (binMas[i] == 0) {
                    binMas[i] = 1;
                } else {
                    binMas[i] = 0;
                }
            }
        }

        /**
         * Задание №2
         **/

        public static void fullCompletionMasMultiplication3(int[] completionMas) {

            for (int i = 0; i < completionMas.length; i++) {
                completionMas[i] = i * 3;
            }
        }

        /**
         * Задание №3
         **/

        public static void choice6Multiplication2Mas(int[] search6Mion2Mas) {
            for (int a = 0; a < search6Mion2Mas.length; a++) {
                if (search6Mion2Mas[a] < 6) {
                    search6Mion2Mas[a] = search6Mion2Mas[a] * 2;
                }
            }
        }

        /**
         * Задание №4
         **/

        public static void cvadrMasDiagonalEqually1(int[][] cvadr2MerMas) {
            for (int i = 0; i < cvadr2MerMas.length; i++) {
                for (int j = 0, x = cvadr2MerMas[i].length - 1; j < cvadr2MerMas[i].length; j++, x--) {
                    if (i == j || i == x) cvadr2MerMas[i][j] = 1;
                    else cvadr2MerMas[i][j] = 0;
                    System.out.print(cvadr2MerMas[i][j] + " ");
                }
            }
        }

        /**
         * Задание №5
         **/

        public static void oneMasSearchMinMax(int[] searchMinMax) {

            int max = searchMinMax[0];
            int min = searchMinMax[0];

            for (int i = 0; i < searchMinMax.length; i++) {
                if (min > searchMinMax[i]) {
                    min = searchMinMax[i];
                } else if (max < searchMinMax[i]) {
                    max = searchMinMax[i];
                }
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }

        /**
         * Задание №6
         **/

        public static boolean hasresultСhecksInBalance(int[] fullWholeMasBalance) {

            int sum1 = 0;

            for (int i = 0; i < fullWholeMasBalance.length; i++) {
                sum1 += fullWholeMasBalance[i];

                int sum2 = 0;
                for (int k = (i + 1); k < fullWholeMasBalance.length; k++) {
                    sum2 += fullWholeMasBalance[k];
                }
                if (sum1 == sum2) {
                    return true;
                }
            }
            return false;
        }

        /**Задание №7**/

        public static void offsetElementsMasN(int[] fullOneDimensionalMas){

            int swap = fullOneDimensionalMas[0];
            fullOneDimensionalMas[0] = fullOneDimensionalMas[fullOneDimensionalMas.length - 1];
            for(int go = 1; go < fullOneDimensionalMas.length - 1 ; go++) {
                fullOneDimensionalMas[fullOneDimensionalMas.length - go] = fullOneDimensionalMas[fullOneDimensionalMas.length - go - 1];
            }
            fullOneDimensionalMas[1] = swap;
            System.out.println(Arrays.toString(fullOneDimensionalMas));
        }

    }

}


