package HW2Lessons;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Staffer {

/** Поля **/

    String fullName;    /** ФИО **/
    String position;    /** Должность **/
    String address;     /** email **/
    String telephone;   /** Телефон **/
    int salary;         /** Зарплата **/
    int age;            /** Возраст **/

/** Конструктор **/

    Staffer(String fullName, String position, String address, String telephone, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.address = address;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

/** Вывод инфо об объекте **/

    public void outputStaffer(){

        System.out.println("Сотрудник: " + fullName + "\nДолжность: " + position + "\nemail:     " + address +
                "\nТелефон:   " + telephone + "\nЗарплата:  " + salary + "\nВозраст:   " + age + "\n");

    }

/** Обозначение для вывода сотрудников >40 лет **/

    public int filterAge(){

        return age;

    }
}
